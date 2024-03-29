create database BANKDB;
use BANKDB;
 
create table user (
acc_no bigint primary key, 
user_name varchar(50) not null, 
email varchar(50) unique, 
pass varchar(50) not null, 
mob varchar(15) , 
balance decimal(10,2)
);

desc user;

insert into user values(1001, "Abhishek Jaiswal", 'abhishek@gmail.com',"abhishek@123", "8767270000", 5000);
insert into user values(1002, "Tejas Prabhu", 'tejas@gmail.com',"tejas@123", "8767880000", 9000);

select * from user;
delete from user where acc_no in (1,2);

create table admin( 
id int primary key, 
admin_name varchar(50) not null,
email varchar(30) unique, 
pass varchar(20) not null,
mob varchar(15) 
);

desc admin;

insert into admin values (101, "Abhishek Jaiswal", "abhishek@bank.com" ,"abhishek@123", "8767270000");
insert into admin values (102, "Tejas Prabhu", "tejas@bank.com" ,"tejas@123", "8767880000");

select  * from admin;
delete from admin where id in (101, 102);

 create table passbook (
 sr_no int auto_increment primary key,  
 acc_no bigint , 
 trans_date date, 
 trans_type varchar(20) , 
 amount decimal(10,2) , 
 balance decimal(10,2)
 );
 
 desc passbook ;
 
 insert into passbook ( acc_no , trans_date , trans_type, amount ,balance) values(1001, "2020-06-15", "Credit", 1000, 6000);
 insert into passbook ( acc_no , trans_date , trans_type, amount ,balance) values(1002, "2020-06-15", "Credit", 1000, 10000);

select * from passbook;
 
-- ALTER TABLE passbook
-- ADD FOREIGN KEY(acc_no)
-- REFERENCES user(acc_no);

-- advertisers_ibfk_1
--  FOREIGN KEY (acc_no) REFERENCES user(acc_no)

-- ALTER TABLE `user`
-- ADD FOREIGN KEY(`acc_no`)
-- REFERENCES `user`(`acc_no`);


SELECT user_name, trans_type
FROM user
INNER JOIN passbook
ON user.acc_no = passbook.acc_no;

select * from admin;
desc admin;
drop table admin;

select * from user;
update user set pass = "tejas@123" where acc_no = 1002;
desc user;
drop table user;

select * from passbook;
update passbook set trans_type = "Credit" where acc_no = 1002;
update passbook set balance=11000 where trans_date = "2023-04-09";
delete from passbook where sr_no = 18; 
desc passbook;
drop table passbook;