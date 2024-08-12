CREATE TABLE IF NOT EXISTS users (
    id bigint NOT NULL auto_increment,
    nome VARCHAR(255),
    bio VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255),
    created_at DATETIME,
    updated_at DATETIME,
    primary key(id)
);