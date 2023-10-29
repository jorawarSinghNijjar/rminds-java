CREATE DATABASE rminds;

USE rminds;

DROP TABLE IF EXISTS account;
CREATE TABLE account ( accno INT AUTO_INCREMENT, lastname VARCHAR(10), firstname VARCHAR(10), balance DECIMAL(10,2) DEFAULT(0.00), PRIMARY KEY (accno));

INSERT INTO account (lastname, firstname, balance) VALUES ("singh", "test", 543.23);
INSERT INTO account (lastname, firstname) VALUES ("singh", "test2");

UPDATE account SET balance=2000 WHERE accno=101;

DELETE FROM account WHERE accno = 101;

SELECT * FROM account;