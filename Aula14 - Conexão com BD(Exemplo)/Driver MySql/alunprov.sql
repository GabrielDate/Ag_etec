CREATE DATABASE etecprov;


USE  etecprov;

create table aluno (  alun_cod integer NOT NULL AUTO_INCREMENT ,
                                       alun_nome varchar(50)  ,
                                       alun_end varchar(50) ,
                                       alun_tel int(11) ,
                                       alun_email varchar(50) ,     
                                       alun_serie varchar (10),
                                       PRIMARY KEY(alun_cod)) ;
INSERT INTO `aluno` VALUES (1,'Ricardo','Rua do Roseiral ',322334,'ric@uol.com.br','quarta');
INSERT INTO `aluno` VALUES (2,'Jose','Rua Marconi ',23453,'jo@jo.com.br','quarta');
INSERT INTO `aluno` VALUES (3,'Fabiano','Estrada da Baronesa ',22223333,'fab@hotmail.com','quarta');
INSERT INTO `aluno` VALUES (4,'Julio Rocha','Estrada da Baronesa ',55553333,'jr@bol.com','quarta');
INSERT INTO `aluno` VALUES (5,'Marcia','Av Olimpia 333 ',56123452,'mama@flix.com.br','quarta');
INSERT INTO `aluno` VALUES (6,'July','Rua Turibio de Sousa',98844332,'ju@hotmail.com.br','quarta');
INSERT INTO `aluno` VALUES (7,'Mariana','Rua dos justus',98844332,'mari@uol.com.br','quarta');
INSERT INTO `aluno` VALUES (8,'Laurinda','Travessa Marcilino',56632345,'lau@zap.com.br','quarta');
INSERT INTO `aluno` VALUES (9,'Roberta','Rua XII de Março',78864332,'roro@netflix.com.br','quarta');

