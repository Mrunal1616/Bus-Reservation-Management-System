/*
	Author : Mrunal Barde
    Date : 29/12/22
*/

DROP DATABASE If EXISTS BRMS;
CREATE DATABASE BRMS;
USE BRMS;
DROP TABLE IF EXISTS Registration;
CREATE TABLE Registration(
	login_id VARCHAR(20),
	password VARCHAR(20),
	username VARCHAR(40),
    email VARCHAR(100),
    phone_no VARCHAR(10),
    date_of_birth DATE,
    age INT,
    address VARCHAR(500),
    physical_disability CHAR(100)
);

ALTER TABLE Registration
ADD COLUMN(identity_proof VARCHAR(20)) ;

#TRUNCATE Registration;

DROP TABLE IF EXISTS Reminders;
CREATE TABLE Reminders(
	message_id INT PRIMARY KEY AUTO_INCREMENT,
    message VARCHAR(400),
    user_id VARCHAR(200),
    FOREIGN KEY (user_id) REFERENCES Registration(user_id)
);

