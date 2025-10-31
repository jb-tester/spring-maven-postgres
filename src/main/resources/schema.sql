Drop table if exists persons1;
CREATE TABLE IF NOT EXISTS persons1 (
    id serial PRIMARY KEY ,
    email VARCHAR(100),
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    age int
);



