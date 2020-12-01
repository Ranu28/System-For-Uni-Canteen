-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Generation Time: Dec 01, 2020 at 07:23 AM
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
  `NationalID` bigint(12) NOT NULL,
  `PhoneNo` bigint(12) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `Address` varchar(500) DEFAULT NULL,
  `UserName` varchar(10) NOT NULL,
  `Password` varchar(100) NOT NULL,
  PRIMARY KEY (`EmployeeID`),
  UNIQUE KEY `UserName` (`UserName`),
  UNIQUE KEY `NationalID` (`NationalID`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee_details`
--

INSERT INTO `employee_details` (`EmployeeID`, `Type`, `FirstName`, `LastName`, `NationalID`, `PhoneNo`, `Gender`, `Email`, `Address`, `UserName`, `Password`) VALUES
(6, 'Manager', 'Thomas', 'Shelby', 98781123, 712222887, 'Male', 'tshelby@gmail.com', '66/8,colmbo rd, homagama', 'thomas', 'thomas123'),
(7, 'Cashier', 'sara', 'walker', 678888625, 77228736, 'Female', 'saraw@yagoo.com', '26, pitipana', 'sara', 'sara123');

-- --------------------------------------------------------

--
-- Table structure for table `fooditems`
--

DROP TABLE IF EXISTS `fooditems`;
CREATE TABLE IF NOT EXISTS `fooditems` (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `supplier` varchar(50) DEFAULT NULL,
  `category` varchar(50) DEFAULT NULL,
  `available` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=12224 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fooditems`
--

INSERT INTO `fooditems` (`fid`, `name`, `price`, `supplier`, `category`, `available`) VALUES
(12223, 'aaajaj', 123, '1123', 'Kottu', 'dinner');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
CREATE TABLE IF NOT EXISTS `orders` (
  `order_id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `p_number` int(10) NOT NULL,
  `order_details` varchar(300) NOT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`order_id`, `name`, `p_number`, `order_details`) VALUES
(1, 'hanna', 778181312, 'pizza'),
(2, 'howdie', 712323124, 'burger'),
(3, 'Shelby', 754326546, 'Fried rice');

-- --------------------------------------------------------

--
-- Table structure for table `supplier_details`
--

DROP TABLE IF EXISTS `supplier_details`;
CREATE TABLE IF NOT EXISTS `supplier_details` (
  `SupplierID` int(5) NOT NULL AUTO_INCREMENT,
  `SupplierFirstName` varchar(20) NOT NULL,
  `SupplierLastName` varchar(30) NOT NULL,
  `SupplierContactNo` int(10) NOT NULL,
  `SupplierAddress` varchar(200) DEFAULT NULL,
  `SupplierEmail` varchar(30) DEFAULT NULL,
  `CompanyName` varchar(20) DEFAULT NULL,
  `CompanyContactNo` int(10) DEFAULT NULL,
  `CompanyAddress` varchar(200) DEFAULT NULL,
  `CompanyEmail` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`SupplierID`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier_details`
--

INSERT INTO `supplier_details` (`SupplierID`, `SupplierFirstName`, `SupplierLastName`, `SupplierContactNo`, `SupplierAddress`, `SupplierEmail`, `CompanyName`, `CompanyContactNo`, `CompanyAddress`, `CompanyEmail`) VALUES
(4, 'adsd', 'sada', 2134, 'sdadsad', 'dasd', 'asdasd', 342, '', 'adad'),
(5, 'adsa', 'adssa', 3242, 'asadsd', 'asda', 'sasdasd', 3243, '', 'asdsa'),
(6, 'mmmmm', 'mmmmmm', 99999999, 'mmmmmmmm', 'mmmmm', 'mjmjmj', 1111111, 'mjmjmj', 'mjmjmj');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
