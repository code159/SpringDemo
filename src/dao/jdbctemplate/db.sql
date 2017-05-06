create database if not exists test2 default character set utf8;
use test2;
--����JdbcTemplate
create table t(id int,name varchar(50),last_name varchar(20) default 'li');
--����Spring�������
create table dept(dept_id int primary key,dname varchar(50),location varchar(50));
create table emp(emp_id int primary key,ename varchar(50),sex char(1),dept_id int,
 foreign key(dept_id) references dept(dept_id));
 
 -- check() not actually useful
 create table if not exists book(
 book_id varchar(20) primary key,
 book_name varchar(20),
 price int
 );
 create table if not exists book_stock(
 book_id varchar(20) primary key,
 amount int,
 check(amount>0)
 );
 create table if not exists user(
 user_id varchar(20) primary key,
 balance int,
 check(balance>0)
 );
 
 truncate table book;
 truncate table book_stock;
 truncate table user;
 
insert into book values("bookId1","SpringInAction",90);
insert into book values("bookId2","SparkInAction",100);

insert into book_stock values("bookId1",10);
insert into book_stock values("bookId2",10);
insert into user values("userId1",300);
commit;

select * from book;
select * from book_stock;
select * from user;
