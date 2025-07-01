import React from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import DashboardPage from "./pages/DashboardPage";
import HostDetailsPage from "./pages/HostDetailsPage";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<DashboardPage />} />
        <Route path="/hosts/:id" element={<HostDetailsPage />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
