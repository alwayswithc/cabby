/*
Navicat MySQL Data Transfer

Source Server         : 教学测试
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : cabby

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2016-07-30 17:17:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'admin');
INSERT INTO `role` VALUES ('2', 'jxs');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL,
  `account` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `is_registed` int(11) DEFAULT '0',
  `parent_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', 'admin', '86888061b399e74e30eeead8c7aab922', 'admin', null, null, '1', null);
INSERT INTO `user` VALUES ('2', '2', '123', '86888061b399e74e30eeead8c7aab922', 'cabby', '1', '13751888888', '1', null);
INSERT INTO `user` VALUES ('3', '2', '234', '86888061b399e74e30eeead8c7aab922', 'Linda', '1', '13751888889', '1', null);
INSERT INTO `user` VALUES ('10', '2', '123.7', '36222dc73593eddc133571ca0327e62a', null, '2', null, '0', null);
