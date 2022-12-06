CREATE DATABASE CONEXAOBD;
USE CONEXAOBD;


CREATE TABLE `cliente` (
  `cli_cod` int(11) NOT NULL AUTO_INCREMENT,
  `cli_nome` varchar(255) DEFAULT NULL,
  `cli_tel` int(11) DEFAULT NULL,
  PRIMARY KEY (`cli_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
INSERT INTO `cliente` VALUES (14,'Felipe Reis',55172140);
INSERT INTO `cliente` VALUES (15,'Nathalia de Oliveira Mendes',58336819);
INSERT INTO `cliente` VALUES (16,'Luana Martins',58945885);
INSERT INTO `cliente` VALUES (17,'Raul Lima',58999719);
