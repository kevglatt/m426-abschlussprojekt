DROP TABLE IF EXISTS task;
DROP TYPE IF EXISTS priority_level;
CREATE TYPE priority_level AS ENUM ('LOW', 'MEDIUM', 'HIGH');
CREATE TABLE task
(
    id          SERIAL PRIMARY KEY,
    title       VARCHAR(255),
    description TEXT,
    completed   BOOLEAN,
    priority    priority_level,
    due         DATE,
    created_at  TIMESTAMP
);