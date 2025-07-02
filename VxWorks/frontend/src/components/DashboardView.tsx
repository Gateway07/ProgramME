import React from 'react';
import { ValueRow } from '../types';
import { BarChart, Bar, XAxis, YAxis, CartesianGrid, Tooltip, Legend, ResponsiveContainer } from 'recharts';

interface DashboardViewProps {
  selectedRow: ValueRow | null;
}

const DashboardView: React.FC<DashboardViewProps> = ({ selectedRow }) => {
  // Extract numeric values from the selected row for display
  const barData = selectedRow 
    ? Object.entries(selectedRow)
        .filter(([key, value]) => typeof value === 'number' && key.startsWith('sv_'))
        .map(([key, value]) => ({ name: key, value: value as number }))
    : [];

  return (
    <div style={{ width: '100%', height: '100%' }}>
      <h2>Dashboard View</h2>
      {selectedRow ? (
        <ResponsiveContainer width="100%" height={300}>
          <BarChart
            data={barData}
            margin={{
              top: 5,
              right: 30,
              left: 20,
              bottom: 5,
            }}
          >
            <CartesianGrid strokeDasharray="3 3" />
            <XAxis dataKey="name" />
            <YAxis />
            <Tooltip />
            <Legend />
            <Bar dataKey="value" fill="#3498db" />
          </BarChart>
        </ResponsiveContainer>
      ) : (
        <div>Select a row from the values table to see the dashboard.</div>
      )}
    </div>
  );
};

export default DashboardView;
