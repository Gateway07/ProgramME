import React, { useState, useEffect, useCallback } from 'react';
import api from '../api';
import { Host } from '../types';
import StatusIcon from './StatusIcon';

interface HostsViewProps {
  onHostSelect: (id: number | null) => void;
  selectedHostId: number | null;
}

// Helper to group hosts into a tree structure
const groupHosts = (hosts: Host[]) => {
  const grouped: { [firm: string]: { [model: string]: Host[] } } = {};

  hosts.forEach(host => {
    const firmName = (host.firm || 'Unknown Firm').trim();
    const modelName = (host.model || 'Unknown Model').trim();

    const existingFirmKey = Object.keys(grouped).find(k => k.toLowerCase() === firmName.toLowerCase()) || firmName;

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

const HostsView: React.FC<HostsViewProps> = ({ onHostSelect, selectedHostId }) => {
  const [hosts, setHosts] = useState<Host[]>([]);
  const [loading, setLoading] = useState<boolean>(true);
  const [error, setError] = useState<string | null>(null);
  const [refreshing, setRefreshing] = useState<boolean>(false);
  const [expandedNodes, setExpandedNodes] = useState<Record<string, boolean>>({});

  const toggleNode = (key: string) => {
    setExpandedNodes(prev => ({ ...prev, [key]: !prev[key] }));
  };

  const handleSelectHost = (id: number) => {
    onHostSelect(id);
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
      
      const hostsWithStatus = await Promise.all(
        hostsData.map(async (host) => {
          try {
            const status = await fetchHostStatus(host.id);
            return { ...host, status };
          } catch (e) {
            return { ...host, status: undefined }; // Handle cases where status fetch fails
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
    setRefreshing(true);
    try {
      await api.get(`/hosts/${hostId}/refresh`);
      const newStatus = await fetchHostStatus(hostId);
      setHosts(prevHosts => 
        prevHosts.map(h => h.id === hostId ? { ...h, status: newStatus } : h)
      );
    } catch (err) {
      setError(`Failed to refresh host ${hostId}.`);
    } finally {
      setRefreshing(false);
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
  if (error) return <div style={{ color: 'red' }}>{error}</div>;

  const treeItemStyle: React.CSSProperties = {
    padding: '5px',
    cursor: 'pointer',
    display: 'flex',
    alignItems: 'center',
    fontFamily: 'Arial, sans-serif',
    fontSize: '16px',
  };

  const selectedTreeItemStyle: React.CSSProperties = {
    ...treeItemStyle,
    backgroundColor: '#d3d3d3',
    fontWeight: 'bold',
  };

  return (
    <div>
      <div style={{ marginBottom: '10px' }}>
        <button 
          onClick={() => selectedHostId && handleRefresh(selectedHostId)} 
          disabled={!selectedHostId || refreshing}
        >
          {refreshing ? 'Refreshing...' : 'Refresh'}
        </button>
        <button onClick={handleRefreshAll} disabled={refreshing} style={{ marginLeft: '5px' }}>
          {refreshing ? 'Refreshing All...' : 'Refresh All'}
        </button>
      </div>
      <h2>Hosts</h2>
      <div style={{ marginTop: '10px' }}>
        {Object.entries(groupedHosts).map(([firm, models]) => {
            const isFirmExpanded = !!expandedNodes[firm];
            return (
                <div key={firm}>
                    <div style={treeItemStyle} onClick={() => toggleNode(firm)}>
                        <span style={{ width: '20px' }}>{isFirmExpanded ? '▼' : '►'}</span>
                        {firm}
                    </div>
                    {isFirmExpanded && (
                        <div style={{ marginLeft: '20px' }}>
                            {Object.entries(models).map(([model, hostList]) => {
                                const modelKey = `${firm}-${model}`;
                                const isModelExpanded = !!expandedNodes[modelKey];
                                return (
                                    <div key={model}>
                                        <div style={treeItemStyle} onClick={() => toggleNode(modelKey)}>
                                            <span style={{ width: '20px' }}>{isModelExpanded ? '▼' : '►'}</span>
                                            {model}
                                        </div>
                                        {isModelExpanded && (
                                            <div style={{ marginLeft: '20px' }}>
                                                {hostList.map(host => (
                                                    <div
                                                        key={host.id}
                                                        onClick={() => handleSelectHost(host.id)}
                                                        style={
                                                            selectedHostId === host.id
                                                                ? selectedTreeItemStyle
                                                                : treeItemStyle
                                                        }
                                                    >
                                                        <StatusIcon status={host.status ?? -2} />
                                                        <span style={{ marginLeft: '8px' }}>{host.ip}</span>
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
