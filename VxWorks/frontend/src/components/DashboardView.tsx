import React from 'react';
import { ValueRow } from '../types';

interface DashboardViewProps {
  selectedRow: ValueRow | null;
}

const DashboardView: React.FC<DashboardViewProps> = ({ selectedRow }) => {
  // Extract numeric values from the selected row for display
  const barData = selectedRow 
    ? Object.entries(selectedRow)
        .filter(([key, value]) => typeof value === 'number' && key !== 'id')
        .map(([key, value]) => ({ name: key, value: value as number }))
    : [];

  return (
    <div>
      <h2>Dashboard View</h2>
      {selectedRow ? (
        <div style={{ display: 'flex', justifyContent: 'space-around', alignItems: 'flex-end', height: '80%' }}>
          {barData.map(item => (
            <div key={item.name} style={{ textAlign: 'center' }}>
              <div style={{
                width: '50px',
                backgroundColor: '#3498db',
                height: `${(item.value / 200) * 100}%`, // Example scaling
                color: 'white',
                display: 'flex',
                alignItems: 'flex-end',
                justifyContent: 'center'
              }}>
                {item.value}
              </div>
              <div>{item.name}</div>
            </div>
          ))}
        </div>
      ) : (
        <div>Select a row from the values table to see the dashboard.</div>
      )}
    </div>
  );
};

export default DashboardView;
