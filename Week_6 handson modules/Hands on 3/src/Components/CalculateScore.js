import React from 'react';
import '../Stylesheets/mystyle.css'; // ✅ correct relative path

function CalculateScore({ Name, School, total, goal }) {
  const average = (total / goal).toFixed(2);

  return (
    <div className="score-container">
      <h2>🎯 Student Score Calculator</h2>
      <p><strong>Name:</strong> {Name}</p>
      <p><strong>School:</strong> {School}</p>
      <p><strong>Total Marks:</strong> {total}</p>
      <p><strong>Goal Subjects:</strong> {goal}</p>
      <p><strong>Average:</strong> {average}</p>
    </div>
  );
}

export default CalculateScore;
