CREATE TABLE asset
(
    id          uuid    NOT NULL,
    "type"      varchar NOT NULL,
    value       bigint  NOT NULL,
    "timestamp" timestamp without time zone NOT NULL,
    CONSTRAINT asset_pk PRIMARY KEY (id)
);
