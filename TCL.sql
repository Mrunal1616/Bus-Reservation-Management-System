/*
	Author : Mrunal Barde
    Date : 8/01/2023
*/
USE brms;
START TRANSACTION;
SELECT @@autocommit;
	SAVEPOINT SavePoint1;
		INSERT INTO Registration VALUES('U009','Saloni Shah','saloshah01@gmail.com','9473756214','Banglore','1999-11-01','NA','4567 9747 3456','salo01','saloshah11',CALCULATE_AGE(date_of_birth));
        SELECT * FROM Registration;
	SAVEPOINT SavePoint2;
        INSERT INTO Registration VALUES('U010','Kunal Shah','kunalshah@gmail.com','8654765875','Satara','1999-07-03','NA','6778 3456 7862','shahkunal','kunalshah01',CALCULATE_AGE(date_of_birth));
        SELECT * FROM Registration;
    ROLLBACK TO SavePoint2;
		SELECT * FROM Registration;
COMMIT;
SELECT @@autocommit;

SELECT * FROM Registration;
SET autocommit = ON;    
