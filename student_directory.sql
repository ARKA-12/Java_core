-- CREATE DATABASE IF NOT EXISTS `mystudenttable`;

-- USE `mystudenttable`;

-- DROP TABLE IF EXISTS `mystudent`;


CREATE TABLE `mystudent` (
`id` int not null auto_increment,
`first_name` varchar(50) default NULL,
`last_name` varchar(50) default NULL,
`age` int(10) default NULL,
PRIMARY KEY(`id`)
);


-- insert into `mystudent` (firstName,lastName,age)
-- values('Arka','Maity',23);

-- delete from mystudent where id =1;

-- drop table mystudent;