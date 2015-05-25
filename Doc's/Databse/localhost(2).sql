-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 23, 2015 at 08:40 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `Online_Examination_Portal`
--
CREATE DATABASE IF NOT EXISTS `Online_Examination_Portal` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `Online_Examination_Portal`;

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
CREATE TABLE IF NOT EXISTS `course` (
  `c_id` varchar(10) NOT NULL,
  `c_name` varchar(20) NOT NULL,
  `c_desc` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`c_id`, `c_name`, `c_desc`) VALUES
('IT615', 'Enterprise Computing', 'Insert Update Demo');

-- --------------------------------------------------------

--
-- Table structure for table `exam_list`
--

DROP TABLE IF EXISTS `exam_list`;
CREATE TABLE IF NOT EXISTS `exam_list` (
`exam_id` int(10) NOT NULL,
  `instructor_id` int(10) NOT NULL,
  `exam_title` varchar(20) NOT NULL,
  `exam_desc` text NOT NULL,
  `no_of_ques` int(5) NOT NULL,
  `duration` time NOT NULL,
  `show_instant_result` tinyint(1) NOT NULL,
  `declare_date` date NOT NULL,
  `total_marks` int(5) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `exam_list`
--

INSERT INTO `exam_list` (`exam_id`, `instructor_id`, `exam_title`, `exam_desc`, `no_of_ques`, `duration`, `show_instant_result`, `declare_date`, `total_marks`, `username`, `password`) VALUES
(47, 1, 'JAVA', 'Exam updated Testing', 50, '02:56:52', 0, '3915-09-15', 200, 'Test1', 'password');

-- --------------------------------------------------------

--
-- Table structure for table `exam_question`
--

DROP TABLE IF EXISTS `exam_question`;
CREATE TABLE IF NOT EXISTS `exam_question` (
  `exam_id` int(10) NOT NULL,
  `ques_id` int(10) NOT NULL,
  `q_marks` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `exam_question`
--

INSERT INTO `exam_question` (`exam_id`, `ques_id`, `q_marks`) VALUES
(47, 2, 200);

-- --------------------------------------------------------

--
-- Table structure for table `login_credentials`
--

DROP TABLE IF EXISTS `login_credentials`;
CREATE TABLE IF NOT EXISTS `login_credentials` (
`user_id` int(10) NOT NULL,
  `username` varchar(12) NOT NULL,
  `password` varchar(12) NOT NULL,
  `email` varchar(50) NOT NULL,
  `instructor` tinyint(1) NOT NULL,
  `student` tinyint(1) NOT NULL,
  `admin` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login_credentials`
--

INSERT INTO `login_credentials` (`user_id`, `username`, `password`, `email`, `instructor`, `student`, `admin`) VALUES
(1, 'lokesh', 'lokesh', '123@456.com updated', 1, 0, 1);

-- --------------------------------------------------------

--
-- Table structure for table `question_bank`
--

DROP TABLE IF EXISTS `question_bank`;
CREATE TABLE IF NOT EXISTS `question_bank` (
`q_id` int(10) NOT NULL,
  `instructor_id` int(10) NOT NULL,
  `q_desc` text NOT NULL,
  `question` text NOT NULL,
  `optionA` text NOT NULL,
  `optionB` text NOT NULL,
  `optionC` text NOT NULL,
  `optionD` text NOT NULL,
  `solution` varchar(1) NOT NULL,
  `level` varchar(1) NOT NULL,
  `course_id` varchar(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `question_bank`
--

INSERT INTO `question_bank` (`q_id`, `instructor_id`, `q_desc`, `question`, `optionA`, `optionB`, `optionC`, `optionD`, `solution`, `level`, `course_id`) VALUES
(2, 1, 'Question_desc', 'Qes.............?', 'A', 'B', 'C', 'D', 'D', 'M', 'IT615'),
(3, 1, 'Question_desc', 'Qes.............?', 'A', 'B', 'C', 'D', 'D', 'M', 'IT615'),
(4, 1, 'Question_desc', 'Qes.............?', 'A', 'B', 'C', 'D', 'D', 'M', 'IT615'),
(5, 1, 'Question_desc', 'Qes.............?', 'A', 'B', 'C', 'D', 'D', 'M', 'IT615');

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

DROP TABLE IF EXISTS `result`;
CREATE TABLE IF NOT EXISTS `result` (
`r_id` int(11) NOT NULL,
  `user_id` int(10) NOT NULL,
  `exam_id` int(10) NOT NULL,
  `Date` date NOT NULL,
  `score` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `submission`
--

DROP TABLE IF EXISTS `submission`;
CREATE TABLE IF NOT EXISTS `submission` (
  `r_id` int(11) NOT NULL,
  `ques_id` int(11) NOT NULL,
  `submission` varchar(2) NOT NULL,
  `evaluation` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user_info`
--

DROP TABLE IF EXISTS `user_info`;
CREATE TABLE IF NOT EXISTS `user_info` (
`user_id` int(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `Image` text NOT NULL,
  `Institute_name` varchar(40) NOT NULL,
  `Program` text NOT NULL,
  `gender` varchar(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_info`
--

INSERT INTO `user_info` (`user_id`, `name`, `Image`, `Institute_name`, `Program`, `gender`) VALUES
(1, 'PMJ', 'v ipdatedjhsbvhb', 'DAIICT', 'Null', 'M');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `course`
--
ALTER TABLE `course`
 ADD PRIMARY KEY (`c_id`);

--
-- Indexes for table `exam_list`
--
ALTER TABLE `exam_list`
 ADD PRIMARY KEY (`exam_id`), ADD KEY `exam_list_ibfk_1` (`instructor_id`), ADD FULLTEXT KEY `exam_desc` (`exam_desc`);

--
-- Indexes for table `exam_question`
--
ALTER TABLE `exam_question`
 ADD PRIMARY KEY (`ques_id`), ADD UNIQUE KEY `ques_id_2` (`ques_id`), ADD KEY `exam_id` (`exam_id`), ADD KEY `ques_id` (`ques_id`), ADD KEY `ques_id_3` (`ques_id`);

--
-- Indexes for table `login_credentials`
--
ALTER TABLE `login_credentials`
 ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `question_bank`
--
ALTER TABLE `question_bank`
 ADD PRIMARY KEY (`q_id`), ADD UNIQUE KEY `q_id` (`q_id`), ADD UNIQUE KEY `q_id_2` (`q_id`), ADD KEY `instructor_id` (`instructor_id`), ADD KEY `course_id` (`course_id`);

--
-- Indexes for table `result`
--
ALTER TABLE `result`
 ADD PRIMARY KEY (`r_id`), ADD KEY `user_id` (`user_id`), ADD KEY `exam_id` (`exam_id`);

--
-- Indexes for table `submission`
--
ALTER TABLE `submission`
 ADD KEY `ques_id` (`ques_id`), ADD KEY `submission` (`submission`), ADD KEY `r_id` (`r_id`);

--
-- Indexes for table `user_info`
--
ALTER TABLE `user_info`
 ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `exam_list`
--
ALTER TABLE `exam_list`
MODIFY `exam_id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=48;
--
-- AUTO_INCREMENT for table `login_credentials`
--
ALTER TABLE `login_credentials`
MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `question_bank`
--
ALTER TABLE `question_bank`
MODIFY `q_id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `result`
--
ALTER TABLE `result`
MODIFY `r_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `user_info`
--
ALTER TABLE `user_info`
MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
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
ADD CONSTRAINT `exam_question_ibfk_1` FOREIGN KEY (`exam_id`) REFERENCES `exam_list` (`exam_id`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `exam_question_ibfk_2` FOREIGN KEY (`ques_id`) REFERENCES `question_bank` (`q_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `login_credentials`
--
ALTER TABLE `login_credentials`
ADD CONSTRAINT `login_credentials_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `question_bank`
--
ALTER TABLE `question_bank`
ADD CONSTRAINT `question_bank_ibfk_2` FOREIGN KEY (`course_id`) REFERENCES `course` (`c_id`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `question_bank_ibfk_3` FOREIGN KEY (`instructor_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `result`
--
ALTER TABLE `result`
ADD CONSTRAINT `result_ibfk_2` FOREIGN KEY (`exam_id`) REFERENCES `exam_list` (`exam_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `result_ibfk_3` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `submission`
--
ALTER TABLE `submission`
ADD CONSTRAINT `submission_ibfk_1` FOREIGN KEY (`r_id`) REFERENCES `result` (`r_id`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `submission_ibfk_2` FOREIGN KEY (`ques_id`) REFERENCES `exam_question` (`ques_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
