/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : shiro_t

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2018-02-08 18:59:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `code` varchar(100) DEFAULT NULL,
  `parent_Id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '宇通公司', 'YTGS', '0');
INSERT INTO `dept` VALUES ('5', '项目部', 'XMB', '1');
INSERT INTO `dept` VALUES ('6', '项目一部', 'XMB1', '5');

-- ----------------------------
-- Table structure for dictionary
-- ----------------------------
DROP TABLE IF EXISTS `dictionary`;
CREATE TABLE `dictionary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dict_name` varchar(100) DEFAULT NULL,
  `dict_code` varchar(100) DEFAULT NULL,
  `dict_mark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dictionary
-- ----------------------------
INSERT INTO `dictionary` VALUES ('1', '工号类别', 'GHLB', '工号类别');
INSERT INTO `dictionary` VALUES ('2', '工程来源', 'GCLY', '工程来源');
INSERT INTO `dictionary` VALUES ('3', '工程类别', 'GCLB', '工程类别');
INSERT INTO `dictionary` VALUES ('6', '工程性质', 'GCXZ', '工程性质');
INSERT INTO `dictionary` VALUES ('7', '工程地区', 'GCDQ', '工程所在地');
INSERT INTO `dictionary` VALUES ('8', '道路权属', 'DLQS', '道路权属');
INSERT INTO `dictionary` VALUES ('9', '期次', 'QC', '期次');

-- ----------------------------
-- Table structure for dictionarydata
-- ----------------------------
DROP TABLE IF EXISTS `dictionarydata`;
CREATE TABLE `dictionarydata` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dictdata_name` varchar(100) DEFAULT NULL,
  `dictdata_code` varchar(100) DEFAULT NULL,
  `dictdata_mark` varchar(200) DEFAULT NULL,
  `dict_id` int(11) DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dictionarydata
-- ----------------------------
INSERT INTO `dictionarydata` VALUES ('1', '安装工程', 'AZGC', '安装工程', '1', '0');
INSERT INTO `dictionarydata` VALUES ('2', '消隐工程', 'XYGC', '消隐工程', '1', '0');
INSERT INTO `dictionarydata` VALUES ('3', '管改工程', 'GGGC', '管改工程', '1', '0');
INSERT INTO `dictionarydata` VALUES ('6', '地铁', 'DT', '地铁', '6', '0');
INSERT INTO `dictionarydata` VALUES ('7', '自备井', 'ZBJ', '自备井', '6', '0');
INSERT INTO `dictionarydata` VALUES ('8', '临时水', 'LSS', '临时水', '6', '0');
INSERT INTO `dictionarydata` VALUES ('9', '东城区', 'DCQ', '东城区', '7', '0');
INSERT INTO `dictionarydata` VALUES ('10', '西城区', 'XCQ', '西城区', '7', '0');
INSERT INTO `dictionarydata` VALUES ('11', '海淀区', 'HDQ', '海淀区', '7', '0');
INSERT INTO `dictionarydata` VALUES ('12', '朝阳区', 'CYQ', '朝阳区', '7', '0');
INSERT INTO `dictionarydata` VALUES ('13', '单独小区路', 'DDXQL', '单独小区路', '8', '0');
INSERT INTO `dictionarydata` VALUES ('14', '单独区属路', 'DDQSL', '单独区属路', '8', '0');
INSERT INTO `dictionarydata` VALUES ('15', '单独市属路', 'DDSSL', '单独市属路', '8', '0');
INSERT INTO `dictionarydata` VALUES ('16', '部分区属路', 'BFQSL', '部分区属路', '8', '0');
INSERT INTO `dictionarydata` VALUES ('17', '部分市属路', 'BFSSL', '部分市属路', '8', '0');
INSERT INTO `dictionarydata` VALUES ('18', '基建', 'JJ', '基建', '2', '1');
INSERT INTO `dictionarydata` VALUES ('19', '管网', 'GW', '管网', '2', '1');
INSERT INTO `dictionarydata` VALUES ('21', '集团', 'JT', '集团', '2', '1');
INSERT INTO `dictionarydata` VALUES ('22', '大干线', 'DGX', '大干线', '3', '18');
INSERT INTO `dictionarydata` VALUES ('23', '东城', 'DC', '东城', '9', '0');
INSERT INTO `dictionarydata` VALUES ('24', '西城', 'XC', '西城', '9', '0');

-- ----------------------------
-- Table structure for project_produce
-- ----------------------------
DROP TABLE IF EXISTS `project_produce`;
CREATE TABLE `project_produce` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pro_gauge` int(255) DEFAULT NULL COMMENT '测量定线 1 是，0否',
  `pro_job_type` int(11) DEFAULT NULL COMMENT '工号类别 字典id',
  `pro_engine_type` int(11) DEFAULT NULL COMMENT '工程类别 字典id',
  `pro_nature` int(11) DEFAULT NULL COMMENT '工程性质 字典id',
  `pro_name` varchar(100) DEFAULT NULL COMMENT '工程名称',
  `pro_source` int(11) DEFAULT NULL COMMENT '工程来源 字典id',
  `pro_number` varchar(100) DEFAULT NULL COMMENT '工号',
  `pro_snap_number` varchar(100) DEFAULT NULL COMMENT '临时工号',
  `pro_serial_number` varchar(100) DEFAULT NULL COMMENT '序号',
  `pro_lssued_time` varchar(30) DEFAULT NULL COMMENT '任务下达时间',
  `pro_area` int(11) DEFAULT NULL COMMENT '工程所在区 字典id',
  `pro_roads_time` varchar(30) DEFAULT NULL COMMENT '路政报批时间',
  `pro_traffic_time` varchar(30) DEFAULT NULL COMMENT '交通报批时间',
  `pro_period` int(11) DEFAULT NULL COMMENT '期次 字典id',
  `pro_const` int(11) DEFAULT NULL COMMENT '施工单位 字典id',
  `pro_dept` int(255) DEFAULT NULL COMMENT '转入单位  部门id',
  `pro_design_length` double DEFAULT NULL COMMENT '设计长度',
  `pro_pipe_length` double DEFAULT NULL COMMENT '管径',
  `pro_snap_length` double DEFAULT NULL COMMENT '临时线长度',
  `create_user` int(11) DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project_produce
