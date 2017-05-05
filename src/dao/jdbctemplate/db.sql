create database if not exists test2 default character set utf8;
use test2;
create table t(id int,name varchar(50),last_name varchar(20) default 'li');