/*
	Author : Mrunal Barde
    Date : 8/01/2023
*/
USE brms;
GRANT SELECT, INSERT, UPDATE, DELETE 
ON brms.*   
TO root@'localhost';

SHOW GRANTS
FOR root@'localhost';

FLUSH PRIVILEGES;

REVOKE INSERT, UPDATE, DELETE 
ON brms.* 
FROM root@'localhost';

