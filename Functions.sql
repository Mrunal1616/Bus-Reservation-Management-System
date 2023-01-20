/*
	Author : Mrunal Barde
    Date : 5/01/2023
*/
USE brms;
DROP FUNCTION IF EXISTS CALCULATE_AGE;
DELIMITER $$
CREATE FUNCTION CALCULATE_AGE(
	date_of_birth DATE
)
RETURNS INT deterministic
BEGIN
	DECLARE present_day DATE;
    SELECT CURRENT_DATE() INTO present_day;
    RETURN YEAR(present_day) - YEAR(date_of_birth);
END$$
DELIMITER ;