drop table if exists `user` CASCADE;
create table `user`
(
id integer AUTO_INCREMENT, 
adminstatus boolean not null, 
age integer not null, 
firstname varchar(255), 
lastname varchar(255), 
primary key (id)
);
