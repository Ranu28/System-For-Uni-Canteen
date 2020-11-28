-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Generation Time: Nov 27, 2020 at 11:47 PM
-- Server version: 5.7.28
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `universitycanteen`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee_details`
--

DROP TABLE IF EXISTS `employee_details`;
CREATE TABLE IF NOT EXISTS `employee_details` (
  `EmployeeID` int(5) NOT NULL AUTO_INCREMENT,
  `Type` varchar(7) NOT NULL,
  `FirstName` varchar(100) NOT NULL,
  `LastName` varchar(200) NOT NULL,
  `NationalID` varchar(12) NOT NULL,
  `PhoneNo` int(10) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `Address` varchar(500) DEFAULT NULL,
  `UserName` varchar(10) NOT NULL,
  `Password` varchar(100) NOT NULL,
  PRIMARY KEY (`EmployeeID`),
  UNIQUE KEY `UserName` (`UserName`),
  UNIQUE KEY `NationalID` (`NationalID`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee_details`
--

INSERT INTO `employee_details` (`EmployeeID`, `Type`, `FirstName`, `LastName`, `NationalID`, `PhoneNo`, `Gender`, `Email`, `Address`, `UserName`, `Password`) VALUES
(1, 'cashier', 'Sahan', 'James', '991273175v', 718392739, '', 'aaaa@gmail.com', 'wdeewdffsdfsdfsdf', 'sahan', '11111');

-- --------------------------------------------------------

--
-- Table structure for table `food_item`
--

DROP TABLE IF EXISTS `food_item`;
CREATE TABLE IF NOT EXISTS `food_item` (
  `food_ID` int(11) NOT NULL AUTO_INCREMENT,
  `food_name` varchar(100) NOT NULL,
  `prize` decimal(10,0) NOT NULL,
  PRIMARY KEY (`food_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
