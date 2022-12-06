
USE `conexaobd`;



CREATE TABLE `cliente` (
  `cli_cod` int(11) NOT NULL AUTO_INCREMENT,
  `cli_nome` varchar(255) DEFAULT NULL,
  `cli_tel` int(11) DEFAULT NULL,
  PRIMARY KEY (`cli_cod`));


INSERT INTO `cliente` VALUES (15,'Nathalia de Oliveira Mendes',58336819);
INSERT INTO `cliente` VALUES (17,'Raul Lima',58999719);
INSERT INTO `cliente` VALUES (18,'joselito',12233445);
INSERT INTO `cliente` VALUES (19,'adasdas',34343);



