import React from "react";
import { useQuery } from "@tanstack/react-query";
import api from "../api";
import { Host } from "../types";
import { Link } from "react-router-dom";

function DashboardPage() {
  const { data: hosts, refetch, isFetching } = useQuery<Host[]>({
    queryKey: ["hosts"],
    queryFn: async () => {
      const { data } = await api.get<Host[]>("/hosts");
      return data;
    },
  });

  const refreshAll = async () => {
    await api.get("/hosts/refresh");
    await refetch();
  };

  return (
    <div className="container mx-auto p-4">
      <h1 className="text-xl font-bold mb-4">Hosts</h1>
      <button
        className="bg-blue-600 text-white px-3 py-1 rounded mb-4"
        onClick={refreshAll}
        disabled={isFetching}
      >
        Refresh All
      </button>
      <table className="table-auto w-full">
        <thead>
          <tr>
            <th>ID</th>
            <th>Model</th>
            <th>Status</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {hosts?.map((h) => (
            <tr key={h.id} className="border-t">
              <td>{h.id}</td>
              <td>
                <Link to={`/hosts/${h.id}`} className="text-blue-600">
                  {h.model}
                </Link>
              </td>
              <td>{h.status ?? "-"}</td>
              <td>
                <button
                  className="bg-green-600 text-white px-2 py-1 rounded"
                  onClick={async () => {
                    await api.get(`/hosts/${h.id}/refresh`);
                    await refetch();
                  }}
                >
                  Refresh
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default DashboardPage;
