drop database if exists blog;
create database blog character set utf8;
use blog;
create table bl_article(
bl_id INT UNSIGNED AUTO_INCREMENT,
bl_title varchar(255) not null default '',
primary key ()
)