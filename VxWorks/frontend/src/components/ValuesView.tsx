import React, {useCallback, useEffect, useState} from 'react';
import api from '../api';
import {PagedValues, ValueRow} from '../types';

interface ValuesViewProps {
    selectedHostId: number | null;
    onRowSelect: (row: ValueRow | null) => void;
    externallySelectedRow?: ValueRow | null;
}

const ValuesView: React.FC<ValuesViewProps> = ({selectedHostId, onRowSelect, externallySelectedRow}) => {
    const [data, setData] = useState<PagedValues | null>(null);
    const [loading, setLoading] = useState<boolean>(false);
    const [error, setError] = useState<string | null>(null);
    const [currentPage, setCurrentPage] = useState<number>(1);
    const [selectedRowId, setSelectedRowId] = useState<number | null>(null);

    const fetchValues = useCallback(async (hostId: number, page: number) => {
        setLoading(true);
        setError(null);
        try {
            const response = await api.get<PagedValues>(`/hosts/${hostId}/values`, {
                params: {page, per_page: 10} // 10 rows per page
            });
            setData(response.data);
        } catch (err) {
            setError('Failed to fetch values.');
            console.error(err);
        } finally {
            setLoading(false);
        }
    }, []);

    useEffect(() => {
        if (selectedHostId) {
            setCurrentPage(1);
            fetchValues(selectedHostId, 1);
            onRowSelect(null); // Clear selected row when host changes
            setSelectedRowId(null);
        } else {
            setData(null); // Clear data if no host is selected
        }
    }, [selectedHostId, fetchValues, onRowSelect]);

    useEffect(() => {
        if (selectedHostId) {
            fetchValues(selectedHostId, currentPage);
        }
    }, [currentPage, selectedHostId, fetchValues]);

    // Handle external selection (e.g., click on monthly chart)
    useEffect(() => {
        const focusRow = async (row: ValueRow) => {
            if (!selectedHostId || !row) return;
            try {
                setLoading(true);
                const per_page = 10;
                // Fetch page 1 to know total_pages
                const first = await api.get<PagedValues>(`/hosts/${selectedHostId}/values`, { params: { page: 1, per_page } });
                const contains = (vals: ValueRow[]) => vals.some(v => v.id === row.id);
                if (contains(first.data.values)) {
                    setData(first.data);
                    setCurrentPage(1);
                    setSelectedRowId(row.id);
                    onRowSelect(row);
                    return;
                }
                for (let p = 2; p <= first.data.total_pages; p++) {
                    const resp = await api.get<PagedValues>(`/hosts/${selectedHostId}/values`, { params: { page: p, per_page } });
                    if (contains(resp.data.values)) {
                        setData(resp.data);
                        setCurrentPage(p);
                        setSelectedRowId(row.id);
                        onRowSelect(row);
                        return;
                    }
                }
            } catch (e) {
                // Ignore navigation errors for now
            } finally {
                setLoading(false);
            }
        };

        if (externallySelectedRow && selectedHostId) {
            void focusRow(externallySelectedRow);
        }
    }, [externallySelectedRow, selectedHostId, onRowSelect]);

    const handleRowClick = (row: ValueRow) => {
        setSelectedRowId(row.id);
        onRowSelect(row);
    };

    if (!selectedHostId) {
        return <div>Select a host to view its history.</div>;
    }

    if (loading) return <div>Loading values...</div>;
    if (error) return <div style={{color: 'red'}}>{error}</div>;
    if (!data || data.values.length === 0) return <div></div>;

    const headers = Object.keys(data.values[0] || {}).filter(
        (header) => !['id', 'host', 'status', 'error'].includes(header)
    );

    return (
        <div>
            <h2></h2>
            <table style={{width: '100%', borderCollapse: 'collapse'}}>
                <thead>
                <tr>
                    {headers.map(header => (
                        <th
                            key={header}
                            style={{border: '1px solid grey', padding: '8px', textTransform: 'capitalize'}}>
                            {header === 'created' ? 'Дата' : header}
                        </th>
                    ))}
                </tr>
                </thead>
                <tbody>
                {data.values.map(row => (
                    <tr
                        key={row.id}
                        onClick={() => handleRowClick(row)}
                        style={{cursor: 'pointer', backgroundColor: selectedRowId === row.id ? '#333' : 'transparent'}}
                    >
                        {headers.map(header => <td key={`${row.id}-${header}`}
                                                   style={{border: '1px solid grey', padding: '8px'}}>{String(row[header as keyof ValueRow] ?? 'N/A')}</td>)}
                    </tr>
                ))}
                </tbody>
            </table>
            <div style={{marginTop: '10px'}}>
                <button onClick={() => setCurrentPage(p => p - 1)} disabled={currentPage === 1}>
                    &lt; Предыдущая
                </button>
                <span style={{margin: '0 10px'}}>
          {data.current_page} из {data.total_pages}
        </span>
                <button onClick={() => setCurrentPage(p => p + 1)} disabled={currentPage === data.total_pages}>
                    Следующая &gt;
                </button>
            </div>
        </div>
    );
};

export default ValuesView;
