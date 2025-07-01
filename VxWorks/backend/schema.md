create table public.vars (
id integer generated always as identity constraint pk_id primary key,
name varchar(255),
address char not null,
name_ru varchar not null,
size smallint not null,
"offset" smallint not null,
type varchar(8) not null
);

create table public.vals (
id bigserial,
sv_tempzone1 numeric,
sv_tempzone2 numeric,
sv_tempzone3 numeric,
sv_tempzone4 numeric,
sv_tempzone5 numeric,
sv_oiltemp numeric,
status smallint,
error varchar(1024),
created timestamp,
host smallint not null
);

create table public.host (
id smallint not null constraint host_pk primary key,
model varchar(255)          not null,
firm varchar(255),
ip varchar(16)           not null,
port smallint default 4000 not null
);
