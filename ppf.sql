/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : ppf

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-11-22 17:27:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(255) DEFAULT NULL COMMENT '产品名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `email` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '用户邮箱',
  `password` varchar(255) DEFAULT NULL COMMENT '用户密码',
  `username` varchar(255) NOT NULL COMMENT '用户昵称',
  `role` varchar(255) DEFAULT NULL COMMENT '用户身份',
  `status` int(1) DEFAULT NULL COMMENT '用户状态',
  `regTime` datetime DEFAULT NULL COMMENT '注册时间',
  `message` varchar(600) DEFAULT NULL COMMENT '个人相关信息',
  `regIp` varchar(255) DEFAULT NULL COMMENT '注册IP',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '18268825594@163.com', '123', 'ppf', 'root', '0', '2017-03-28 09:40:31', null, '127.0.0.1');
INSERT INTO `user` VALUES ('104', '18268825596@163.com', '123', '213124', null, null, '2018-08-15 14:13:44', null, '0:0:0:0:0:0:0:1');
INSERT INTO `user` VALUES ('105', '18268825596@163.com', '123', '大头', null, null, '2018-08-15 14:25:56', null, '0:0:0:0:0:0:0:1');
