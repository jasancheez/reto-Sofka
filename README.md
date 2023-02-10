# reto-Sofka
Reto Training Leagues Sofka Estación Espacial 

Configuración Base de Datos 

1. nombre: sofkabd_nave
2. username: root
3. password: admin
4. port: 3306


-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sofkabd_nave
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `nave`
--

DROP TABLE IF EXISTS `nave`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nave` (
                        `id_nave` int NOT NULL AUTO_INCREMENT,
                        `nombre_nave` varchar(45) DEFAULT NULL,
                        `categoria` varchar(45) DEFAULT NULL,
                        `pais` varchar(45) DEFAULT NULL,
                        `peso` varchar(45) DEFAULT NULL,
                        `potencia` varchar(45) DEFAULT NULL,
                        `cap_empuje` varchar(45) DEFAULT NULL,
                        `cap_carga` varchar(45) DEFAULT NULL,
                        `combustible` varchar(45) DEFAULT NULL,
                        PRIMARY KEY (`id_nave`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nave`
--

LOCK TABLES `nave` WRITE;
/*!40000 ALTER TABLE `nave` DISABLE KEYS */;
INSERT INTO `nave` VALUES (2,'marinerX','No tripulada','USA','502.9 kg','','222 Nw','79.4 kg','hidracina'),(3,'New Horizons','No tripulada ','USA','478 kg','','0.44kg','100 kg','hidracina y propelente'),(17,'pionnerX','no tripulada','USA','258kg','','26kg','','hidracina y propelente'),(18,'SaturnoV','Lanzadera','USA','2900 toneladas','32000*5 Hp','3500 toneladas','118 toneladas','propelente liquido'),(19,'Energia','Lanzadera','Rusia','2 400 000 kg','','29 000 - 32 000 kN2​','30-100 toneladas','oxigeno-hidrogeno liquido'),(20,'Delta IV','Lanzadera','USA','249 500 - 733 400 kg','','826,6 kN','','oxigeno-hidrogeno liquido'),(21,'Modulo lunar','Tripulada','USA','15200 kg','','15,6 kN ','',''),(22,'Vostok 1','Tripulada','Rusia','4 725 kilogramos','','','','');
/*!40000 ALTER TABLE `nave` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-09 23:33:30

