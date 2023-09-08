/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2023-09-08 16:41:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `dept`
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` int(11) NOT NULL,
  `dname` varchar(255) DEFAULT NULL,
  `loc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------

-- ----------------------------
-- Table structure for `emp`
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ename` varchar(255) DEFAULT NULL,
  `hire_date` datetime DEFAULT NULL,
  `job` varchar(255) DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKlf4q52cbln60sp28odam4nat2` (`dept_id`),
  CONSTRAINT `FKlf4q52cbln60sp28odam4nat2` FOREIGN KEY (`dept_id`) REFERENCES `dept` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES ('1', '我', '2022-07-19 20:44:49', '研发', null);

-- ----------------------------
-- Table structure for `hibernate_sequence`
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('4');

-- ----------------------------
-- Table structure for `t_authority`
-- ----------------------------
DROP TABLE IF EXISTS `t_authority`;
CREATE TABLE `t_authority` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_authority
-- ----------------------------

-- ----------------------------
-- Table structure for `t_customer`
-- ----------------------------
DROP TABLE IF EXISTS `t_customer`;
CREATE TABLE `t_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created` datetime DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_customer
-- ----------------------------

-- ----------------------------
-- Table structure for `t_dept`
-- ----------------------------
DROP TABLE IF EXISTS `t_dept`;
CREATE TABLE `t_dept` (
  `id` int(11) NOT NULL,
  `dname` varchar(255) DEFAULT NULL,
  `loc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_dept
-- ----------------------------
INSERT INTO `t_dept` VALUES ('10', '研发部', '南京');

-- ----------------------------
-- Table structure for `t_emp`
-- ----------------------------
DROP TABLE IF EXISTS `t_emp`;
CREATE TABLE `t_emp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ename` varchar(32) NOT NULL,
  `hire_date` datetime DEFAULT NULL,
  `job` varchar(255) DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_a545nad9mvt8o2kjcesqipsri` (`ename`),
  KEY `FKiek4ls8f4fx7g6i38ceoj5jcu` (`dept_id`),
  CONSTRAINT `FKiek4ls8f4fx7g6i38ceoj5jcu` FOREIGN KEY (`dept_id`) REFERENCES `t_dept` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_emp
-- ----------------------------
INSERT INTO `t_emp` VALUES ('2', 'bbb', '2021-10-20 00:00:00', '研发', '10');
INSERT INTO `t_emp` VALUES ('3', 'ttt', null, '研发', '10');
INSERT INTO `t_emp` VALUES ('4', 'yxq', '2021-10-22 00:00:00', '研发', '10');
INSERT INTO `t_emp` VALUES ('6', 'aaa', '2021-10-25 00:00:00', '研发', '10');
INSERT INTO `t_emp` VALUES ('8', 'fgfdgdf', '2022-07-08 13:11:12', '测试', null);
INSERT INTO `t_emp` VALUES ('9', 'zmj', '2022-07-08 21:49:33', '研发', '10');
INSERT INTO `t_emp` VALUES ('12', 'abc', null, '研发', '10');
INSERT INTO `t_emp` VALUES ('14', '袁晓庆', '2022-07-09 00:00:00', '研发', '10');
INSERT INTO `t_emp` VALUES ('15', '袁晓庆2', '2022-07-06 00:00:00', '研发', '10');

-- ----------------------------
-- Table structure for `t_product`
-- ----------------------------
DROP TABLE IF EXISTS `t_product`;
CREATE TABLE `t_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `p_name` varchar(32) NOT NULL,
  `p_price` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_product
-- ----------------------------
INSERT INTO `t_product` VALUES ('1', 'java全栈', '89');
INSERT INTO `t_product` VALUES ('2', 'H5+CSS3+JavaScript', '35.2');
INSERT INTO `t_product` VALUES ('3', 'H5+CSS3+JavaScript', '35.2');

-- ----------------------------
-- Table structure for `t_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', 'ROLE_admin');
INSERT INTO `t_role` VALUES ('2', 'ROLE_user');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) DEFAULT NULL,
  `password` varchar(128) NOT NULL,
  `created` datetime NOT NULL,
  `valid` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'admin', '$2a$10$JOkkXzjsY5vhmH9xYCr3uOGWMwGc1bhfe2gDi8BUXNKaZ8KXFUxcW', '2022-07-14 13:30:57', '1');
INSERT INTO `t_user` VALUES ('2', 'yxq', '$2a$10$JOkkXzjsY5vhmH9xYCr3uOGWMwGc1bhfe2gDi8BUXNKaZ8KXFUxcW', '2022-07-14 13:35:32', '1');
INSERT INTO `t_user` VALUES ('3', 'abc', '$2a$10$JOkkXzjsY5vhmH9xYCr3uOGWMwGc1bhfe2gDi8BUXNKaZ8KXFUxcW', '2022-07-14 13:38:19', '1');

-- ----------------------------
-- Table structure for `t_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
INSERT INTO `t_user_role` VALUES ('1', '1', '1');
INSERT INTO `t_user_role` VALUES ('2', '2', '2');
INSERT INTO `t_user_role` VALUES ('3', '3', '2');
