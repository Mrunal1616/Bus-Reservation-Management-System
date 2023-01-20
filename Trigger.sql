/*
	Author : Mrunal Barde
    Date : 5/01/2023
*/
DROP TRIGGER IF EXISTS after_user_insert;
DELIMITER $$
CREATE TRIGGER after_user_insert
	AFTER INSERT
    ON Registration FOR EACH ROW
BEGIN #{
	IF NEW.address IS NULL THEN
		INSERT INTO Reminder(user_id,message)
        VALUES(NEW.user_id,CONCAT('Hi',NEW.username,',please update your addres.'));
	END IF;
END$$ #}

DELIMITER ;
        