-- ----------------------------
INSERT INTO `project_produce` VALUES ('5', '1', '1', '22', '6', '444', '18', '111', '222', '333', '2018-02-08 18:30:43', '9', '2018-02-08 18:30:46', '2018-02-08 18:30:48', '23', '6', '6', '22', '22', '22', '1', '2018-02-08 06:30:56');

-- ----------------------------
-- Table structure for project_road_work
-- ----------------------------
DROP TABLE IF EXISTS `project_road_work`;
CREATE TABLE `project_road_work` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `prw_dma_caliber` int(255) DEFAULT NULL COMMENT '完成DMA口径 数值',
  `prw_dma_count` int(255) DEFAULT NULL COMMENT '完成DMA数量 数值',
  `prw_back_caliber` int(11) DEFAULT NULL COMMENT '完成倒流防止器口径',
  `prw_back_count` int(11) DEFAULT NULL COMMENT '完成倒流防止器数量',
  `prw_week_plan` double DEFAULT NULL COMMENT '下周计划',
  `prw_month_plan` double DEFAULT NULL COMMENT '下月计划',
  `prw_pst` varchar(50) DEFAULT NULL COMMENT '计划开工时间',
  `prw_pet` varchar(50) DEFAULT NULL COMMENT '计划完工时间',
  `prw_total_duration` int(11) DEFAULT NULL COMMENT '计划总工期 ',
  `prw_ast` varchar(50) DEFAULT NULL COMMENT '实际开工时间',
  `prw_aet` varchar(50) DEFAULT NULL COMMENT '实际竣工时间',
  `prw_reception_time` varchar(50) DEFAULT NULL COMMENT '竣工验收日期',
  `prw_switching_date` varchar(50) DEFAULT NULL COMMENT '转闸单日期',
  `prw_figure_date` varchar(50) DEFAULT NULL COMMENT '转图日期',
  `prw_progress_report` varchar(255) DEFAULT NULL COMMENT '工程进展问题',
  `prw_reason` varchar(255) DEFAULT NULL COMMENT '未开工原因',
  `prw_explain` varchar(255) DEFAULT NULL COMMENT '未完工说明 ',
  `prw_budget` double DEFAULT NULL COMMENT '预算价',
  `prw_settlement` double DEFAULT NULL COMMENT '结算价',
  `prw_manpower` int(11) DEFAULT NULL COMMENT '累计投入人力',
  `prw_road_work` varchar(255) DEFAULT NULL COMMENT '施工',
  `prw_address` varchar(255) DEFAULT NULL COMMENT '所属街道办事处',
  `prw_road_name` varchar(255) DEFAULT NULL COMMENT '涉及道路名称',
  `prw_origin` varchar(255) DEFAULT NULL COMMENT '起点',
  `prw_stop` varchar(255) DEFAULT NULL COMMENT '止点',
  `prw_ownership` int(11) DEFAULT NULL COMMENT '道路权属',
  `prw_repair` int(11) DEFAULT NULL COMMENT '是否随大修路',
  `prw_excavation` int(11) DEFAULT NULL COMMENT '是否非开挖',
  `prw_preliminary_time` varchar(50) DEFAULT NULL COMMENT '预判施工工时',
  `prw_user_id` varchar(50) DEFAULT NULL COMMENT '施工员',
  `prw_phone` varchar(50) DEFAULT NULL COMMENT '电话',
  `prw_condition` int(11) DEFAULT NULL COMMENT '路管情况',
  `prw_creator` int(11) DEFAULT NULL COMMENT '创建人',
  `prw_create_at` varchar(50) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project_road_work
