/*
	Author : Mrunal Barde
    Date : 8/01/2023
*/
USE brms;

CREATE INDEX cityName ON Registration(address);

SHOW INDEXES FROM Registration;

#DROP INDEX cityName ON Registration;