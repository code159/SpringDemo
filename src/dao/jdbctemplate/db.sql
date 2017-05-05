create database if not exists test2 default character set utf8;
use test2;
--用于JdbcTemplate
create table t(id int,name varchar(50),last_name varchar(20) default 'li');
--用于Spring事务管理
create table dept(dept_id int primary key,dname varchar(50),location varchar(50));
create table emp(emp_id int primary key,ename varchar(50),sex char(1),dept_id int,
 foreign key(dept_id) references dept(dept_id));