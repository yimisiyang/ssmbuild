CREATE DATABASE `ssmbuild`;
USE `ssmbuild`;
CREATE TABLE `books`(
    `bookID` INT(10) NOT NULL COMMENT '书id',
    `bookName` VARCHAR(100) NOT NULL COMMENT '书名',
    `bookCounts` INT(11) NOT NULL COMMENT '数量',
    `detail` VARCHAR(200) NOT NULL COMMENT '描述',
KEY `bookID` (`bookID`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO `books`(`bookID`,`bookName`,`bookCounts`,`detail`) VALUES
    (1,'java',1,'从入门到放弃'),
    (2,'mysql',10,'从删库到跑路'),
    (3,'java',5,'从进门到进牢');