USE rminds;

DROP TABLE IF EXISTS user;
CREATE TABLE user (firstname VARCHAR(20), lastname VARCHAR(20), email VARCHAR(30), password VARCHAR(16));

INSERT INTO user VALUES ( 'John', 'Doe', 'john@gmail.com', '123');

SELECT * FROM user;