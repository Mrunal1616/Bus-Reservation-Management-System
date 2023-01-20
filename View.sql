/*
	Author : Mrunal Barde
    Date : 8/01/2023
*/
USE brms;

CREATE VIEW UserFromPune
AS
SELECT *
FROM Registration
WHERE address = 'Pune';

