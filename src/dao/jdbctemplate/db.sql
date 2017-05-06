create database if not exists test2 default character set utf8;
use test2;
--����JdbcTemplate
create table t(id int,name varchar(50),last_name varchar(20) default 'li');
--����Spring�������
create table dept(dept_id int primary key,dname varchar(50),location varchar(50));
create table emp(emp_id int primary key,ename varchar(50),sex char(1),dept_id int,
 foreign key(dept_id) references dept(dept_id));
 
 -- check() not actually useful
 create table book(
 book_id varchar(20) primary key,
 book_name varchar(20),
 price int
 );
 create table book_stock(
 book_id varchar(20) primary key,
 amount int,
 check(amount>0)
 );
 create table user(
 user_id varchar(20) primary key,
 balance int,
 check(balance>0)
 );
 
insert into book values("bookId1","SpringInAction",90);
insert into book_stock values("bookId1",10);
insert into user values("userId1",200);
commit;
