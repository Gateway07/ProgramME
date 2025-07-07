import React from 'react';
import {ValueRow} from '../types';
import {Bar, BarChart, CartesianGrid, LabelList, Legend, ResponsiveContainer, Tooltip, XAxis, YAxis} from 'recharts';

interface DashboardViewProps {
    selectedRow: ValueRow | null;
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

const DashboardView: React.FC<DashboardViewProps> = ({selectedRow}) => {
    // Extract numeric values from the selected row for display
    const barData = selectedRow
        ? Object.entries(selectedRow)
            .filter(([key, value]) => typeof value === 'number' && key.startsWith('sv_'))
            .map(([key, value]) => ({name: key, value: value as number}))
        : [];

    return (
        <div style={{width: '100%', height: '100%'}}>
            <h2>Панель мониторинга</h2>
            {selectedRow ? (
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
                            content={(props) => {
                                const {payload} = props;
                                return (
                                    <ul style={{listStyle: 'none', padding: 0, margin: 0, textAlign: 'center'}}>
                                        <li style={{display: 'inline-block', marginRight: 10}}>
                                            <span style={{display: 'inline-block', width: 10, height: 10, backgroundColor: '#3498db', marginRight: 5}}></span>
                                            <span style={{color: '#3498db', fontWeight: 'bold'}}>Значения температуры</span>
                                        </li>
                                    </ul>
                                );
                            }}
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
            )}
        </div>
    );
};

export default DashboardView;
