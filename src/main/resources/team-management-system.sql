/*
SQLyog Enterprise - MySQL GUI v8.05 
MySQL - 5.6.34 : Database - team_management_system
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`team_management_system` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `team_management_system`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `adminId` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `roles` char(1) DEFAULT NULL,
  `createdById` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`adminId`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

/*Data for the table `admin` */

insert  into `admin`(`adminId`,`email`,`firstName`,`lastName`,`password`,`roles`,`createdById`) values (1,'admin','sunita','joshi','$2a$10$ezNuHwBXI1kZxAEenXWYMO5dYmze0FaCXELM/y16sdNFG2KB5UfN.','S',0),(21,'user','sunita','joshi','$2a$10$ezNuHwBXI1kZxAEenXWYMO5dYmze0FaCXELM/y16sdNFG2KB5UfN.','A',0),(22,'rt4r','rttt','ghy','$2a$10$zxWCJhfvMDl/sj6zuqV3GehuuWW3KmEHlvkKMX.9uX2GdA6iFqxye','A',NULL),(23,'sonu@gmail.com','sonu','joshi','$2a$10$y1qtroWqdnpWbjBqMU84X.FwyYb6I7jX8NPPh6bZg/NUDJ5bupYNe','A',NULL);

/*Table structure for table `league` */

DROP TABLE IF EXISTS `league`;

CREATE TABLE `league` (
  `leagueId` bigint(20) NOT NULL AUTO_INCREMENT,
  `countryName` varchar(255) DEFAULT NULL,
  `leagueManager` varchar(255) DEFAULT NULL,
  `leagueName` varchar(255) DEFAULT NULL,
  `createdById` bigint(20) DEFAULT NULL,
  `playerId` bigint(20) DEFAULT NULL,
  `teamId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`leagueId`),
  KEY `FK_efh2q7ltu9m3u9wtvqdc5vfvr` (`playerId`),
  KEY `FK_d9jyjg72vlqx4jqfwp8b5xiql` (`teamId`),
  CONSTRAINT `FK_d9jyjg72vlqx4jqfwp8b5xiql` FOREIGN KEY (`teamId`) REFERENCES `team` (`teamId`),
  CONSTRAINT `FK_efh2q7ltu9m3u9wtvqdc5vfvr` FOREIGN KEY (`playerId`) REFERENCES `player` (`playerId`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;

/*Data for the table `league` */

insert  into `league`(`leagueId`,`countryName`,`leagueManager`,`leagueName`,`createdById`,`playerId`,`teamId`) values (3,'rgreh','rtyg5rt','rgert',NULL,NULL,NULL),(4,'xhfg','gfhtg','gfhtf',NULL,NULL,NULL),(28,'efre','ee','ere',21,NULL,NULL);

/*Table structure for table `player` */

DROP TABLE IF EXISTS `player`;

CREATE TABLE `player` (
  `playerId` bigint(20) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `leagueId` bigint(20) DEFAULT NULL,
  `teamId` bigint(20) DEFAULT NULL,
  `createdById` bigint(20) NOT NULL,
  PRIMARY KEY (`playerId`),
  KEY `FK_e9ibts1dpa1yj2fdbj8hkj75h` (`leagueId`),
  KEY `FK_s6kvwf420cd3cpai88hksd83o` (`teamId`),
  CONSTRAINT `FK_e9ibts1dpa1yj2fdbj8hkj75h` FOREIGN KEY (`leagueId`) REFERENCES `league` (`leagueId`),
  CONSTRAINT `FK_s6kvwf420cd3cpai88hksd83o` FOREIGN KEY (`teamId`) REFERENCES `team` (`teamId`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

/*Data for the table `player` */

insert  into `player`(`playerId`,`age`,`email`,`firstName`,`lastName`,`password`,`leagueId`,`teamId`,`createdById`) values (10,122,'sunita@f1soft.com','ss','fgg','122',NULL,NULL,0),(12,5,'sonu@gmail.com','f','ggg','5',NULL,NULL,0),(15,6,'sunita@f1soft.com','g','h','2',NULL,NULL,0);

/*Table structure for table `team` */

DROP TABLE IF EXISTS `team`;

CREATE TABLE `team` (
  `teamId` bigint(20) NOT NULL AUTO_INCREMENT,
  `playerName` varchar(255) DEFAULT NULL,
  `teamManager` varchar(255) DEFAULT NULL,
  `teamName` varchar(255) DEFAULT NULL,
  `leagueId` bigint(20) DEFAULT NULL,
  `playerId` bigint(20) DEFAULT NULL,
  `createdById` bigint(20) NOT NULL,
  PRIMARY KEY (`teamId`),
  KEY `FK_hulrq9anc475vkfxtwpdxhfs8` (`leagueId`),
  KEY `FK_mnl9xx1xd1tt3rqkpubjsfgjd` (`playerId`),
  CONSTRAINT `FK_hulrq9anc475vkfxtwpdxhfs8` FOREIGN KEY (`leagueId`) REFERENCES `league` (`leagueId`),
  CONSTRAINT `FK_mnl9xx1xd1tt3rqkpubjsfgjd` FOREIGN KEY (`playerId`) REFERENCES `player` (`playerId`)
) ENGINE=InnoDB AUTO_INCREMENT=140 DEFAULT CHARSET=latin1;

/*Data for the table `team` */

insert  into `team`(`teamId`,`playerName`,`teamManager`,`teamName`,`leagueId`,`playerId`,`createdById`) values (29,'sunita','mooo','Sunita joshiggg',NULL,NULL,0),(43,'jklk;l','jhlk;;ll;','sunita ',NULL,NULL,0),(56,'gtfghtr','rgrtg','shhh',NULL,NULL,0),(64,'rtgr','rgrf','rgr',NULL,NULL,0),(65,'ggg','ggjjj','rtrtgt',NULL,NULL,0),(66,'yyhyh','jjj','frg',NULL,NULL,0),(139,'er3e','were3r','frt4e',NULL,NULL,21);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
