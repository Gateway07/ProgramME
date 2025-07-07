import React, {useCallback, useEffect, useState} from 'react';
import api from '../api';
import {Host} from '../types';
import StatusIcon from './StatusIcon';
import {VscRefresh} from 'react-icons/vsc';

interface HostsViewProps {
    onHostSelect: (id: number | null) => void;
    selectedHostId: number | null;
    onRefreshHost: (hostId: number) => Promise<void>;
}

// Helper to group hosts into a tree structure
const groupHosts = (hosts: Host[]) => {
    const grouped: { [firm: string]: { [model: string]: Host[] } } = {};

    hosts.forEach(host => {
        const locationName = (host.location || 'Неизвестно').trim();
        const modelName = (host.model || 'Неизвестно').trim();

        const existingFirmKey = Object.keys(grouped).find(k => k.toLowerCase() === locationName.toLowerCase()) || locationName;
        if (!grouped[existingFirmKey]) {
            grouped[existingFirmKey] = {};
        }

        const existingModelKey = Object.keys(grouped[existingFirmKey]).find(k => k.toLowerCase() === modelName.toLowerCase()) || modelName;

        if (!grouped[existingFirmKey][existingModelKey]) {
            grouped[existingFirmKey][existingModelKey] = [];
        }

        grouped[existingFirmKey][existingModelKey].push(host);
    });

    return grouped;
};

const HostsView: React.FC<HostsViewProps> = ({onHostSelect, selectedHostId, onRefreshHost}) => {
    const [hosts, setHosts] = useState<Host[]>([]);
    const [loading, setLoading] = useState<boolean>(true);
    const [error, setError] = useState<string | null>(null);
    const [refreshing, setRefreshing] = useState<boolean>(false);
    const [expandedNodes, setExpandedNodes] = useState<Record<string, boolean>>({});
    const [refreshingHostId, setRefreshingHostId] = useState<number | null>(null);

    const toggleNode = (key: string) => {
        setExpandedNodes(prev => ({...prev, [key]: !prev[key]}));
    };

    const handleSelectHost = (id: number) => {
        onHostSelect(id);
    };

    const handleRefreshClick = (e: React.MouseEvent, hostId: number) => {
        e.stopPropagation();
        handleRefresh(hostId);
    };

    // Fetches the status for a single host
    const fetchHostStatus = async (hostId: number): Promise<number> => {
        const response = await api.get(`/hosts/${hostId}/status`);
        return response.data.status;
    };

    // Fetches all hosts and their corresponding statuses
    const fetchAllData = useCallback(async () => {
        setLoading(true);
        setError(null);
        try {
            const hostsResponse = await api.get<Host[]>('/hosts');
            const hostsData = hostsResponse.data;

            // Sort hosts by ID
            hostsData.sort((a, b) => a.no - b.no);

            const hostsWithStatus = await Promise.all(
                hostsData.map(async (host) => {
                    try {
                        const status = await fetchHostStatus(host.id);
                        return {...host, status};
                    } catch (e) {
                        return {...host, status: undefined}; // Handle cases where status fetch fails
                    }
                })
            );

            setHosts(hostsWithStatus);
        } catch (err) {
            setError('Failed to fetch hosts.');
            console.error(err);
        } finally {
            setLoading(false);
        }
    }, []);

    useEffect(() => {
        fetchAllData();
    }, [fetchAllData]);

    // Refreshes a single selected host
    const handleRefresh = async (hostId: number) => {
        setRefreshingHostId(hostId);
        try {
            await onRefreshHost(hostId);
            const newStatus = await fetchHostStatus(hostId);
            setHosts(prevHosts =>
                prevHosts.map(h => h.id === hostId ? {...h, status: newStatus} : h)
            );
        } catch (err) {
            setError(`Failed to refresh host ${hostId}.`);
        } finally {
            setRefreshingHostId(null);
        }
    };

    // Refreshes all hosts
    const handleRefreshAll = async () => {
        setRefreshing(true);
        try {
            await api.get('/hosts/refresh');
            await fetchAllData(); // Refetch all data to get updated statuses
        } catch (err) {
            setError('Failed to refresh all hosts.');
        } finally {
            setRefreshing(false);
        }
    };

    const groupedHosts = groupHosts(hosts);

    if (loading) return <div>Loading hosts...</div>;
    if (error) return <div style={{color: 'red'}}>{error}</div>;

    return (
        <div style={{ display: 'flex', flexDirection: 'column', height: '100%', overflowY: 'auto' }}>
            <div style={{marginBottom: '10px'}}>
                <button className="embossed-button" onClick={handleRefreshAll} disabled={refreshing}>
                    {refreshing ? 'Refreshing All...' : 'Все'}
                </button>
            </div>
            <h2>Машины</h2>
            <div style={{ flex: '1 1 auto', overflowY: 'auto', paddingRight: '15px', marginTop: '10px' }}>
                {Object.entries(groupedHosts)
                    .sort(([firmA], [firmB]) => firmA.localeCompare(firmB))
                    .map(([firm, models]) => {
                        const isFirmExpanded = !!expandedNodes[firm];
                        return (
                            <div key={firm}>
                                <div className="tree-item" onClick={() => toggleNode(firm)}>
                                    <span className="icon">{isFirmExpanded ? '▼' : '►'}</span>
                                    <span className="label">{firm}</span>
                                </div>
                                {isFirmExpanded && (
                                    <div style={{marginLeft: '20px'}}>
                                        {Object.entries(models)
                                            .sort(([modelA], [modelB]) => modelA.localeCompare(modelB))
                                            .map(([model, hostList]) => {
                                                const modelKey = `${firm}-${model}`;
                                                const isModelExpanded = !!expandedNodes[modelKey];
                                                return (
                                                    <div key={model}>
                                                        <div className="tree-item" onClick={() => toggleNode(modelKey)}>
                                                            <span className="icon">{isModelExpanded ? '▼' : '►'}</span>
                                                            <span className="label">{model}</span>
                                                        </div>
                                                        {isModelExpanded && (
                                                            <div style={{marginLeft: '20px'}}>
                                                                {hostList.map(host => (
                                                                    <div
                                                                        key={host.id}
                                                                        onClick={() => handleSelectHost(host.id)}
                                                                        className={`tree-item ${selectedHostId === host.id ? 'selected' : ''}`}>
                                                                        <StatusIcon status={host.status ?? -2}/>
                                                                        <span className="label">{host.id}</span>
                                                                        <button
                                                                            className="refresh-button"
                                                                            onClick={(e) => handleRefreshClick(e, host.id)}
                                                                            disabled={refreshingHostId !== null}
                                                                        >
                                                                            <VscRefresh
                                                                                className={refreshingHostId === host.id ? 'refreshing' : ''}/>
                                                                        </button>
                                                                    </div>
                                                                ))}
                                                            </div>
                                                        )}
                                                    </div>
                                                );
                                            })}
                                    </div>
                                )}
                            </div>
                        );
                    })}
            </div>
        </div>
    );
};

export default HostsView;
