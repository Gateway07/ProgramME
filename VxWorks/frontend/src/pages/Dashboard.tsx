import React, { useState } from 'react';
import { Panel, PanelGroup, PanelResizeHandle } from 'react-resizable-panels';
import HostsView from '../components/HostsView';
import DashboardView from '../components/DashboardView';
import ValuesView from '../components/ValuesView';
import { ValueRow } from '../types';
import api from '../api';

const Dashboard: React.FC = () => {
  const [selectedHostId, setSelectedHostId] = useState<number | null>(null);
  const [selectedRow, setSelectedRow] = useState<ValueRow | null>(null);

  const handleRefreshHost = async (hostId: number) => {
    try {
      await api.get(`/hosts/${hostId}/refresh`);
    } catch (error) {
      console.error(`Failed to refresh host ${hostId}:`, error);
      throw error; // Re-throw to allow caller to handle it
    }
  };

  return (
    <div className="app-container">
      <PanelGroup direction="vertical">
        <Panel defaultSize={40} minSize={20}>
          <PanelGroup direction="horizontal">
            <Panel defaultSize={25} minSize={15}>
              <HostsView
                onHostSelect={setSelectedHostId}
                selectedHostId={selectedHostId}
                onRefreshHost={handleRefreshHost}
              />
            </Panel>
            <PanelResizeHandle className='Resizer vertical' />
            <Panel>
              <DashboardView
                selectedRow={selectedRow}
                selectedHostId={selectedHostId}
                onSelectRow={setSelectedRow}
              />
            </Panel>
          </PanelGroup>
        </Panel>
        <PanelResizeHandle className='Resizer horizontal' />
        <Panel>
          <ValuesView
            selectedHostId={selectedHostId}
            onRowSelect={setSelectedRow}
            externallySelectedRow={selectedRow}
          />
        </Panel>
      </PanelGroup>
    </div>
  );
};

export default Dashboard;
