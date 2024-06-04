DROP TABLE IF EXISTS example_table;
CREATE TABLE example_table
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

INSERT INTO example_table (name)
VALUES ('example1'),
       ('example2');
