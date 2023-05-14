-- Table: devolpay.amortizations

-- DROP TABLE IF EXISTS devolpay.amortizations;

CREATE TABLE IF NOT EXISTS devolpay.amortizations
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    version bigint,
    is_persistent boolean,
    last_modified timestamp with time zone,
    amount integer NOT NULL,
    loan_id integer NOT NULL,
    user_id integer NOT NULL,
    client_manager_id integer NOT NULL,
    billing_manager_id integer NOT NULL,
    billing_rol character varying COLLATE pg_catalog."default" NOT NULL,
    billing_user_id integer NOT NULL,
    billing_name character varying COLLATE pg_catalog."default" NOT NULL,
    billing_lastname character varying COLLATE pg_catalog."default" NOT NULL,
    client_id integer NOT NULL,
    date date NOT NULL,
    CONSTRAINT amortization_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS devolpay.amortizations
    OWNER to postgres;

-- Table: devolpay.billings_manager

-- DROP TABLE IF EXISTS devolpay.billings_manager;

CREATE TABLE IF NOT EXISTS devolpay.billings_manager
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    version bigint,
    is_persistent boolean,
    last_modified timestamp with time zone,
    owner_user_id integer NOT NULL,
    billing_user_id integer NOT NULL,
    status character varying COLLATE pg_catalog."default" NOT NULL,
    client_id integer NOT NULL,
    start_date date NOT NULL,
    end_date date NOT NULL,
    CONSTRAINT billing_manager_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS devolpay.billings_manager
    OWNER to postgres;

-- Table: devolpay.clients

-- DROP TABLE IF EXISTS devolpay.clients;

CREATE TABLE IF NOT EXISTS devolpay.clients
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    version bigint,
    is_persistent boolean,
    last_modified timestamp with time zone,
    dni character varying COLLATE pg_catalog."default" NOT NULL,
    name character varying COLLATE pg_catalog."default" NOT NULL,
    lastname character varying COLLATE pg_catalog."default" NOT NULL,
    phone character varying COLLATE pg_catalog."default" NOT NULL,
    address character varying COLLATE pg_catalog."default" NOT NULL,
    loan_list character varying COLLATE pg_catalog."default" NOT NULL,
    user_id integer NOT NULL,
    loan_num integer NOT NULL,
    assigned_client character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT client_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS devolpay.clients
    OWNER to postgres;

-- Table: devolpay.clients_manager

-- DROP TABLE IF EXISTS devolpay.clients_manager;

CREATE TABLE IF NOT EXISTS devolpay.clients_manager
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    version bigint,
    is_persistent boolean,
    last_modified timestamp with time zone,
    billing_manager_id integer NOT NULL,
    client_id integer NOT NULL,
    status character varying COLLATE pg_catalog."default" NOT NULL,
    billing_user_id integer NOT NULL,
    start_date date NOT NULL,
    end_date date NOT NULL,
    CONSTRAINT clients_manager_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS devolpay.clients_manager
    OWNER to postgres;

-- Table: devolpay.loans

-- DROP TABLE IF EXISTS devolpay.loans;

CREATE TABLE IF NOT EXISTS devolpay.loans
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    version bigint,
    is_persistent boolean,
    last_modified timestamp with time zone,
    date date NOT NULL,
    amount integer NOT NULL,
    tax integer NOT NULL,
    to_return integer NOT NULL,
    returned integer NOT NULL,
    status character varying COLLATE pg_catalog."default" NOT NULL,
    dni character varying COLLATE pg_catalog."default" NOT NULL,
    client_id integer NOT NULL,
    amortization_list integer NOT NULL,
    user_id integer NOT NULL,
    name character varying COLLATE pg_catalog."default" NOT NULL,
    lastname character varying COLLATE pg_catalog."default" NOT NULL,
    loan_type character varying COLLATE pg_catalog."default" NOT NULL,
    gloss character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT loan_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS devolpay.loans
    OWNER to postgres;

-- Table: devolpay.users

-- DROP TABLE IF EXISTS devolpay.users;

CREATE TABLE IF NOT EXISTS devolpay.users
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    version bigint,
    is_persistent boolean,
    last_modified timestamp with time zone,
    name character varying(50) COLLATE pg_catalog."default",
    lastname character varying(50) COLLATE pg_catalog."default",
    email character varying(150) COLLATE pg_catalog."default",
    session_id character varying(50) COLLATE pg_catalog."default",
    is_rol_owner boolean,
    is_rol_admin boolean,
    is_rol_billing_manager boolean,
    CONSTRAINT "PK_USERS" PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS devolpay.users
    OWNER to postgres;