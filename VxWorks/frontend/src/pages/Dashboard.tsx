import React, { useState } from 'react';
import { Panel, PanelGroup, PanelResizeHandle } from 'react-resizable-panels';
import HostsView from '../components/HostsView';
import DashboardView from '../components/DashboardView';
import ValuesView from '../components/ValuesView';
import { ValueRow } from '../types';

const Dashboard: React.FC = () => {
  const [selectedHostId, setSelectedHostId] = useState<number | null>(null);
  const [selectedRow, setSelectedRow] = useState<ValueRow | null>(null);

  return (
    <div className="app-container">
      <PanelGroup direction="vertical">
        <Panel defaultSize={40} minSize={20}>
          <PanelGroup direction="horizontal">
            <Panel defaultSize={25} minSize={15}>
              <HostsView onHostSelect={setSelectedHostId} selectedHostId={selectedHostId} />
            </Panel>
            <PanelResizeHandle className='Resizer vertical' />
            <Panel>
              <DashboardView selectedRow={selectedRow} />
            </Panel>
          </PanelGroup>
        </Panel>
        <PanelResizeHandle className='Resizer horizontal' />
        <Panel>
          <ValuesView selectedHostId={selectedHostId} onRowSelect={setSelectedRow} />
        </Panel>
      </PanelGroup>
    </div>
  );
};

export default Dashboard;
