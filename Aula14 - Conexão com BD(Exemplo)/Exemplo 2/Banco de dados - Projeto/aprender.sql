


CREATE DATABASE `aprender` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `aprender`;
CREATE TABLE `cliente` (
  `cli_cod` int(11) NOT NULL AUTO_INCREMENT,
  `cli_nome` varchar(50) NOT NULL DEFAULT '',
  `cli_email` varchar(50) NOT NULL DEFAULT '',
  `cli_tel` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`cli_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
INSERT INTO `cliente` VALUES (1,'Fabio','sdasd',23432);
INSERT INTO `cliente` VALUES (2,'ewwqe','asdasd',12312);
INSERT INTO `cliente` VALUES (3,'Fabio','fabio@bol.com.br',54432110);
INSERT INTO `cliente` VALUES (4,'dssdsd','hagsha',763276);


