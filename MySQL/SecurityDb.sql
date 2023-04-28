create database securitydb;
use securitydb;

select * from users;
select * from roles;
select * from users_roles;
select * from student;
insert into users (password, username) values("password","Abhishek");
delete from users where id = 2;

drop database securitydb;