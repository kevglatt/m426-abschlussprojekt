DROP TABLE IF EXISTS person;
CREATE TABLE person
(
    id   SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(100)       NOT NULL
);
