export interface Host {
  id: number;
  model: string;
  firm?: string;
  ip: string;
  port: number;
  status?: number;
}

export interface ValueRow {
  id: number;
  timestamp: string;
  sv_tempzone1?: number;
  sv_tempzone2?: number;
  sv_tempzone3?: number;
  sv_tempzone4?: number;
  sv_tempzone5?: number;
  sv_oiltemp?: number;
}

export interface PagedValues {
  values: ValueRow[];
  total_pages: number;
  current_page: number;
}