-- ----------------------------
INSERT INTO `project_road_work` VALUES ('3', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '0', '0', '0', '2', '2', '2', null, null, null);
INSERT INTO `project_road_work` VALUES ('4', '11', '11', '11', '11', '11', '11', '11', '11', '11', '11', '11', '11', '11', '11', '11', '1', '1', '11', '11', '11', '11', '11', '11', '11', '11', '13', '1', '2', '11', '11', '11', null, null, null);
INSERT INTO `project_road_work` VALUES ('5', null, null, null, null, null, null, '', '', null, '', '', '', '', '', '', '', '', null, null, null, '', '1', '1', '11', '', '13', '2', '1', '', '', '', null, null, null);

-- ----------------------------
-- Table structure for project_road_work_daily
-- ----------------------------
DROP TABLE IF EXISTS `project_road_work_daily`;
CREATE TABLE `project_road_work_daily` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `prwd_one` double DEFAULT NULL COMMENT 'DN15',
  `prwd_two` double DEFAULT NULL COMMENT 'DN20',
  `prwd_three` double DEFAULT NULL COMMENT 'DN25',
  `prwd_four` double DEFAULT NULL COMMENT 'DN40',
  `prwd_five` double DEFAULT NULL COMMENT 'DN50',
  `prwd_six` double DEFAULT NULL COMMENT 'DN75',
  `prwd_seven` double DEFAULT NULL COMMENT 'DN100',
  `prwd_eight` double DEFAULT NULL COMMENT 'DN150',
  `prwd_nine` double DEFAULT NULL COMMENT 'DN200',
  `prwd_subtotal` double DEFAULT NULL COMMENT '小计',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project_road_work_daily
-- ----------------------------

-- ----------------------------
-- Table structure for resources
-- ----------------------------
DROP TABLE IF EXISTS `resources`;
CREATE TABLE `resources` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '资源名称',
  `resUrl` varchar(255) DEFAULT NULL COMMENT '资源url',
  `type` int(11) DEFAULT NULL COMMENT '资源类型   1:菜单    2：按钮',
  `parentId` int(11) DEFAULT NULL COMMENT '父资源',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `iconCls` varchar(100) DEFAULT NULL,
  `but_fun` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=85 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resources
