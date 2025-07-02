import React, { useState } from 'react';
import HostsView from '../components/HostsView';
import DashboardView from '../components/DashboardView';
import ValuesView from '../components/ValuesView';
import { ValueRow } from '../types';

const Dashboard: React.FC = () => {
  const [selectedHostId, setSelectedHostId] = useState<number | null>(null);
  const [selectedRow, setSelectedRow] = useState<ValueRow | null>(null);

  return (
    <div style={{ display: 'flex', flexDirection: 'column', height: '100vh', backgroundColor: '#1a1a1a', color: 'white' }}>
      <div style={{ display: 'flex', flex: '1 1 33%' }}>
        <div style={{ flex: '1 1 10%', border: '1px solid grey', padding: '10px' }}>
          <HostsView onHostSelect={setSelectedHostId} selectedHostId={selectedHostId} />
        </div>
        <div style={{ flex: '1 1 90%', border: '1px solid grey', padding: '10px' }}>
          <DashboardView selectedRow={selectedRow} />
        </div>
      </div>
      <div style={{ flex: '1 1 67%', border: '1px solid grey', padding: '10px' }}>
        <ValuesView selectedHostId={selectedHostId} onRowSelect={setSelectedRow} />
      </div>
    </div>
  );
};

export default Dashboard;
