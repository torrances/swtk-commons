CREATE DATABASE  IF NOT EXISTS `swtk` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `swtk`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: swtk
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
-- Temporary table structure for view `ngram_tag_view`
--

DROP TABLE IF EXISTS `ngram_tag_view`;
/*!50001 DROP VIEW IF EXISTS `ngram_tag_view`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `ngram_tag_view` (
  `id` tinyint NOT NULL,
  `collection_name` tinyint NOT NULL,
  `gram_size` tinyint NOT NULL,
  `idf` tinyint NOT NULL,
  `term` tinyint NOT NULL,
  `tf` tinyint NOT NULL,
  `tfidf` tinyint NOT NULL,
  `gram_1` tinyint NOT NULL,
  `gram_2` tinyint NOT NULL,
  `gram_3` tinyint NOT NULL,
  `tag_name` tinyint NOT NULL,
  `tag_value` tinyint NOT NULL,
  `total_term_occurences_in_collection` tinyint NOT NULL,
  `total_document_occurences_in_collection` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `ngram_tag_view`
--

/*!50001 DROP TABLE IF EXISTS `ngram_tag_view`*/;
/*!50001 DROP VIEW IF EXISTS `ngram_tag_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`swtkuser`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `ngram_tag_view` AS select `n`.`id` AS `id`,`n`.`collection_name` AS `collection_name`,`n`.`gram_size` AS `gram_size`,`n`.`idf` AS `idf`,`n`.`term` AS `term`,`n`.`tf` AS `tf`,`n`.`tfidf` AS `tfidf`,`n`.`gram_1` AS `gram_1`,`n`.`gram_2` AS `gram_2`,`n`.`gram_3` AS `gram_3`,`nt`.`tag_name` AS `tag_name`,`nt`.`tag_value` AS `tag_value`,`tsv`.`total_occurrences_in_collection` AS `total_term_occurences_in_collection`,`tsv`.`total_document_occurrences_in_collection` AS `total_document_occurences_in_collection` from ((`ngram` `n` join `ngram_tag` `nt` on((`n`.`id` = `nt`.`ngram_id`))) join `term_summary_vector` `tsv` on((`tsv`.`id` = `n`.`term_summary_vector_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Dumping routines for database 'swtk'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-01-08 14:43:43