-- ----------------------------
INSERT INTO `resources` VALUES ('1', '系统设置', '', '1', '0', '10', null, null);
INSERT INTO `resources` VALUES ('2', '用户管理', '/page/users', '1', '1', '20', null, null);
INSERT INTO `resources` VALUES ('3', '角色管理', '/page/roles', '1', '1', '30', null, null);
INSERT INTO `resources` VALUES ('4', '菜单管理', '/page/resources', '1', '1', '40', null, null);
INSERT INTO `resources` VALUES ('5', '添加用户', '/users/add', '2', '2', '1', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('6', '删除用户', '/users/delete', '2', '2', '2', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('7', '添加角色', '/roles/add', '2', '3', '1', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('8', '删除角色', '/roles/delete', '2', '3', '2', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('9', '添加资源', '/resources/add', '2', '4', '1', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('10', '删除资源', '/resources/delete', '2', '4', '2', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('13', '分配权限', '/roles/saveRoleResources', '2', '3', '4', null, 'saveRoleResources()');
INSERT INTO `resources` VALUES ('14', '修改资源', '/resources/edit', '2', '4', '3', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('15', '修改角色', '/roles/edit', '2', '3', '3', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('16', '添加部门', '/dept/add', '2', '55', '1', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('17', '删除部门', '/dept/delete', '2', '55', '2', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('18', '修改部门', '/dept/edit', '2', '55', '3', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('19', '资源管理', '/page/buttons', '1', '1', '50', null, null);
INSERT INTO `resources` VALUES ('55', '部门管理', '/page/depts', '1', '1', '10', null, null);
INSERT INTO `resources` VALUES ('56', '修改用户', '/users/edit', '2', '2', '3', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('57', '停用', '/users/off', '2', '2', '4', 'icon-off-new', 'off()');
INSERT INTO `resources` VALUES ('58', '启用', '/users/on', '2', '2', '5', 'icon-on-new', 'on()');
INSERT INTO `resources` VALUES ('59', '添加按钮', '/buttons/add', '2', '19', '1', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('60', '修改按钮', '/buttons/edit', '2', '19', '2', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('61', '删除按钮', '/buttons/delete', '2', '19', '3', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('65', '字典管理', '', '1', '0', '70', null, null);
INSERT INTO `resources` VALUES ('66', '字典类别管理', '/page/dicts', '1', '65', '11', null, null);
INSERT INTO `resources` VALUES ('67', '字典数据管理', '/page/dictdatas', '1', '65', '12', null, null);
INSERT INTO `resources` VALUES ('68', '添加类别', '/dict/add', '2', '66', '10', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('69', '删除类别', '/dict/delete', '2', '66', '11', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('70', '修改类别', '/dict/edit', '2', '66', '12', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('72', '添加数据', '/dictdata/add', '2', '67', '1', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('73', '删除数据', '/dictdata/delete', '2', '67', '2', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('74', '修改数据', '/dictdata/edit', '2', '67', '3', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('75', '生产科管理', '', '1', '0', '80', null, null);
INSERT INTO `resources` VALUES ('76', '项目立项', '/page/produces', '1', '75', '1', null, null);
INSERT INTO `resources` VALUES ('77', '项目管理', '', '1', '0', '90', null, null);
INSERT INTO `resources` VALUES ('78', '项目施工管理', '/page/roadworks', '1', '77', '10', null, null);
INSERT INTO `resources` VALUES ('79', '添加数据', '/roadworks/add', '2', '78', '10', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('80', '添加数据', '/produces/add', '2', '76', '10', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('81', '修改数据', '/roadworks/edit', '2', '78', '11', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('82', '删除数据', '/produces/delete', '2', '76', '11', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('83', '修改数据', '/produces/edit', '2', '76', '12', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('84', '删除数据', '/roadworks/delete', '2', '78', '12', 'icon-remove-new', 'remove()');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleDesc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '管理员');
INSERT INTO `role` VALUES ('2', '普通用户');
INSERT INTO `role` VALUES ('3', '超级管理员');
INSERT INTO `role` VALUES ('4', '管理部门');
INSERT INTO `role` VALUES ('7', '部门经理11');

-- ----------------------------
-- Table structure for role_resources
-- ----------------------------
DROP TABLE IF EXISTS `role_resources`;
CREATE TABLE `role_resources` (
  `roleId` int(11) NOT NULL,
  `resourcesId` int(11) NOT NULL,
  PRIMARY KEY (`roleId`,`resourcesId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_resources
-- ----------------------------
INSERT INTO `role_resources` VALUES ('1', '1');
INSERT INTO `role_resources` VALUES ('1', '2');
INSERT INTO `role_resources` VALUES ('1', '3');
INSERT INTO `role_resources` VALUES ('1', '4');
INSERT INTO `role_resources` VALUES ('1', '5');
INSERT INTO `role_resources` VALUES ('1', '6');
INSERT INTO `role_resources` VALUES ('1', '7');
INSERT INTO `role_resources` VALUES ('1', '8');
INSERT INTO `role_resources` VALUES ('1', '9');
INSERT INTO `role_resources` VALUES ('1', '10');
INSERT INTO `role_resources` VALUES ('1', '13');
INSERT INTO `role_resources` VALUES ('1', '14');
INSERT INTO `role_resources` VALUES ('1', '15');
INSERT INTO `role_resources` VALUES ('1', '16');
INSERT INTO `role_resources` VALUES ('1', '17');
INSERT INTO `role_resources` VALUES ('1', '18');
INSERT INTO `role_resources` VALUES ('1', '19');
INSERT INTO `role_resources` VALUES ('1', '55');
INSERT INTO `role_resources` VALUES ('1', '56');
INSERT INTO `role_resources` VALUES ('1', '57');
INSERT INTO `role_resources` VALUES ('1', '58');
INSERT INTO `role_resources` VALUES ('1', '59');
INSERT INTO `role_resources` VALUES ('1', '60');
INSERT INTO `role_resources` VALUES ('1', '61');
INSERT INTO `role_resources` VALUES ('1', '65');
INSERT INTO `role_resources` VALUES ('1', '66');
INSERT INTO `role_resources` VALUES ('1', '67');
INSERT INTO `role_resources` VALUES ('1', '68');
INSERT INTO `role_resources` VALUES ('1', '69');
INSERT INTO `role_resources` VALUES ('1', '70');
INSERT INTO `role_resources` VALUES ('1', '72');
INSERT INTO `role_resources` VALUES ('1', '73');
INSERT INTO `role_resources` VALUES ('1', '74');
INSERT INTO `role_resources` VALUES ('1', '75');
INSERT INTO `role_resources` VALUES ('1', '76');
INSERT INTO `role_resources` VALUES ('1', '77');
INSERT INTO `role_resources` VALUES ('1', '78');
INSERT INTO `role_resources` VALUES ('1', '79');
INSERT INTO `role_resources` VALUES ('1', '80');
INSERT INTO `role_resources` VALUES ('1', '81');
INSERT INTO `role_resources` VALUES ('1', '82');
INSERT INTO `role_resources` VALUES ('1', '83');
INSERT INTO `role_resources` VALUES ('1', '84');
INSERT INTO `role_resources` VALUES ('2', '1');
INSERT INTO `role_resources` VALUES ('2', '2');
INSERT INTO `role_resources` VALUES ('2', '3');
INSERT INTO `role_resources` VALUES ('2', '4');
INSERT INTO `role_resources` VALUES ('2', '5');
INSERT INTO `role_resources` VALUES ('2', '6');
INSERT INTO `role_resources` VALUES ('2', '7');
INSERT INTO `role_resources` VALUES ('2', '8');
INSERT INTO `role_resources` VALUES ('2', '9');
INSERT INTO `role_resources` VALUES ('2', '10');
INSERT INTO `role_resources` VALUES ('2', '11');
INSERT INTO `role_resources` VALUES ('2', '13');
INSERT INTO `role_resources` VALUES ('2', '14');
INSERT INTO `role_resources` VALUES ('2', '15');
INSERT INTO `role_resources` VALUES ('3', '2');
INSERT INTO `role_resources` VALUES ('3', '3');
INSERT INTO `role_resources` VALUES ('3', '4');
INSERT INTO `role_resources` VALUES ('3', '5');
INSERT INTO `role_resources` VALUES ('3', '7');
INSERT INTO `role_resources` VALUES ('3', '8');
INSERT INTO `role_resources` VALUES ('3', '9');
INSERT INTO `role_resources` VALUES ('3', '10');
INSERT INTO `role_resources` VALUES ('4', '1');
INSERT INTO `role_resources` VALUES ('4', '4');
INSERT INTO `role_resources` VALUES ('4', '9');
INSERT INTO `role_resources` VALUES ('4', '10');
INSERT INTO `role_resources` VALUES ('7', '1');
INSERT INTO `role_resources` VALUES ('7', '2');
INSERT INTO `role_resources` VALUES ('7', '3');
INSERT INTO `role_resources` VALUES ('7', '4');
INSERT INTO `role_resources` VALUES ('7', '5');
INSERT INTO `role_resources` VALUES ('7', '6');
INSERT INTO `role_resources` VALUES ('7', '7');
INSERT INTO `role_resources` VALUES ('7', '8');
INSERT INTO `role_resources` VALUES ('7', '9');
INSERT INTO `role_resources` VALUES ('7', '10');
INSERT INTO `role_resources` VALUES ('7', '11');
INSERT INTO `role_resources` VALUES ('7', '13');
INSERT INTO `role_resources` VALUES ('7', '14');
INSERT INTO `role_resources` VALUES ('7', '15');
INSERT INTO `role_resources` VALUES ('7', '16');
INSERT INTO `role_resources` VALUES ('7', '17');
INSERT INTO `role_resources` VALUES ('7', '18');
INSERT INTO `role_resources` VALUES ('7', '55');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(33) DEFAULT NULL,
  `password` varchar(33) DEFAULT NULL,
  `enable` int(10) DEFAULT '1' COMMENT '是否启用',
  `name` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `mark` varchar(255) DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '3ef7164d1f6167cb9f2658c07d3c2f0a', '1', '管理员', '北京', '管理员', '1', '15510505500');
INSERT INTO `user` VALUES ('2', 'user1', '90e66e36e3135a91d298177d4389851e', '1', null, null, null, '5', null);
INSERT INTO `user` VALUES ('3', 'user2', '121', '0', null, null, null, '1', null);
INSERT INTO `user` VALUES ('4', 'user3', 'user3', '1', null, null, null, '1', null);
INSERT INTO `user` VALUES ('5', 'user4', 'user4', '1', null, null, null, '1', null);
INSERT INTO `user` VALUES ('8', 'user7', 'user7', '1', null, null, null, '1', null);
INSERT INTO `user` VALUES ('9', 'user8', 'user8', '1', null, null, null, '1', null);
INSERT INTO `user` VALUES ('10', 'user9', 'user9', '1', null, null, null, '1', null);
INSERT INTO `user` VALUES ('11', 'user10', 'user10', '1', null, null, null, '1', null);
INSERT INTO `user` VALUES ('12', 'user11', 'user11', '1', null, null, null, '1', null);
INSERT INTO `user` VALUES ('13', 'user12', 'user12', '1', null, null, null, '1', null);
INSERT INTO `user` VALUES ('14', 'user13', 'user13', '1', null, null, null, '1', null);
INSERT INTO `user` VALUES ('15', 'user14', 'user14', '1', null, null, null, '1', null);
INSERT INTO `user` VALUES ('16', 'user15', 'user15', '1', null, null, null, '1', null);
INSERT INTO `user` VALUES ('17', 'user16', 'user16', '1', null, null, null, '1', null);
INSERT INTO `user` VALUES ('18', 'user17', 'user17', '1', null, null, null, '1', null);
INSERT INTO `user` VALUES ('19', 'user18', 'user18', '1', null, null, null, '1', null);
INSERT INTO `user` VALUES ('21', 'user20', 'user20', '1', null, null, null, '1', null);
INSERT INTO `user` VALUES ('25', '31231', '4155b096f06457956fbe687c12c9ec18', '0', '1312323243', '234234', '234234', '1', '423434234');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `userId` int(11) DEFAULT NULL,
  `roleId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('2', '2');
INSERT INTO `user_role` VALUES ('1', '1');
INSERT INTO `user_role` VALUES ('1', '2');
INSERT INTO `user_role` VALUES ('1', '3');
INSERT INTO `user_role` VALUES ('1', '4');
INSERT INTO `user_role` VALUES ('1', '7');

-- ----------------------------
-- Function structure for fun_a_dept
-- ----------------------------
DROP FUNCTION IF EXISTS `fun_a_dept`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `fun_a_dept`(dept_id int) RETURNS varchar(4000) CHARSET utf8
BEGIN
DECLARE sTemp VARCHAR(4000);
DECLARE sTempChd VARCHAR(4000);

SET sTemp = '$';
SET sTempChd = cast(dept_id as char);

WHILE sTempChd is not NULL DO
SET sTemp = CONCAT(sTemp,',',sTempChd);
SELECT group_concat(id) INTO sTempChd FROM dept where FIND_IN_SET(parent_Id,sTempChd)>0;
END WHILE;
return sTemp;
END
;;
DELIMITER ;

-- ----------------------------
-- Function structure for fun_a_dictdata
-- ----------------------------
DROP FUNCTION IF EXISTS `fun_a_dictdata`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `fun_a_dictdata`(ids int) RETURNS varchar(4000) CHARSET utf8
BEGIN
DECLARE sTemp VARCHAR(4000);
DECLARE sTempChd VARCHAR(4000);

SET sTemp = '$';
SET sTempChd = cast(ids as char);

WHILE sTempChd is not NULL DO
SET sTemp = CONCAT(sTemp,',',sTempChd);
SELECT group_concat(id) INTO sTempChd FROM dictionarydata where FIND_IN_SET(parent_id,sTempChd)>0;
END WHILE;
return sTemp;
END
;;
DELIMITER ;
