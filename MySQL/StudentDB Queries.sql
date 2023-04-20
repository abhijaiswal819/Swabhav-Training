CREATE DATABASE STUDENTDB;
drop table student;
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
       
use studentdb;
	select * from student;
delete from student where id IN (12, 13);
select * from student where first_name= "A";

update student set first_name="Abhishek", last_name="Jaiswal",email="abhijaiswal@example.com" where id=1;

ALTER TABLE student DROP id ;
select * from student;

ALTER TABLE student ADD id INT(10) PRIMARY KEY NOT NULL AUTO_INCREMENT FIRST;
select * from student;



use employee_db;

use studentdb;

desc employee_db;
desc address_db;

select * from employee_db;
select * from address_db;

select * from student_table;
drop table student_table;
select * from course_table;
drop table course_table;
select * from student_course;
drop table student_course;