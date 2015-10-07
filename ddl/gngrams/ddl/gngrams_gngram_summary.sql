CREATE DATABASE  IF NOT EXISTS `gngrams` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `gngrams`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: gngrams
-- ------------------------------------------------------
-- Server version	5.6.21-log

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
-- Table structure for table `gngram_summary`
--

DROP TABLE IF EXISTS `gngram_summary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gngram_summary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `term` varchar(512) NOT NULL,
  `collection_name` varchar(512) NOT NULL,
  `total_adj` double DEFAULT '0' COMMENT 'Adjective',
  `total_adp` double DEFAULT '0' COMMENT 'Adposition',
  `total_adv` double DEFAULT '0' COMMENT 'Adverb',
  `total_aux` double DEFAULT '0' COMMENT 'Auxiliary Verb',
  `total_conj` double DEFAULT '0' COMMENT 'Conjunction',
  `total_det` double DEFAULT '0' COMMENT 'Determiner',
  `total_intj` double DEFAULT '0' COMMENT 'Interjection',
  `total_noun` double DEFAULT '0' COMMENT 'Noun',
  `total_num` double DEFAULT '0' COMMENT 'Numeral',
  `total_part` double DEFAULT '0' COMMENT 'Particle',
  `total_pron` double DEFAULT '0' COMMENT 'Pronoun',
  `total_propn` double DEFAULT '0' COMMENT 'Proper Noun',
  `total_punct` double DEFAULT '0' COMMENT 'Punctuation',
  `total_sconj` double DEFAULT '0' COMMENT 'Subordinating Conjunction',
  `total_sym` double DEFAULT '0' COMMENT 'Symbol',
  `total_verb` double DEFAULT '0' COMMENT 'Verb',
  `total_x` double DEFAULT '0' COMMENT 'Other',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=142 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-01-10 16:19:49
