CREATE DATABASE  IF NOT EXISTS `cursojava` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `cursojava`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: cursojava
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `assentos`
--

DROP TABLE IF EXISTS `assentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assentos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assentos`
--

LOCK TABLES `assentos` WRITE;
/*!40000 ALTER TABLE `assentos` DISABLE KEYS */;
INSERT INTO `assentos` VALUES (1,'16A'),(2,'8F'),(3,'7A'),(4,'7A'),(5,'4D');
/*!40000 ALTER TABLE `assentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atores`
--

DROP TABLE IF EXISTS `atores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `atores` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atores`
--

LOCK TABLES `atores` WRITE;
/*!40000 ALTER TABLE `atores` DISABLE KEYS */;
INSERT INTO `atores` VALUES (1,'Harrison Ford'),(2,'Carrie Fisher');
/*!40000 ALTER TABLE `atores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atores_filmes`
--

DROP TABLE IF EXISTS `atores_filmes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `atores_filmes` (
  `filme_id` bigint NOT NULL,
  `ator_id` bigint NOT NULL,
  KEY `FKfqa43dvxs05vf5r5meqbxagfx` (`ator_id`),
  KEY `FK6lrsiysm8ta3wo04v23e3nc7e` (`filme_id`),
  CONSTRAINT `FK6lrsiysm8ta3wo04v23e3nc7e` FOREIGN KEY (`filme_id`) REFERENCES `filmes` (`id`),
  CONSTRAINT `FKfqa43dvxs05vf5r5meqbxagfx` FOREIGN KEY (`ator_id`) REFERENCES `atores` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atores_filmes`
--

LOCK TABLES `atores_filmes` WRITE;
/*!40000 ALTER TABLE `atores_filmes` DISABLE KEYS */;
INSERT INTO `atores_filmes` VALUES (1,1),(1,2),(2,1);
/*!40000 ALTER TABLE `atores_filmes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `assento_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_puhog99p2mtoiwu7eamlj0wmr` (`assento_id`),
  CONSTRAINT `FKkd05xa5ufjrvggddrmbc6vptq` FOREIGN KEY (`assento_id`) REFERENCES `assentos` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'Ana',1),(2,'Felipe',2),(3,'Carlos',3),(6,'Rodrigo',5);
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compradores`
--

DROP TABLE IF EXISTS `compradores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compradores` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compradores`
--

LOCK TABLES `compradores` WRITE;
/*!40000 ALTER TABLE `compradores` DISABLE KEYS */;
INSERT INTO `compradores` VALUES (1,'Mateus da Terra'),(2,'Billian Kraus'),(3,'Wilhelm BX');
/*!40000 ALTER TABLE `compradores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compradores_veiculos`
--

DROP TABLE IF EXISTS `compradores_veiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compradores_veiculos` (
  `compradores_id` bigint NOT NULL,
  `veiculos_id` bigint NOT NULL,
  KEY `FKcdi16olwq554lkpk9np5s7qay` (`veiculos_id`),
  KEY `FK44bk0klo6uf7x6aj6nhb6yle4` (`compradores_id`),
  CONSTRAINT `FK44bk0klo6uf7x6aj6nhb6yle4` FOREIGN KEY (`compradores_id`) REFERENCES `compradores` (`id`),
  CONSTRAINT `FKcdi16olwq554lkpk9np5s7qay` FOREIGN KEY (`veiculos_id`) REFERENCES `veiculos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compradores_veiculos`
--

LOCK TABLES `compradores_veiculos` WRITE;
/*!40000 ALTER TABLE `compradores_veiculos` DISABLE KEYS */;
INSERT INTO `compradores_veiculos` VALUES (1,1),(1,2),(1,3),(2,4),(2,5),(3,3),(3,6);
/*!40000 ALTER TABLE `compradores_veiculos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `filmes`
--

DROP TABLE IF EXISTS `filmes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `filmes` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `nota` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `filmes`
--

LOCK TABLES `filmes` WRITE;
/*!40000 ALTER TABLE `filmes` DISABLE KEYS */;
INSERT INTO `filmes` VALUES (1,'Star Wars Episódio 4',8.9),(2,'O Fugitivo',8.1);
/*!40000 ALTER TABLE `filmes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fornecedores`
--

DROP TABLE IF EXISTS `fornecedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornecedores` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `complemento` varchar(255) DEFAULT NULL,
  `logradouro` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornecedores`
--

LOCK TABLES `fornecedores` WRITE;
/*!40000 ALTER TABLE `fornecedores` DISABLE KEYS */;
INSERT INTO `fornecedores` VALUES (1,'14a','Rua John People 123','Zé do Pastel');
/*!40000 ALTER TABLE `fornecedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionarios`
--

DROP TABLE IF EXISTS `funcionarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionarios` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `complemento` varchar(255) DEFAULT NULL,
  `logradouro` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionarios`
--

LOCK TABLES `funcionarios` WRITE;
/*!40000 ALTER TABLE `funcionarios` DISABLE KEYS */;
INSERT INTO `funcionarios` VALUES (1,'1b','Rua Kaiser 1918','Invitational Rodrigo');
/*!40000 ALTER TABLE `funcionarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itempedido`
--

DROP TABLE IF EXISTS `itempedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itempedido` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `preco` double NOT NULL,
  `quantidade` int NOT NULL,
  `pedido_id` bigint DEFAULT NULL,
  `produto_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKige1sp3jgvj7mi8wb2koawsxp` (`pedido_id`),
  KEY `FKpaf858hjsf06ayv0wn6ridwm1` (`produto_id`),
  CONSTRAINT `FKige1sp3jgvj7mi8wb2koawsxp` FOREIGN KEY (`pedido_id`) REFERENCES `pedido` (`id`),
  CONSTRAINT `FKpaf858hjsf06ayv0wn6ridwm1` FOREIGN KEY (`produto_id`) REFERENCES `produtos` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itempedido`
--

LOCK TABLES `itempedido` WRITE;
/*!40000 ALTER TABLE `itempedido` DISABLE KEYS */;
INSERT INTO `itempedido` VALUES (1,2789.99,10,3,4);
/*!40000 ALTER TABLE `itempedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedido` (
  `id` bigint NOT NULL,
  `data` datetime(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
INSERT INTO `pedido` VALUES (3,'2021-12-21 17:33:08.449000');
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produtos`
--

DROP TABLE IF EXISTS `produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produtos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `prod_nome` varchar(200) NOT NULL,
  `prod_preco` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produtos`
--

LOCK TABLES `produtos` WRITE;
/*!40000 ALTER TABLE `produtos` DISABLE KEYS */;
INSERT INTO `produtos` VALUES (1,'Caneta',7.45),(2,'Notebook',2987.78),(3,'Monitor 23',789.98),(4,'Geladeira',2789.99);
/*!40000 ALTER TABLE `produtos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sobrinho`
--

DROP TABLE IF EXISTS `sobrinho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sobrinho` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sobrinho`
--

LOCK TABLES `sobrinho` WRITE;
/*!40000 ALTER TABLE `sobrinho` DISABLE KEYS */;
INSERT INTO `sobrinho` VALUES (1,'Davi'),(2,'Ana');
/*!40000 ALTER TABLE `sobrinho` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tio`
--

DROP TABLE IF EXISTS `tio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tio` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tio`
--

LOCK TABLES `tio` WRITE;
/*!40000 ALTER TABLE `tio` DISABLE KEYS */;
INSERT INTO `tio` VALUES (1,'Maria'),(2,'João');
/*!40000 ALTER TABLE `tio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tio_sobrinho`
--

DROP TABLE IF EXISTS `tio_sobrinho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tio_sobrinho` (
  `tios_id` bigint NOT NULL,
  `sobrinhos_id` bigint NOT NULL,
  KEY `FK2mrff04i3o52mu0wp6l4yyfbw` (`sobrinhos_id`),
  KEY `FKgreuq3pwcrypeyp3xwb55ca3y` (`tios_id`),
  CONSTRAINT `FK2mrff04i3o52mu0wp6l4yyfbw` FOREIGN KEY (`sobrinhos_id`) REFERENCES `sobrinho` (`id`),
  CONSTRAINT `FKgreuq3pwcrypeyp3xwb55ca3y` FOREIGN KEY (`tios_id`) REFERENCES `tio` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tio_sobrinho`
--

LOCK TABLES `tio_sobrinho` WRITE;
/*!40000 ALTER TABLE `tio_sobrinho` DISABLE KEYS */;
INSERT INTO `tio_sobrinho` VALUES (1,1),(1,2),(2,1),(2,2);
/*!40000 ALTER TABLE `tio_sobrinho` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'felipe@email.com.br','Felipe'),(2,'brayon@email.com.br','Brayon'),(3,'benio@email.com.br','Benio'),(4,'mariogames@email.com.br','Mario Games'),(5,'marioganha@email.com.br','Mario Ganha');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `veiculos`
--

DROP TABLE IF EXISTS `veiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `veiculos` (
  `veiculo_tipo` varchar(31) NOT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `marca` varchar(255) DEFAULT NULL,
  `modelo` varchar(255) DEFAULT NULL,
  `manivela_direcao` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `veiculos`
--

LOCK TABLES `veiculos` WRITE;
/*!40000 ALTER TABLE `veiculos` DISABLE KEYS */;
INSERT INTO `veiculos` VALUES ('VeiculoDuasRodas',1,'Harley Davidson','Fatboy','Guidão Peixeira Alto'),('VeiculoDuasRodas',2,'Caloi','Bicicleta Esportiva','Guidão baixo'),('VeiculoQuatroRodas',3,'Fiat','Uno Bruxo só o dok','Volante Fiat 89'),('VeiculoQuatroRodas',4,'Volkswagen','Up TSI','Volante VW Esportivo 2018'),('VeiculoQuatroRodas',5,'Volkswagen','Gol Sport G8','Volante VW Esportivo 2018'),('VeiculoDuasRodas',6,'Honda','Biz 2009','Guidão Biz padrão');
/*!40000 ALTER TABLE `veiculos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-24 12:55:53
