import React from 'react';

interface StatusIconProps {
  status: number;
}

const StatusIcon: React.FC<StatusIconProps> = ({ status }) => {
  const getStatusColor = () => {
    switch (status) {
      case 0:
        return 'green'; // Alive and connected
      case -1:
        return 'red'; // Disconnected
      case 1:
        return 'yellow'; // Expired
      default:
        return 'grey'; // Unknown
    }
  };

  return (
    <span style={{
      display: 'inline-block',
      width: '10px',
      height: '10px',
      borderRadius: '50%',
      backgroundColor: getStatusColor(),
      marginRight: '8px'
    }}></span>
  );
};

export default StatusIcon;
