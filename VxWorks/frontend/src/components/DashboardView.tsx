import React, {useCallback, useEffect, useMemo, useState} from 'react';
import {ValueRow} from '../types';
import api from '../api';
import {Bar, BarChart, CartesianGrid, LabelList, Legend, Line, LineChart, ResponsiveContainer, Tooltip, XAxis, YAxis} from 'recharts';

interface DashboardViewProps {
    selectedRow: ValueRow | null;
    selectedHostId: number | null;
    onSelectRow?: (row: ValueRow | null) => void;
}

// Custom label component for bars
const CustomBarLabel = (props: any) => {
    const {x, y, width, value} = props;
    return (
        <g>
            <text
                x={x + width / 2}
                y={y - 12}
                fill="#fff"
                textAnchor="middle"
                dominantBaseline="middle"
                fontSize={18}
                fontWeight="bold"
                stroke="#000"
                strokeWidth="0.75"
                style={{textShadow: "0px 0px 3px #000"}}>
                {value}
            </text>
        </g>
    );
};

const DashboardView: React.FC<DashboardViewProps> = ({selectedRow, selectedHostId, onSelectRow}) => {
    type ViewMode = 'row' | 'month';

    // View mode state
    const [viewMode, setViewMode] = useState<ViewMode>('row');

    // Use host from left-side HostsView
    const hostId: number | null = selectedHostId ?? null;
    const createdIso: string | null = (selectedRow as any)?.created ?? null;

    // Month value in YYYY-MM format
    const [monthValue, setMonthValue] = useState<string>(() => {
        const d = createdIso ? new Date(createdIso) : new Date();
        const y = d.getFullYear();
        const m = String(d.getMonth() + 1).padStart(2, '0');
        return `${y}-${m}`;
    });

    useEffect(() => {
        // When selected row changes, update month selector to that row's month
        if (createdIso) {
            const d = new Date(createdIso);
            const y = d.getFullYear();
            const m = String(d.getMonth() + 1).padStart(2, '0');
            setMonthValue(`${y}-${m}`);
        }
    }, [createdIso]);

    // Monthly data fetching
    interface ApiValueRow {
        id: number;
        created: string;
        host: number;

        [key: string]: unknown;
    }

    const [monthlyRows, setMonthlyRows] = useState<ApiValueRow[]>([]);
    const [loading, setLoading] = useState<boolean>(false);
    const [error, setError] = useState<string | null>(null);

    const fetchMonthlyData = useCallback(async () => {
        if (!hostId || !monthValue) {
            setMonthlyRows([]);
            return;
        }
        setLoading(true);
        setError(null);
        try {
            const [yearStr, monthStr] = monthValue.split('-');
            const year = Number(yearStr);
            const monthIndex = Number(monthStr) - 1; // 0-based
            const monthStart = new Date(Date.UTC(year, monthIndex, 1, 0, 0, 0));
            const monthEnd = new Date(Date.UTC(year, monthIndex + 1, 0, 23, 59, 59));

            const acc: ApiValueRow[] = [];
            let page = 1;
            const per_page = 100;
            let stop = false;

            while (!stop) {
                const resp = await api.get(`/hosts/${hostId}/values`, {
                    params: {page, per_page, sort_by: 'created', sort_order: 'desc'}
                });
                const values: ApiValueRow[] = resp.data?.values ?? [];

                if (values.length === 0) break;

                // Filter rows that belong to the selected month (UTC compare)
                for (const row of values) {
                    const d = new Date(row.created);
                    if (d >= monthStart && d <= monthEnd) {
                        acc.push(row);
                    } else if (d < monthStart) {
                        // Since results are sorted desc, once below month start we can stop
                        stop = true;
                        break;
                    }
                }

                // If fewer than per_page or we decided to stop, break
                if (values.length < per_page || stop) break;
                page += 1;
            }

            setMonthlyRows(acc);
        } catch (e) {
            console.error(e);
            setError('Не удалось загрузить данные за месяц.');
            setMonthlyRows([]);
        } finally {
            setLoading(false);
        }
    }, [hostId, monthValue]);

    useEffect(() => {
        if (viewMode === 'month') {
            void fetchMonthlyData();
        }
    }, [viewMode, fetchMonthlyData]);

    useEffect(() => {
        // If month changes while in month mode, refetch
        if (viewMode === 'month') {
            void fetchMonthlyData();
        }
    }, [monthValue, viewMode, fetchMonthlyData]);

    // Extract numeric values from the selected row for display
    const barData = selectedRow
        ? Object.entries(selectedRow)
            .filter(([key, value]) => typeof value === 'number' && key.startsWith('sv_'))
            .map(([key, value]) => ({name: key, value: value as number}))
        : [];

    // Determine metric keys for charts (prefer keys from selected row, fallback to first monthly row)
    const metricKeys: string[] = useMemo(() => {
        const fromRow = selectedRow
            ? Object.keys(selectedRow).filter(k => k.startsWith('sv_'))
            : [];
        if (fromRow.length > 0) return fromRow;
        const first = monthlyRows[0];
        if (!first) return [];
        return Object.keys(first).filter(k => k.startsWith('sv_'));
    }, [selectedRow, monthlyRows]);

    // Build daily averages dataset for the selected month (average across all metrics)
    const dailyAvgData = useMemo(() => {
        if (!monthValue) return [] as Array<Record<string, number | undefined>>;
        const [yearStr, monthStr] = monthValue.split('-');
        const year = Number(yearStr);
        const monthIndex = Number(monthStr) - 1; // 0-based
        const daysInMonth = new Date(year, monthIndex + 1, 0).getDate();

        // Initialize arrays for per-day total sum across metrics and count of values
        const daySums: number[] = Array.from({length: daysInMonth}, () => 0);
        const dayCounts: number[] = Array.from({length: daysInMonth}, () => 0);

        for (const row of monthlyRows) {
            const d = new Date(row.created);
            if (d.getUTCFullYear() !== year || d.getUTCMonth() !== monthIndex) continue;
            const dayIdx = d.getUTCDate() - 1; // 0-based index
            for (const key of metricKeys) {
                const v = row[key] as number | null | undefined;
                if (typeof v === 'number' && !Number.isNaN(v)) {
                    daySums[dayIdx] += v;
                    dayCounts[dayIdx] += 1;
                }
            }
        }

        // Compose final dataset with averages across all metrics
        const data = Array.from({length: daysInMonth}, (_, i) => {
            const day = i + 1;
            const avg = dayCounts[i] > 0 ? daySums[i] / dayCounts[i] : undefined;
            return {day, avg} as { day: number; avg?: number };
        });
        return data;
    }, [monthValue, monthlyRows, metricKeys]);

    // Handle click on a day point in monthly chart: pick the latest row for that day
    const handleMonthlyChartClick = useCallback((state: any) => {
        if (!onSelectRow) return;
        const dayFromState: unknown = state?.activeLabel ?? state?.activePayload?.[0]?.payload?.day;
        const day: number | null = typeof dayFromState === 'number' ? dayFromState : null;
        if (!day) return;
        const [yearStr, monthStr] = monthValue.split('-');
        const year = Number(yearStr);
        const monthIndex = Number(monthStr) - 1;
        const rowsForDay = monthlyRows.filter((r) => {
            const d = new Date(r.created);
            return d.getUTCFullYear() === year && d.getUTCMonth() === monthIndex && d.getUTCDate() === day;
        });
        if (rowsForDay.length === 0) return;
        const latest = rowsForDay.reduce((acc, cur) => new Date(cur.created) > new Date((acc as any).created) ? cur : acc);
        // Cast to ValueRow; only id is used downstream for locating the row in the table
        onSelectRow(latest as unknown as ValueRow);
    }, [monthValue, monthlyRows, onSelectRow]);

    return (
        <div style={{width: '100%', height: '100%'}}>
            <h2>Панель мониторинга</h2>
            {/* View mode toggle */}
            <div style={{marginBottom: 12}}>
                <button
                    className={`embossed-button ${viewMode === 'row' ? 'active' : ''}`}
                    onClick={() => setViewMode('row')}
                    style={{marginRight: 8}}
                >По значениям
                </button>
                <button
                    className={`embossed-button ${viewMode === 'month' ? 'active' : ''}`}
                    onClick={() => setViewMode('month')}
                >
                    За месяц
                </button>
            </div>

            {viewMode === 'row' ? (
                selectedRow ? (
                    <ResponsiveContainer width="100%" height={300}>
                        <BarChart
                            data={barData}
                            margin={{
                                top: 5,
                                right: 30,
                                left: 20,
                                bottom: 5,
                            }}>
                            <CartesianGrid strokeDasharray="3 3"/>
                            <XAxis dataKey="name"/>
                            <YAxis/>
                            <Tooltip/>
                            <Legend
                                content={() => (
                                    <ul style={{listStyle: 'none', padding: 0, margin: 0, textAlign: 'center'}}>
                                        <li style={{display: 'inline-block', marginRight: 10}}>
                                            <span style={{display: 'inline-block', width: 10, height: 10, backgroundColor: '#3498db', marginRight: 5}}></span>
                                            <span style={{color: '#3498db', fontWeight: 'bold'}}>Значения температуры</span>
                                        </li>
                                    </ul>
                                )}
                            />
                            <Bar dataKey="value" fill="#3498db">
                                <LabelList
                                    dataKey="value"
                                    position="top"
                                    content={CustomBarLabel}
                                />
                            </Bar>
                        </BarChart>
                    </ResponsiveContainer>
                ) : (
                    <div>Выберите значения из таблицы внизу.</div>
                )
            ) : (
                <div>
                    {/* Month selector */}
                    <div style={{marginBottom: 12, display: 'flex', alignItems: 'center', gap: 8}}>
                        <label htmlFor="monthPicker">Месяц:</label>
                        <input
                            id="monthPicker"
                            type="month"
                            value={monthValue}
                            onChange={(e) => setMonthValue(e.target.value)}
                            style={{padding: '4px 8px'}}
                        />
                    </div>
                    {!hostId && (<div>Выберите машину слева.</div>)}
                    {hostId && loading && <div>Загрузка данных...</div>}
                    {hostId && error && <div style={{color: 'red'}}>{error}</div>}

                    {hostId && !loading && !error && (
                        <div>
                            <h3 style={{margin: '6px 0'}}>Средняя температура (все зоны)</h3>
                            <ResponsiveContainer width="100%" height={260}>
                                <LineChart data={dailyAvgData} margin={{top: 5, right: 20, left: 10, bottom: 5}} onClick={handleMonthlyChartClick}>
                                    <CartesianGrid strokeDasharray="3 3"/>
                                    <XAxis dataKey="day" tickFormatter={(v) => String(v)}/>
                                    <YAxis/>
                                    <Tooltip/>
                                    <Line type="monotone" dataKey="avg" stroke="#3498db" strokeWidth={2} dot={{r: 3}} activeDot={{r: 6}}/>
                                </LineChart>
                            </ResponsiveContainer>
                        </div>
                    )}
                </div>
            )}
        </div>
    );
};

export default DashboardView;
