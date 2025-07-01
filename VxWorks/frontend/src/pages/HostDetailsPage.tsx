import React, { useState } from "react";
import { useParams } from "react-router-dom";
import { useQuery } from "@tanstack/react-query";
import api from "../api";
import { PagedValues } from "../types";

function HostDetailsPage() {
  const { id } = useParams();
  const [page, setPage] = useState(1);
  const { data } = useQuery<PagedValues>({
    queryKey: ["values", id, page],
    queryFn: async () => {
      const { data } = await api.get<PagedValues>(`/hosts/${id}/values`, {
        params: { page },
      });
      return data;
    },
    keepPreviousData: true,
  });

  return (
    <div className="container mx-auto p-4">
      <h1 className="text-xl font-bold mb-4">Host {id}</h1>
      <table className="table-auto w-full">
        <thead>
          <tr>
            <th>Timestamp</th>
            <th>Temp1</th>
            <th>Temp2</th>
            <th>Temp3</th>
            <th>Temp4</th>
            <th>Temp5</th>
            <th>Oil</th>
          </tr>
        </thead>
        <tbody>
          {data?.values.map((row, idx) => (
            <tr key={row.id} className={idx === 0 ? "bg-yellow-100" : ""}>
              <td>{row.timestamp}</td>
              <td>{row.sv_tempzone1}</td>
              <td>{row.sv_tempzone2}</td>
              <td>{row.sv_tempzone3}</td>
              <td>{row.sv_tempzone4}</td>
              <td>{row.sv_tempzone5}</td>
              <td>{row.sv_oiltemp}</td>
            </tr>
          ))}
        </tbody>
      </table>
      <div className="flex gap-2 mt-4">
        <button
          className="px-3 py-1 bg-gray-300 rounded"
          onClick={() => setPage((p) => Math.max(p - 1, 1))}
          disabled={page === 1}
        >
          Prev
        </button>
        <span>
          Page {page} / {data?.total_pages ?? 1}
        </span>
        <button
          className="px-3 py-1 bg-gray-300 rounded"
          onClick={() => setPage((p) => p + 1)}
          disabled={page === data?.total_pages}
        >
          Next
        </button>
      </div>
    </div>
  );
}

export default HostDetailsPage;
