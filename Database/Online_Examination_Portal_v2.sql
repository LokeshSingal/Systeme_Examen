-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 17, 2015 at 11:58 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `online_examination_portal`
--

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE IF NOT EXISTS `course` (
  `c_id` varchar(10) NOT NULL,
  `c_name` varchar(20) NOT NULL,
  `c_desc` text NOT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `exam_list`
--

CREATE TABLE IF NOT EXISTS `exam_list` (
  `exam_id` int(10) NOT NULL AUTO_INCREMENT,
  `instructor_id` int(10) NOT NULL,
  `exam_desc` text NOT NULL,
  `no_of_ques` int(5) NOT NULL,
  `duration` time NOT NULL,
  `show_instant_result` tinyint(1) NOT NULL,
  `declare_date` date NOT NULL,
  `total_marks` int(5) NOT NULL,
  PRIMARY KEY (`exam_id`),
  KEY `exam_list_ibfk_1` (`instructor_id`),
  FULLTEXT KEY `exam_desc` (`exam_desc`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `exam_question`
--

CREATE TABLE IF NOT EXISTS `exam_question` (
  `exam_id` int(10) NOT NULL,
  `ques_id` varchar(10) NOT NULL,
  `q_marks` int(4) NOT NULL,
  KEY `exam_id` (`exam_id`),
  KEY `ques_id` (`ques_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `login_credentials`
--

CREATE TABLE IF NOT EXISTS `login_credentials` (
  `user_id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(12) NOT NULL,
  `password` varchar(12) NOT NULL,
  `email` varchar(50) NOT NULL,
  `instructor` tinyint(1) NOT NULL,
  `student` tinyint(1) NOT NULL,
  `admin` tinyint(1) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `question_bank`
--

CREATE TABLE IF NOT EXISTS `question_bank` (
  `q_id` varchar(10) NOT NULL,
  `instructor_id` int(10) NOT NULL,
  `q_desc` text NOT NULL,
  `question` text NOT NULL,
  `optionA` text NOT NULL,
  `optionB` text NOT NULL,
  `optionC` text NOT NULL,
  `optionD` text NOT NULL,
  `solution` varchar(1) NOT NULL,
  `level` varchar(1) NOT NULL,
  `course_id` varchar(10) NOT NULL,
  PRIMARY KEY (`q_id`),
  UNIQUE KEY `q_id` (`q_id`),
  UNIQUE KEY `q_id_2` (`q_id`),
  KEY `instructor_id` (`instructor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE IF NOT EXISTS `result` (
  `exam_id` int(10) NOT NULL,
  `user_id` int(10) NOT NULL,
  `ques_id` varchar(10) NOT NULL,
  `submission` varchar(2) NOT NULL,
  `evaluation` tinyint(1) NOT NULL,
  PRIMARY KEY (`exam_id`,`user_id`,`ques_id`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user_info`
--

CREATE TABLE IF NOT EXISTS `user_info` (
  `user_id` int(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `Image` text NOT NULL,
  `Institue_name` varchar(40) NOT NULL,
  `Program/Graduate` text NOT NULL,
  `gender` varchar(1) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `exam_list`
--
ALTER TABLE `exam_list`
  ADD CONSTRAINT `exam_list_ibfk_1` FOREIGN KEY (`instructor_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `exam_question`
--
ALTER TABLE `exam_question`
  ADD CONSTRAINT `exam_question_ibfk_1` FOREIGN KEY (`exam_id`) REFERENCES `exam_list` (`exam_id`),
  ADD CONSTRAINT `exam_question_ibfk_2` FOREIGN KEY (`ques_id`) REFERENCES `question_bank` (`q_id`);

--
-- Constraints for table `login_credentials`
--
ALTER TABLE `login_credentials`
  ADD CONSTRAINT `Login_Credentials_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `question_bank`
--
ALTER TABLE `question_bank`
  ADD CONSTRAINT `question_bank_ibfk_1` FOREIGN KEY (`instructor_id`) REFERENCES `user_info` (`user_id`);

--
-- Constraints for table `result`
--
ALTER TABLE `result`
  ADD CONSTRAINT `Result_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
