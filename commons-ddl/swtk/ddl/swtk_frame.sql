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
-- Table structure for table `frame`
--

DROP TABLE IF EXISTS `frame`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `frame` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `subject` varchar(512) DEFAULT NULL,
  `predicate` varchar(512) DEFAULT NULL,
  `object` varchar(512) DEFAULT NULL,
  `context` blob,
  `source` varchar(512) DEFAULT NULL,
  `question_type_id` int(11) DEFAULT NULL,
  `confidence` double DEFAULT '100',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `question_type_id` (`question_type_id`),
  CONSTRAINT `question_type_id` FOREIGN KEY (`question_type_id`) REFERENCES `question_type` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='QA Frame';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `frame`
--

LOCK TABLES `frame` WRITE;
/*!40000 ALTER TABLE `frame` DISABLE KEYS */;
INSERT INTO `frame` VALUES (78,NULL,NULL,'bar','Round, square, rectangular, oval, half-round and half-oval products, usually ordered in random lengths.',NULL,7,100),(79,NULL,NULL,'bolting','Fastening element provided with thread.',NULL,7,100),(80,NULL,NULL,'nut','Fastening element provided with female thread.',NULL,7,100),(81,NULL,NULL,'casting','Product obtained by pouring molten metal into a mould.',NULL,7,100),(82,NULL,NULL,'flanges and fittings','Standard piping components other than tube/pipe, valves, bolting and gaskets.',NULL,7,100),(83,NULL,NULL,'forging','Metal product, hot worked or hot stamped into a desired shape.',NULL,7,100),(84,NULL,NULL,'pipe','Tubular product; sizes up to and including DN 300 indicated by a nominal size roughly corresponding to the inside diameter sizes larger than DN 300 indicated by the outside diameter. Pipe is usually ordered in random lengths.',NULL,7,100),(85,NULL,NULL,'plate','Flat product, minimum thickness approximately 6 mm (0.236 in) and minimum width approximately 300 mm (11.81 in).',NULL,7,100),(86,NULL,NULL,'section','A shape that is long in relation to its cross-sectional dimensions, having a cross section other than those of wire, rod, bar, tube, tubing and pipe, such as L, U, I, T, etc.',NULL,7,100),(87,NULL,NULL,'sheet','Flat product, thickness less than 6 mm (0.236 in) and minimum width approximately 300 mm (11.81 in).',NULL,7,100),(88,NULL,NULL,'strip','Flat product, maximum width approximately 300 mm (11.81 in) and maximum thickness approximately 1/6 of the width.',NULL,7,100),(89,NULL,NULL,'tube','Tubular product, indicated by the outside diameter and usually ordered cut to a specific length.',NULL,7,100),(90,NULL,NULL,'tubing','Tubular product of small diameter, indicated by the outside diameter and usually ordered in long lengths.',NULL,7,100),(91,NULL,NULL,'wire','Round product, usually ordered in long lengths.',NULL,7,100),(92,NULL,NULL,'chloride stress corrosion','Chloride stress corrosion is a type of intergranular corrosion and occurs in austenitic stainless steel under tensile stress in the presence of oxygen, chloride ions, and high temperature.',NULL,7,100),(93,NULL,NULL,'corrosion of metals','The corrosion of metals is a natural process.',NULL,7,100),(94,NULL,NULL,'corrosion','Corrosion is the natural deterioration of a metal in which metallic atoms leave the metal or form compounds in the presence of water or gases.',NULL,7,100),(95,NULL,NULL,'corrosion','Corrosion is the deterioration of a material due to interaction with its environment.',NULL,7,100),(96,NULL,NULL,'corrosion','Corrosion is electrochemical by nature.',NULL,7,100),(97,NULL,NULL,'scc','SCC is a type of intergranular attack corrosion that occurs at the grain boundaries under tensile stress.',NULL,7,100),(98,NULL,NULL,'slip','A slip is when layers of atoms within the crystal structure move in relation to adjacent layers of atoms.',NULL,7,100),(99,NULL,NULL,'stainless steel','corrosion resistant',NULL,7,100),(100,NULL,NULL,'critical environmental species','critical environmental species such as hydroxides, chlorides, and oxygen ',NULL,7,100),(101,NULL,NULL,'destructive forces','destructive forces such as stress, fatigue, and other forms of chemical attack.',NULL,7,100),(102,NULL,NULL,'noble metals','Even the noble metals, such as gold, are subject to corrosive attack in some environments.',NULL,7,100),(103,NULL,NULL,'corrosion resistant materials','corrosion-resistant materials such as stainless steel and nickel, chromium, and molybdenum alloys.',NULL,7,100),(104,NULL,NULL,'protective coatings','protective coatings such as paints and epoxies.',NULL,7,100),(105,NULL,NULL,'destructive processes','destructive processes such as stress, fatigue, erosion, and other forms of chemical attack.',NULL,7,100),(106,NULL,NULL,'solids','Solids, such as sand, scale and corrosion products, in the produced_water can cause erosion of the injection_system and have to be properly controlled.',NULL,7,100),(107,NULL,NULL,'galvanic corrosion','Galvanic corrosion occurs when two dissimilar metals with different potentials are placed in electrical contact in an electrolyte.',NULL,7,100),(108,NULL,NULL,'general corrosion','General corrosion involving water and steel generally results from chemical action where the steel surface oxidizes, forming iron oxide (rust).',NULL,7,100),(109,NULL,NULL,'localized corrosion','Localized corrosion is defined as the selective removal of metal by corrosion at small areas or zones on a metal surface in contact with a corrosive environment, usually a liquid.',NULL,7,100),(110,'corrosion-resistant materials',NULL,'general corrosion','The use of corrosion-resistant materials such as stainless steel and nickel, chromium, and molybdenum alloys.',NULL,8,100),(111,'protective coatings',NULL,'general corrosion','The use of protective coatings such as paints and epoxies.',NULL,8,100),(112,'metallic and nonmetallic coatings or linings',NULL,'general corrosion','The application of metallic and nonmetallic coatings or linings to the surface which protects against corrosion, but allows the material to retain its structural strength (for example, a carbon steel pressure vessel with stainless steel cladding as a liner).',NULL,8,100),(113,'In the absence of appreciable amounts of oxygen',NULL,'galvanic corrosion','In the absence of appreciable amounts of oxygen, the threat of galvanic corrosion is greatly reduced, for example produced water.',NULL,8,100),(114,'the design of equipment',NULL,'galvanic corrosion','the design of equipment can be handled in a number of different ways to minimize galvanic corrosion.',NULL,8,100),(115,'clean stainless steel tools to prepare and clean welds.',NULL,'iron contamination','care should be taken to minimize iron contamination, for instance, by using clean stainless steel tools to prepare and clean welds.',NULL,8,100),(116,'grain boundaries',NULL,'slip',NULL,NULL,8,100),(117,'grain size descrease',NULL,'grain boundary increase','The smaller the grain size, the larger the grain boundary area.',NULL,2,100),(118,'grain size descrease',NULL,'grain boundary increase','Decreasing the grain size through cold or hot working of the metal tends to retard slip and thus increases the strength of the metal.',NULL,2,100),(119,'grain size descrease',NULL,'slip prevention','Decreasing the grain size through cold or hot working of the metal tends to retard slip and thus increases the strength of the metal.',NULL,2,100),(120,'grain size descrease',NULL,'metal strength increase','Decreasing the grain size through cold or hot working of the metal tends to retard slip and thus increases the strength of the metal.',NULL,2,100),(121,NULL,'determine','elastic limit','The method of determining the elastic limit would have to include a succession of slightly increasing loads with intervening complete unloading for the detection of the first plastic deformation or permanent set',NULL,11,100),(122,NULL,'perform','microbiological surveillance','microbiological surveillance is performed using a combination of biological techniques to determine the concentration of microbes in the system, both those freely floating in suspension (planktonic) and those attached to surfaces (sessile)',NULL,11,100),(123,NULL,'reduce','capillary attraction','Flange faces can be machined with grooves which reduce capillary attraction and act as crevice breakers',NULL,11,100),(124,'copper materials',NULL,'heat exchanger tubing','copper materials have historically been used for some pipe work and heat exchanger tubing for oxygenated seawater systems.',NULL,9,100),(125,'ecr-glass',NULL,'internal surface veils','ecr-glass is often used for internal surface veils when severe corrosive conditions occur.',NULL,9,100),(126,'holding tank',NULL,'liberation of dissolved gas','in situations where a stripping gas tower and catalytic combustion methods are used for oxygen removal the holding tank also aids the liberation of dissolved gas and consequently reduces pump cavitation.',NULL,9,100),(127,'copper-based alloys',NULL,'low pressure applications','copper-based alloys are usually thin because they are mostly used for low-pressure applications.',NULL,9,100),(128,'monitoring the performance of the antifouling measures',NULL,'macrobial surveillance','Macrobial surveillance is achieved primarily by monitoring the performance of the antifouling measures that are put in place: dosimetry of injected hypochlorite (rates and totals) current traces for electrochemical generators as well as use of test kits that measure the residual biocide present in the water after it has reacted with any biological material.',NULL,9,100),(129,'copper materials',NULL,'pipe work','copper materials have historically been used for some pipe work and heat exchanger tubing for oxygenated seawater systems.',NULL,9,100),(130,'oxygen scavenger injection',NULL,'polishing','this is however not a problem as the oxygen scavenger injection used for polishing is able to reduce the dissolved oxygen concentration down to <10 ppb.',NULL,9,100),(131,'force applied to metal',NULL,'slip','A slip happens when force is applied to a metal',NULL,9,100),(132,'254SMO grade',NULL,'seawater piping','254SMO grade has been extensively used successfully for seawater piping in Norwegian assets and also in Malaysia.',NULL,9,100),(133,'copper-nickel',NULL,'seawater piping 90/10','copper-nickel 90/10 has been extensively used for seawater piping in firewater applications but is susceptibility to erosion at certain flow rate.',NULL,9,100),(134,'c-glass',NULL,'surface veils','c-glass is used for surface veils.',NULL,9,100),(135,'potable water',NULL,'wash water application','potable water used for wash water application can be added to the surface water.',NULL,9,100),(136,'several generic classes of source water',NULL,'water injection','there are several generic classes of source water that are used for water injection.',NULL,9,100);
/*!40000 ALTER TABLE `frame` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-01-08 14:43:42
