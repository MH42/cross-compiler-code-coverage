-- MySQL dump 10.15  Distrib 10.0.17-MariaDB, for osx10.6 (i386)
--
-- Host: localhost    Database: tc3_template
-- ------------------------------------------------------
-- Server version	10.0.17-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `EclipseHupaR1684702_Statistics`
--

DROP TABLE IF EXISTS `EclipseHupaR1684702_Statistics`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EclipseHupaR1684702_Statistics` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cid` varchar(512) COLLATE latin1_general_ci DEFAULT NULL,
  `block` tinyint(1) NOT NULL DEFAULT '0',
  `body_declaration` tinyint(1) NOT NULL DEFAULT '0',
  `catch_clause` tinyint(1) NOT NULL DEFAULT '0',
  `class` tinyint(1) NOT NULL DEFAULT '0',
  `conditional_expression` tinyint(1) NOT NULL DEFAULT '0',
  `conditional_then_expression` tinyint(1) NOT NULL DEFAULT '0',
  `conditional_else_expression` tinyint(1) NOT NULL DEFAULT '0',
  `constructor_invocation` tinyint(1) NOT NULL DEFAULT '0',
  `do_stmt` tinyint(1) NOT NULL DEFAULT '0',
  `else_stmt` tinyint(1) NOT NULL DEFAULT '0',
  `enum` tinyint(1) NOT NULL DEFAULT '0',
  `field` tinyint(1) NOT NULL DEFAULT '0',
  `if_stmt` tinyint(1) NOT NULL DEFAULT '0',
  `loop_stmt` tinyint(1) NOT NULL DEFAULT '0',
  `loop_body` tinyint(1) NOT NULL DEFAULT '0',
  `method` tinyint(1) NOT NULL DEFAULT '0',
  `method_invocation` tinyint(1) NOT NULL DEFAULT '0',
  `statement` tinyint(1) NOT NULL DEFAULT '0',
  `switch_case` tinyint(1) NOT NULL DEFAULT '0',
  `switch_stmt` tinyint(1) NOT NULL DEFAULT '0',
  `then_stmt` tinyint(1) NOT NULL DEFAULT '0',
  `throw_stmt` tinyint(1) NOT NULL DEFAULT '0',
  `try_stmt` tinyint(1) NOT NULL DEFAULT '0',
  `type_declaration` tinyint(1) NOT NULL DEFAULT '0',
  `annotation_type_declaration` tinyint(1) NOT NULL DEFAULT '0',
  `annotation_type_member_declaration` tinyint(1) NOT NULL DEFAULT '0',
  `enum_constant_declaration` tinyint(1) NOT NULL DEFAULT '0',
  `initializer` tinyint(1) NOT NULL DEFAULT '0',
  `constructor_declaration` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `cid` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EclipseHupaR1684702_Statistics`
--

LOCK TABLES `EclipseHupaR1684702_Statistics` WRITE;
/*!40000 ALTER TABLE `EclipseHupaR1684702_Statistics` DISABLE KEYS */;
/*!40000 ALTER TABLE `EclipseHupaR1684702_Statistics` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test_logs`
--

DROP TABLE IF EXISTS `test_logs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `test_logs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cid` varchar(512) COLLATE latin1_general_ci NOT NULL,
  `testname` varchar(256) COLLATE latin1_general_ci NOT NULL,
  `amount` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `cid` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test_logs`
--

LOCK TABLES `test_logs` WRITE;
/*!40000 ALTER TABLE `test_logs` DISABLE KEYS */;
/*!40000 ALTER TABLE `test_logs` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-03-24  6:37:55
