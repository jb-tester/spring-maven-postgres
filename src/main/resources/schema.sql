Drop table if exists persons1;
CREATE TABLE IF NOT EXISTS persons1 (
    id INT PRIMARY KEY not null ,
    email VARCHAR(100),
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    age int
);



