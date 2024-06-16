-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2024 at 06:34 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sportsociety`
--

-- --------------------------------------------------------

--
-- Table structure for table `playerdetails`
--

CREATE TABLE `playerdetails` (
  `Name` varchar(30) NOT NULL,
  `IDNumber` varchar(20) NOT NULL,
  `Age` int(20) NOT NULL,
  `Position` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `playerdetails`
--

INSERT INTO `playerdetails` (`Name`, `IDNumber`, `Age`, `Position`) VALUES
('thila', '0069', 30, 'Player'),
('chamith', '1122', 50, 'center');

-- --------------------------------------------------------

--
-- Table structure for table `userdetails`
--

CREATE TABLE `userdetails` (
  `UserName` varchar(15) NOT NULL,
  `UserID` varchar(15) NOT NULL,
  `Password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `userdetails`
--

INSERT INTO `userdetails` (`UserName`, `UserID`, `Password`) VALUES
('chamara', '5555', '1234'),
('imasha', '2211', '123'),
('manusha', '112233', '2211'),
('pathum', '123456', '111'),
('pubudu', '5555', '0000'),
('sandu ', '0012', '12345'),
('thilina', '789', '456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `playerdetails`
--
ALTER TABLE `playerdetails`
  ADD PRIMARY KEY (`IDNumber`);

--
-- Indexes for table `userdetails`
--
ALTER TABLE `userdetails`
  ADD PRIMARY KEY (`UserName`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
