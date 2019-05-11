-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 11, 2019 at 10:15 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bus1`
--

-- --------------------------------------------------------

--
-- Table structure for table `addstop`
--

CREATE TABLE `addstop` (
  `stoppage` varchar(255) NOT NULL,
  `time` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `name` char(100) NOT NULL,
  `pwd` char(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`name`, `pwd`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `createroute`
--

CREATE TABLE `createroute` (
  `route` varchar(255) NOT NULL,
  `bno` varchar(255) DEFAULT NULL,
  `dname` varchar(255) DEFAULT NULL,
  `dno` varchar(255) DEFAULT NULL,
  `regno` varchar(255) DEFAULT NULL,
  `spoint` varchar(255) DEFAULT NULL,
  `tcost` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `createroute`
--

INSERT INTO `createroute` (`route`, `bno`, `dname`, `dno`, `regno`, `spoint`, `tcost`) VALUES
('104', '74589', 'Aman Deep', '4587456321', '78-74-56', 'HMT', '15000'),
('105', '741256', 'rohit', '974562147', '14-56-78', 'HMT', '15000'),
('305', '5421', 'something', '9874456321', '78-74-56', 'punchkula', '15000'),
('Ambala', '741256', 'xyz', '974562147', '78-74-56', 'Ambala', '25000'),
('chandigarh', '74123', 'something', '456321789', '78-74-56', 'chandigarh', '20000'),
('kalka', '5421', 'Mukul', '9874456321', '12321', 'kalka', '10'),
('Pinjore', '74123', 'preet Singh', '974562147', '14-56-78', 'Pinjore', '10000'),
('punchkula', '7458', 'sahil', '9874456321', '78-74-56', 'punchkula', '15000'),
('zirakpur', '74589', 'choudhary', '974562147', '78-74-56', 'zirakpur', '15000');

-- --------------------------------------------------------

--
-- Table structure for table `route`
--

CREATE TABLE `route` (
  `rcode` varchar(255) NOT NULL,
  `destination` varchar(255) DEFAULT NULL,
  `dname` varchar(255) DEFAULT NULL,
  `ppoint` varchar(255) DEFAULT NULL,
  `rname` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `route`
--

INSERT INTO `route` (`rcode`, `destination`, `dname`, `ppoint`, `rname`, `time`) VALUES
('102', 'baddi', 'swed', 'kalka , pinjore , old punchkula', 'pinjore', '9:00 '),
('103', 'baddi', 'Aman deep', 'HMT , old punchkula , pinjore', 'Ambala', '9:00 '),
('104', 'baddi', 'rajat', 'zirakpur , dhakoli , pinjore', 'zirakpur', '9:00 '),
('105', 'baddi', 'rohit', 'HMT , old punchkula , pinjore , baddi', 'pinjore', '9:00 '),
('305', 'baddi', 'rajat', 'punchkula,pinjore,baddi', 'punchkula', '8:45'),
('401', 'baddi', 'sahil', 'punchkula,pinjore', 'punchkula', '9:00 ');

-- --------------------------------------------------------

--
-- Table structure for table `sign1`
--

CREATE TABLE `sign1` (
  `rno` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `pp` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  `routename` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sign1`
--

INSERT INTO `sign1` (`rno`, `email`, `fname`, `lname`, `mobile`, `pp`, `pwd`, `routename`) VALUES
('123', 'abc@gmail.com', 'abc', 'xyz', '9992287513', 'Panchkula', 'abc', '305'),
('1234', 'n@gmail.com', 'abcd', 'def', '4563217854', 'Zirakpur', 'abc@123', '105'),
('1240', 'n@gmail.com', 'neeraj', 'bhatia', '9992287513', 'Panchkula', 'n@123', '102'),
('1398', 'tushar@gmail.com', 'tushar', 'sangwan', '7889247619', 'Panchkula', 'tushar', '103'),
('1611981313', 'rk@gmail.com', 'rohit', 'kumar', '8288898881', 'Pinjore', 'rohit', 'pinjore'),
('240', 'neeraj@gmail.com', 'neeraj', 'bhatia', '9992287513', 'Panchkula', 'neeraj', '102'),
('250', 'nik@gmail.com', 'nikhil', 'rana', '8288898881', 'Zirakpur', 'nikhil', '102'),
('282', 'preet@gmail.com', 'preet', 'singh', '7889247619', 'HMT', 'preet', 'pinjore'),
('291', 'rahul@gmail.com', 'rahul', 'kumar', '7889247619', 'Dhakoli', 'rahul', '291'),
('295', 'rajat@gmail.com', 'rajat', 'choudahry', '4563217854', 'HMT', 'rajat', '104'),
('313', 'rohit@gmail.com', 'rohit', 'kumar', '1318787435', 'Zirakpur', 'rohit', '102'),
('321', 'sukhdev', 'sukhdev', 'singh', '9992287513', 'Panchkula', 'sukhdev', '102'),
('324', 'sah@gmail.com', 'sah', 'kumar', '1318787435', 'Zirakpur', 'kumar', '102'),
('456', 'sahil@gmail.com', 'sahil', 'dhiman', '1318787435', 'Dhakoli', 'sahil', 'zirakpur'),
('987', 'abhi@gmail.com', 'abhi', 'kumar', '8288898881', 'Panchkula', 'abhi', '401');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addstop`
--
ALTER TABLE `addstop`
  ADD PRIMARY KEY (`stoppage`);

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `createroute`
--
ALTER TABLE `createroute`
  ADD PRIMARY KEY (`route`);

--
-- Indexes for table `route`
--
ALTER TABLE `route`
  ADD PRIMARY KEY (`rcode`);

--
-- Indexes for table `sign1`
--
ALTER TABLE `sign1`
  ADD PRIMARY KEY (`rno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
