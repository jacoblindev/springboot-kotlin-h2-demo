CREATE TABLE IF NOT EXISTS languages (
    id    VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
    lang  VARCHAR      NOT NULL
);