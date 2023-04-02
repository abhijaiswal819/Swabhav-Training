CREATE DATABASE STUDENTDB;

USE STUDENTDB;

CREATE TABLE STUDENT (
id INT(10) NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(30) NOT NULL,
  last_name VARCHAR(30) NOT NULL,
  email VARCHAR(30) NOT NULL,
  PRIMARY KEY (id)
  );
  
  INSERT INTO student (first_name, last_name, email)
VALUES ('Abhi', 'Jaiswal', 'abhijaiswal@example.com'),
       ('Tejas', 'Prabhu', 'tejasprabhu@example.com'),
       ('Akshay', 'Poojary', 'akshaypoojary@example.com'),
       ('Sankalp', 'Gaonkar', 'sankalpgaonkar@example.com');
       
select * from student;
select * from student where first_name= "A";

update student set first_name="Abhishek", last_name="Jaiswal",email="abhijaiswal@example.com" where id=1;

ALTER TABLE student DROP id ;
select * from student;

ALTER TABLE student ADD id INT(10) PRIMARY KEY NOT NULL AUTO_INCREMENT FIRST;
select * from student;