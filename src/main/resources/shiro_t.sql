/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : shiro_t

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2018-04-08 19:13:37
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
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('5', '宇通公司', 'ytgs', '0');
INSERT INTO `dept` VALUES ('6', '生产科', 'sck', '5');
INSERT INTO `dept` VALUES ('7', '东郊项目部', 'djxmb', '5');
INSERT INTO `dept` VALUES ('8', '朝阳项目部', 'cyxmb', '5');
INSERT INTO `dept` VALUES ('9', '施工单位', 'sgdw', '0');
INSERT INTO `dept` VALUES ('10', '施工单位01', 'sgdw01', '9');
INSERT INTO `dept` VALUES ('11', '施工单位02', 'sgdw02', '9');

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
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

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
INSERT INTO `dictionary` VALUES ('11', '路管情况', 'LGQK', '路管情况');
INSERT INTO `dictionary` VALUES ('12', '施工单位', 'SGDW', '施工单位');
INSERT INTO `dictionary` VALUES ('14', '编号性质', 'BHXZ', '编号性质');
INSERT INTO `dictionary` VALUES ('15', '图纸性质', 'TZXZ', '图纸性质');
INSERT INTO `dictionary` VALUES ('16', '合同性质', 'HTXZ', '合同性质');
INSERT INTO `dictionary` VALUES ('17', '工作量', 'GZL', '工作量');

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
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8;

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
INSERT INTO `dictionarydata` VALUES ('18', '基建', 'JJ', '基建', '2', '0');
INSERT INTO `dictionarydata` VALUES ('19', '管网', 'GW', '管网', '2', '0');
INSERT INTO `dictionarydata` VALUES ('21', '集团', 'JT', '集团', '2', '0');
INSERT INTO `dictionarydata` VALUES ('22', '大干线', 'DGX', '大干线', '3', '0');
INSERT INTO `dictionarydata` VALUES ('23', '东城', 'DC', '东城', '9', '22');
INSERT INTO `dictionarydata` VALUES ('24', '西城', 'XC', '西城', '9', '33');
INSERT INTO `dictionarydata` VALUES ('25', '原路由原管径2', 'YLUYGJ', '原路由原管径', '11', '0');
INSERT INTO `dictionarydata` VALUES ('26', '原路由新管径', 'YLYXGJ', '原路由新管径', '11', '0');
INSERT INTO `dictionarydata` VALUES ('27', '自寻', 'ZX', '自寻', '2', '0');
INSERT INTO `dictionarydata` VALUES ('28', '小口径', 'xkj', '小口径', '3', '0');
INSERT INTO `dictionarydata` VALUES ('29', '大口径', 'dkj', '大口径', '3', '0');
INSERT INTO `dictionarydata` VALUES ('31', '施工单位1', 'sgdw01', '施工单位1', '12', '0');
INSERT INTO `dictionarydata` VALUES ('32', '施工单位2', 'sgdw02', '施工单位2', '12', '0');
INSERT INTO `dictionarydata` VALUES ('33', '安装工程', 'azgc', '安装工程', '3', '0');
INSERT INTO `dictionarydata` VALUES ('34', '消隐', 'XY', '消隐', '2', '0');
INSERT INTO `dictionarydata` VALUES ('36', '补号', 'BH', '补号', '14', '0');
INSERT INTO `dictionarydata` VALUES ('37', '原号', 'YH', '原号', '14', '0');
INSERT INTO `dictionarydata` VALUES ('39', '简图', 'JT', '简图', '15', '0');
INSERT INTO `dictionarydata` VALUES ('40', '全图', 'QT', '全图', '15', '0');
INSERT INTO `dictionarydata` VALUES ('41', '合同性质1', 'HTXZ1', '合同性质1', '16', '0');
INSERT INTO `dictionarydata` VALUES ('42', '合同性质2', 'HTXZ2', '合同性质2', '16', '0');
INSERT INTO `dictionarydata` VALUES ('43', 'DN15', 'DN15', 'DN15', '17', '0');
INSERT INTO `dictionarydata` VALUES ('44', 'DN20', 'DN20', 'DN20', '17', '0');
INSERT INTO `dictionarydata` VALUES ('45', 'DN25', 'DN25', 'DN25', '17', '0');
INSERT INTO `dictionarydata` VALUES ('46', 'DN40', 'DN40', 'DN40', '17', '0');
INSERT INTO `dictionarydata` VALUES ('47', 'DN50', 'DN50', 'DN50', '17', '0');
INSERT INTO `dictionarydata` VALUES ('48', 'DN75', 'DN75', 'DN75', '17', '0');
INSERT INTO `dictionarydata` VALUES ('49', 'DN100', 'DN100', 'DN100', '17', '0');
INSERT INTO `dictionarydata` VALUES ('50', 'DN150', 'DN150', 'DN150', '17', '0');
INSERT INTO `dictionarydata` VALUES ('51', 'DN200', 'DN200', 'DN200', '17', '0');
INSERT INTO `dictionarydata` VALUES ('52', '北城', 'BC', '北城', '9', '33');

-- ----------------------------
-- Table structure for project_accounts
-- ----------------------------
DROP TABLE IF EXISTS `project_accounts`;
CREATE TABLE `project_accounts` (
  `accounts_id` int(11) NOT NULL AUTO_INCREMENT,
  `accounts_money` double DEFAULT NULL COMMENT '结算金额',
  `pro_id` int(11) DEFAULT NULL COMMENT '项目id',
  `accounts_time` varchar(30) DEFAULT NULL COMMENT '结算日期',
  `accounts_create_user` int(11) DEFAULT NULL COMMENT '创建人',
  `accounts_create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  `accounts_remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`accounts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project_accounts
-- ----------------------------

-- ----------------------------
-- Table structure for project_construction
-- ----------------------------
DROP TABLE IF EXISTS `project_construction`;
CREATE TABLE `project_construction` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `proId` int(11) DEFAULT NULL COMMENT '项目id',
  `prwId` int(11) DEFAULT NULL COMMENT '项目基本信息id',
  `pc_workers` varchar(50) DEFAULT NULL COMMENT '施工人员',
  `pc_phone` varchar(30) DEFAULT NULL COMMENT '联系电话',
  `pc_week_plan` varchar(255) DEFAULT NULL COMMENT '下周计划',
  `pc_month_plan` varchar(255) DEFAULT NULL COMMENT '下月计划',
  `create_user` int(11) DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  `pc_dept` int(11) DEFAULT NULL COMMENT '施工单位',
  `pc_remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `pc_begin` varchar(255) DEFAULT NULL COMMENT '起点',
  `pc_end` varchar(255) DEFAULT NULL COMMENT '止点',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project_construction
-- ----------------------------
INSERT INTO `project_construction` VALUES ('18', '10', null, '13213', '123', null, null, '30', '2018-04-08 01:50:55', '11', '111', '起点111', '止点11');
INSERT INTO `project_construction` VALUES ('19', '10', null, '123123', '123123', null, null, '30', '2018-04-08 01:51:08', '10', '123123', '起点', '止点');
INSERT INTO `project_construction` VALUES ('20', '11', null, '124234', '234234', null, null, '31', '2018-04-08 06:52:35', '10', '234234', '23423', '234');
INSERT INTO `project_construction` VALUES ('21', '12', null, '4234', '23', null, null, '31', '2018-04-08 06:55:59', '11', '23423', '234', '234');
INSERT INTO `project_construction` VALUES ('22', '12', null, '4234', '234', null, null, '31', '2018-04-08 06:56:06', '10', '234', '234', '234');

-- ----------------------------
-- Table structure for project_contract
-- ----------------------------
DROP TABLE IF EXISTS `project_contract`;
CREATE TABLE `project_contract` (
  `contract_id` int(11) NOT NULL AUTO_INCREMENT,
  `contract_budget_price` double DEFAULT NULL COMMENT '工程预算价',
  `contract_budget_price_user` varchar(50) DEFAULT NULL COMMENT '预算编制人',
  `contract_bidding_time` varchar(30) DEFAULT NULL COMMENT '招投标时间',
  `contract_type` int(1) DEFAULT NULL COMMENT '有无合同 1有 0无',
  `contract_number` varchar(50) DEFAULT NULL COMMENT '合同号',
  `contract_alone` int(1) DEFAULT NULL COMMENT '是否单独合同',
  `contract_pro_number` varchar(50) DEFAULT NULL COMMENT '原合同工程编号',
  `contract_arch_time` varchar(30) DEFAULT NULL COMMENT '合同归档日期',
  `contract_remark` varchar(255) DEFAULT NULL COMMENT '合同备注',
  `contract_natrue` int(1) DEFAULT NULL COMMENT '合同性质 ',
  `contract_money` double DEFAULT NULL COMMENT '合同金额',
  `contract_bidding_type` int(1) DEFAULT NULL COMMENT '是否招投标，1 是，0否',
  `contract_advice` varchar(255) DEFAULT NULL COMMENT '合同审核意见',
  `contract_check_user` varchar(255) DEFAULT NULL COMMENT '合同审核人',
  `contract_check_time` varchar(30) DEFAULT NULL COMMENT '合同审核时间',
  `contract_sign_time` varchar(30) DEFAULT NULL COMMENT '合同签订日期',
  `contract_stamp_time` varchar(30) DEFAULT NULL COMMENT '合同盖章日期',
  `contract_back_time` varchar(30) DEFAULT NULL COMMENT '合同返回日期',
  `contract_back_user` varchar(50) DEFAULT NULL COMMENT '合同返回经手人',
  `contract_sign_user` varchar(30) DEFAULT NULL COMMENT '合同签订人',
  `contract_dur` varchar(255) DEFAULT NULL COMMENT '工期',
  `contract_duty` double DEFAULT NULL COMMENT '印花税金额',
  `contract_duty_time` varchar(30) DEFAULT NULL COMMENT '贴税日期',
  `contract_create_user` int(11) DEFAULT NULL COMMENT '创建人id',
  `contract_create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`contract_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project_contract
-- ----------------------------

-- ----------------------------
-- Table structure for project_picture
-- ----------------------------
DROP TABLE IF EXISTS `project_picture`;
CREATE TABLE `project_picture` (
  `picture_id` int(11) NOT NULL AUTO_INCREMENT,
  `pro_id` int(11) DEFAULT NULL,
  `picture_nature` int(11) DEFAULT NULL COMMENT '图纸性质 字典id',
  `picture_time` varchar(30) DEFAULT NULL COMMENT '接受竣工图时间',
  `picture_type` int(1) DEFAULT NULL COMMENT '竣工图是否合格 1 合格，0不合格',
  `picture_type_time` varchar(30) DEFAULT NULL COMMENT '竣工图合格时间',
  `picture_remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `picture_create_user` int(11) DEFAULT NULL COMMENT '创建人id',
  `picture_create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`picture_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project_picture
-- ----------------------------

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
  `pro_number_type` int(11) DEFAULT NULL COMMENT '编号性质，字典id',
  `pro_number` varchar(100) DEFAULT NULL COMMENT '工号',
  `pro_snap_number` varchar(100) DEFAULT NULL COMMENT '临时工号',
  `pro_serial_number` varchar(100) DEFAULT NULL COMMENT '序号',
  `pro_lssued_time` varchar(30) DEFAULT NULL COMMENT '任务下达时间',
  `pro_area` int(11) DEFAULT NULL COMMENT '工程所在区 字典id',
  `pro_roads_time` varchar(30) DEFAULT NULL COMMENT '路政报批时间',
  `pro_traffic_time` varchar(30) DEFAULT NULL COMMENT '交通报批时间',
  `pro_period` int(11) DEFAULT NULL COMMENT '期次 字典id',
  `pro_const` varchar(100) DEFAULT NULL COMMENT '施工单位 字典id',
  `pro_dept` int(255) DEFAULT NULL COMMENT '转入单位  部门id',
  `pro_design_length` double DEFAULT NULL COMMENT '设计长度',
  `pro_pipe_length` double DEFAULT NULL COMMENT '管径',
  `pro_snap_length` double DEFAULT NULL COMMENT '临时线长度',
  `create_user` int(11) DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  `pro_user` varchar(100) DEFAULT NULL COMMENT '联系人',
  `pro_user_phone` varchar(20) DEFAULT NULL COMMENT '电话',
  `pro_remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `pro_pipe` double DEFAULT NULL COMMENT '管阀口径',
  `pro_pipe_lengths` double DEFAULT NULL COMMENT '管阀长度',
  `pro_water` double DEFAULT NULL COMMENT '水表口径',
  `pro_water_number` int(11) DEFAULT NULL COMMENT '水表数量',
  `pro_design` int(1) DEFAULT NULL COMMENT '是否需要设计交底 1是，0否',
  `pro_billing` int(1) DEFAULT NULL COMMENT '是否需要计费协议 1是，0否',
  `pro_water_begintime` varchar(30) DEFAULT NULL COMMENT '临时水开始日期',
  `pro_water_endtime` varchar(30) DEFAULT NULL COMMENT '临时水结束日期',
  `pro_contract_number` varchar(50) DEFAULT NULL COMMENT '合同编号',
  `pro_status` int(1) DEFAULT NULL COMMENT '1 再施，2待施，3已完工',
  `pro_type` int(1) DEFAULT NULL COMMENT '1打开，2关闭',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project_produce
-- ----------------------------
INSERT INTO `project_produce` VALUES ('10', '1', null, '33', '6', '测试工程001', '19', '36', '00001', '00001', '00001', '2018-04-08 11:05:31', '9', null, null, '24', '11,10', '7', '12', '12', '12', '1', '2018-04-08 11:05:55', '张三', '15254566709', '111111111111', null, null, '12', '12', '1', '1', '', '', null, '1', '1');
INSERT INTO `project_produce` VALUES ('11', '1', null, '22', '6', '24', '18', '36', '11', '11', '11', '', '9', null, null, '23', '10', '8', null, null, null, '1', '2018-04-08 11:57:47', '234234', '23423234', '', null, null, null, null, '1', '1', '', '', null, '1', '1');
INSERT INTO `project_produce` VALUES ('12', '1', null, '33', '6', '234', '18', '36', '234234', '24234', '4234', '', '9', null, null, '52', '11,10', '8', '21', '234', '324', '31', '2018-04-08 06:55:07', '234', '24234', '4234', null, null, '234', '234', '1', '1', '', '', null, '1', '1');

-- ----------------------------
-- Table structure for project_receipts
-- ----------------------------
DROP TABLE IF EXISTS `project_receipts`;
CREATE TABLE `project_receipts` (
  `receipts_id` int(11) NOT NULL AUTO_INCREMENT,
  `pro_id` int(11) DEFAULT NULL COMMENT '项目id',
  `receipts_money` double DEFAULT NULL COMMENT '收款金额',
  `receipts_time` varchar(30) DEFAULT NULL COMMENT '收款时间',
  `receipts_unit` varchar(30) DEFAULT NULL COMMENT '交款单位',
  `receipts_user` varchar(255) DEFAULT NULL COMMENT '收款经手人',
  `receipts_create_user` int(11) DEFAULT NULL COMMENT '创建人',
  `receipts_create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  `receipts_source` int(1) DEFAULT NULL COMMENT '工程来源，1集团内，2集团外',
  PRIMARY KEY (`receipts_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project_receipts
-- ----------------------------

-- ----------------------------
-- Table structure for project_road_word_detail
-- ----------------------------
DROP TABLE IF EXISTS `project_road_word_detail`;
CREATE TABLE `project_road_word_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pc_id` int(11) DEFAULT NULL COMMENT '施工单位id',
  `pro_id` int(11) DEFAULT NULL COMMENT '项目id',
  `detail_day` double DEFAULT NULL COMMENT '当日工作量长度',
  `detail_next_day` double DEFAULT NULL COMMENT '下一日工作量长度',
  `detail_dma` double DEFAULT NULL COMMENT '当日dma个数',
  `detail_next_dma` double DEFAULT NULL COMMENT '下一日dma个数',
  `detail_anti` double DEFAULT NULL COMMENT '倒流防止器口径个数',
  `detail_next_anti` double DEFAULT NULL COMMENT '下一日倒流防止器口径个数',
  `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  `create_user` int(11) DEFAULT NULL COMMENT '创建人',
  `dn_id` int(11) DEFAULT NULL,
  `detail_remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project_road_word_detail
-- ----------------------------
INSERT INTO `project_road_word_detail` VALUES ('1', '18', '10', '2', '2', '2', '2', '2', '2', '2018-04-08 03:19:47', '30', '45', '2222');
INSERT INTO `project_road_word_detail` VALUES ('5', '18', '10', '1', '1', '1', '1', '1', '1', '2018-04-08 04:21:34', '30', '46', '1');
INSERT INTO `project_road_word_detail` VALUES ('6', '19', '10', '2', '2', '2', '2', '2', '2', '2018-04-08 04:21:58', '30', '43', '2');
INSERT INTO `project_road_word_detail` VALUES ('7', '19', '10', '1', '1', '1', '1', '1', '1', '2018-04-08 04:21:58', '30', '44', '1');
INSERT INTO `project_road_word_detail` VALUES ('8', '18', '10', '3', '3', '3', '3', '3', '3', '2018-04-09 04:21:58', '30', '45', '23432');
INSERT INTO `project_road_word_detail` VALUES ('9', '20', '11', '2', '2', '2', '2', '2', '2', '2018-04-08 18:53:08', '31', '44', '222');
INSERT INTO `project_road_word_detail` VALUES ('10', '20', '11', '2', '2', '2', '2', '2', '2', '2018-04-08 18:53:08', '31', '45', '2');
INSERT INTO `project_road_word_detail` VALUES ('11', '20', '11', '3', '3', '3', '3', '3', '3', '2018-04-08 18:53:08', '31', '46', '3');
INSERT INTO `project_road_word_detail` VALUES ('12', '21', '12', '2', '2', '2', '2', '2', '2', '2018-04-08 18:56:35', '31', '48', '2');
INSERT INTO `project_road_word_detail` VALUES ('13', '21', '12', '4', '4', '4', '4', '4', '4', '2018-04-08 18:56:35', '31', '49', '4');
INSERT INTO `project_road_word_detail` VALUES ('14', '21', '12', '5', '5', '5', '5', '5', '5', '2018-04-08 18:56:35', '31', '50', '5');
INSERT INTO `project_road_word_detail` VALUES ('15', '18', '10', '6', '6', null, null, '6', '6', '2018-04-08 18:56:35', '31', '47', '6');

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
  `prw_road_work` double DEFAULT NULL COMMENT '累计投入机械台班',
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
  `pro_id` int(11) DEFAULT NULL,
  `prw_roads_time` varchar(30) DEFAULT NULL COMMENT '路政报批时间',
  `prw_traffic_time` varchar(30) DEFAULT NULL COMMENT '交通报批时间',
  `prw_team` varchar(255) DEFAULT NULL COMMENT '劳务分包队伍',
  `prw_budget_user` varchar(30) DEFAULT NULL COMMENT '预算编制人',
  `prw_budget_time` varchar(30) DEFAULT NULL COMMENT '预算审核合格日期',
  `prw_contract_time` varchar(30) DEFAULT NULL COMMENT '合同签订日期',
  `prw_archive_time` varchar(30) DEFAULT NULL COMMENT '标办存档日期',
  `prw_contract_number` varchar(50) DEFAULT NULL COMMENT '合同号',
  `prw_contract_price` double DEFAULT NULL COMMENT '合同金额',
  `prw_group_time` varchar(30) DEFAULT NULL COMMENT '施组审核合格日期',
  `prw_design_time` varchar(30) DEFAULT NULL COMMENT '设计交底时间',
  `prw_billing_time` varchar(30) DEFAULT NULL COMMENT '计费协议签订时间',
  `prw_quality` varchar(50) DEFAULT NULL COMMENT '质检员',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project_road_work
-- ----------------------------
INSERT INTO `project_road_work` VALUES ('20', '100', '200', '100', '200', null, null, '2018-04-08 13:29:42', '2018-04-20 13:29:45', '20', '2018-04-08 13:29:49', '', '', '', '', '', '', '', '500', null, null, null, '测试接到办事处', '测试道路名称', '起点', '止点', '13', '1', '1', '20', null, null, '25', '30', '2018-04-08 01:30:08', '10', '2018-04-08 13:29:24', '2018-04-08 13:29:27', '', '你猜猜', '2018-04-08 13:29:41', '', '', '', null, '', '', '', '');
INSERT INTO `project_road_work` VALUES ('21', null, '234', '234', '234', null, null, '2018-04-08 18:52:12', '2018-04-08 18:52:19', '4234', '2018-04-08 18:52:13', '', '', '', '', '', '', '', '234', '234', null, null, '4234', '234', '23423', '234', '13', '1', '1', '4324', null, null, '25', '31', '2018-04-08 06:52:27', '11', '', '', '', '24', '2018-04-08 18:52:17', '', '', '', null, '', '', '', '');
INSERT INTO `project_road_work` VALUES ('22', '234', '234', '4234', '423', null, null, '2018-04-08 18:55:37', '2018-04-08 18:55:45', '4234', '2018-04-08 18:55:39', '', '', '', '', '324', '423', '234', '24', '234', null, null, '4234', '234', '234', '234', '13', '1', '1', '234', null, null, '25', '31', '2018-04-08 06:55:52', '12', '', '', '', '234234', '2018-04-08 18:55:35', '', '', '', null, '', '', '', '');

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
  `pc_id` int(11) DEFAULT NULL COMMENT '施工单位id',
  `pro_id` int(11) DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL COMMENT '施工单位id',
  `create_time` varchar(30) DEFAULT NULL,
  `pr_dma_one` double DEFAULT NULL COMMENT 'dma15',
  `pr_dma_two` double DEFAULT NULL,
  `pr_dma_three` double DEFAULT NULL,
  `pr_dma_four` double DEFAULT NULL,
  `pr_dma_five` double DEFAULT NULL,
  `pr_dma_six` double DEFAULT NULL,
  `pr_dma_seven` double DEFAULT NULL,
  `pr_dma_eight` double DEFAULT NULL,
  `pr_dma_nine` double DEFAULT NULL,
  `pr_dma_subtotal` double DEFAULT NULL,
  `prwd_one_next` double DEFAULT NULL,
  `prwd_two_next` double DEFAULT NULL,
  `prwd_three_next` double DEFAULT NULL,
  `prwd_four_next` double DEFAULT NULL,
  `prwd_five_next` double DEFAULT NULL,
  `prwd_six_next` double DEFAULT NULL,
  `prwd_seven_next` double DEFAULT NULL,
  `prwd_eight_next` double DEFAULT NULL,
  `prwd_nine_next` double DEFAULT NULL,
  `prwd_subtotal_next` double DEFAULT NULL,
  `pr_dma_one_next` double DEFAULT NULL,
  `pr_dma_two_next` double DEFAULT NULL,
  `pr_dma_three_next` double DEFAULT NULL,
  `pr_dma_four_next` double DEFAULT NULL,
  `pr_dma_five_next` double DEFAULT NULL,
  `pr_dma_six_next` double DEFAULT NULL,
  `pr_dma_seven_next` double DEFAULT NULL,
  `pr_dma_eight_next` double DEFAULT NULL,
  `pr_dma_nine_next` double DEFAULT NULL,
  `pr_dma_subtotal_next` double DEFAULT NULL,
  `pr_head` varchar(255) DEFAULT NULL COMMENT '勾头',
  `pr_rinse` varchar(255) DEFAULT NULL COMMENT '冲洗',
  `pr_constru` varchar(255) DEFAULT NULL COMMENT '砌井',
  `pr_tube` double DEFAULT NULL COMMENT '穿管',
  `pr_tube_next` double DEFAULT NULL,
  `pr_lining` double DEFAULT NULL COMMENT '内衬',
  `pr_lining_next` double DEFAULT NULL,
  `pr_enca` double DEFAULT NULL COMMENT '包封',
  `pr_enca_next` double DEFAULT NULL,
  `prw_one` double DEFAULT NULL,
  `prw_two` double DEFAULT NULL,
  `prw_three` double DEFAULT NULL,
  `prw_four` double DEFAULT NULL,
  `prw_five` double DEFAULT NULL,
  `prw_six` double DEFAULT NULL,
  `prw_seven` double DEFAULT NULL,
  `prw_eight` double DEFAULT NULL,
  `prw_nine` double DEFAULT NULL,
  `prw_subtotal` double DEFAULT NULL,
  `prw_one_next` double DEFAULT NULL,
  `prw_two_next` double DEFAULT NULL,
  `prw_three_next` double DEFAULT NULL,
  `prw_four_next` double DEFAULT NULL,
  `prw_five_next` double DEFAULT NULL,
  `prw_six_next` double DEFAULT NULL,
  `prw_seven_next` double DEFAULT NULL,
  `prw_eight_next` double DEFAULT NULL,
  `prw_nine_next` double DEFAULT NULL,
  `prw_subtotal_next` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project_road_work_daily
-- ----------------------------
INSERT INTO `project_road_work_daily` VALUES ('14', null, null, null, null, null, null, null, null, null, null, '19', '10', '30', '2018-04-08 01:53:14', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '', '', '', '2', '2', null, null, null, null, '2', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for project_satety
-- ----------------------------
DROP TABLE IF EXISTS `project_satety`;
CREATE TABLE `project_satety` (
  `safety_id` int(11) NOT NULL AUTO_INCREMENT,
  `safety_qualified_time` varchar(30) DEFAULT NULL COMMENT '合格日期',
  `safety_hand_man` varchar(30) DEFAULT NULL COMMENT '经手人',
  `safety_edit` int(11) DEFAULT NULL COMMENT '修改次数',
  `safety_reporter` varchar(50) DEFAULT NULL COMMENT '申报人',
  `safety_principal` varchar(50) DEFAULT NULL COMMENT '现场负责人',
  `safety_phone` varchar(30) DEFAULT NULL COMMENT '联系电话',
  `safety_safe` varchar(10) DEFAULT NULL COMMENT '是否安全交底 1是 0否',
  `safety_pro` varchar(10) DEFAULT NULL COMMENT '是否施工方案 1是 0 否',
  `safety_fire` varchar(10) DEFAULT NULL COMMENT '是否治安消防 1是 0否',
  `safety_step` varchar(10) DEFAULT NULL COMMENT '安全措施 1是 0否',
  `safety_user` int(11) DEFAULT NULL COMMENT '创建人',
  `safety_user_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  `pro_id` int(11) NOT NULL COMMENT '项目id',
  PRIMARY KEY (`safety_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project_satety
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
) ENGINE=InnoDB AUTO_INCREMENT=119 DEFAULT CHARSET=utf8;

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
INSERT INTO `resources` VALUES ('65', '基础数据', '', '1', '0', '70', null, null);
INSERT INTO `resources` VALUES ('66', '基础数据管理', '/page/dicts', '1', '65', '11', null, null);
INSERT INTO `resources` VALUES ('67', '基础数据维护', '/page/dictdatas', '1', '65', '12', null, null);
INSERT INTO `resources` VALUES ('68', '添加类别', '/dict/add', '2', '66', '10', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('69', '删除类别', '/dict/delete', '2', '66', '11', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('70', '修改类别', '/dict/edit', '2', '66', '12', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('72', '添加数据', '/dictdata/add', '2', '67', '1', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('73', '删除数据', '/dictdata/delete', '2', '67', '2', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('74', '修改数据', '/dictdata/edit', '2', '67', '3', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('75', '生产科管理', '', '1', '0', '80', null, null);
INSERT INTO `resources` VALUES ('76', '项目信息', '/page/produces', '1', '75', '10', null, null);
INSERT INTO `resources` VALUES ('77', '项目管理', '', '1', '0', '90', null, null);
INSERT INTO `resources` VALUES ('78', '项目施工过程管理', '/page/roadworks', '1', '77', '10', null, null);
INSERT INTO `resources` VALUES ('79', '添加数据', '/roadworks/add', '2', '78', '10', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('80', '添加数据', '/produces/add', '2', '76', '10', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('81', '修改数据', '/roadworks/edit', '2', '78', '11', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('82', '删除数据', '/produces/delete', '2', '76', '11', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('83', '修改数据', '/produces/edit', '2', '76', '12', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('84', '删除数据', '/roadworks/delete', '2', '78', '12', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('85', '每日工作量', '/page/workdailys', '1', '77', '90', null, null);
INSERT INTO `resources` VALUES ('86', '添加数据', '/workdailys/add', '2', '85', '1', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('87', '删除数据', '/workdailys/delete', '2', '85', '2', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('88', '修改数据', '/workdailys/edit', '2', '85', '3', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('89', '施工单位管理', '/page/constructions', '1', '77', '20', null, null);
INSERT INTO `resources` VALUES ('90', '添加数据', '/constructions/add', '2', '89', '1', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('91', '删除数据', '/constructions/delete', '2', '89', '2', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('92', '修改数据', '/constructions/edit', '2', '89', '3', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('93', '安保科管理', '/page/satetys', '1', '77', '91', null, null);
INSERT INTO `resources` VALUES ('94', '添加数据', '/satetys/add', '2', '93', '1', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('95', '删除数据', '/satetys/delete', '2', '93', '2', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('96', '修改数据', '/satetys/edit', '2', '93', '3', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('97', '财务收款管理', '/page/receipts', '1', '77', '92', null, null);
INSERT INTO `resources` VALUES ('98', '添加数据', '/receipts/add', '2', '97', '1', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('99', '删除数据', '/receipts/delete', '2', '97', '2', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('100', '修改数据', '/receipts/edit', '2', '97', '3', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('101', '财务结算管理', '/page/accounts', '1', '77', '93', null, null);
INSERT INTO `resources` VALUES ('102', '添加数据', '/accounts/add', '2', '101', '1', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('103', '删除数据', '/accounts/delete', '2', '101', '2', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('104', '修改数据', '/accounts/edit', '2', '101', '3', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('105', '转竣工图管理', '/page/pictures', '1', '77', '94', null, null);
INSERT INTO `resources` VALUES ('106', '添加数据', '/pictures/add', '2', '105', '1', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('107', '删除数据', '/pictures/delete', '2', '105', '2', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('108', '修改数据', '/pictures/edit', '2', '105', '3', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('109', '合同管理', '/page/contracts', '1', '77', '95', null, null);
INSERT INTO `resources` VALUES ('110', '添加合同', '/contracts/add', '2', '109', '1', 'icon-add-new', 'add()');
INSERT INTO `resources` VALUES ('111', '删除合同', '/contracts/delete', '2', '109', '2', 'icon-remove-new', 'remove()');
INSERT INTO `resources` VALUES ('112', '修改合同', '/contracts/edit', '2', '109', '3', 'icon-edit-new', 'edit()');
INSERT INTO `resources` VALUES ('113', '工作量汇总统计', null, '1', '0', '100', null, null);
INSERT INTO `resources` VALUES ('114', '工作量汇总', '/day', '1', '113', '1', null, null);
INSERT INTO `resources` VALUES ('115', '工程类别汇总统计', '/type', '1', '113', '2', null, null);
INSERT INTO `resources` VALUES ('116', '工程类别汇总', '/typeDetail', '1', '113', '3', null, null);
INSERT INTO `resources` VALUES ('117', '打开', '/produces/on', '2', '76', '13', 'icon-on-new', 'on()');
INSERT INTO `resources` VALUES ('118', '关闭', '/produces/off', '2', '76', '14', 'icon-off-new', 'off()');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleDesc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '管理员');
INSERT INTO `role` VALUES ('2', '普通用户');
INSERT INTO `role` VALUES ('3', '超级管理员');
INSERT INTO `role` VALUES ('4', '管理部门');
INSERT INTO `role` VALUES ('7', '部门经理11');
INSERT INTO `role` VALUES ('8', '生产科录入人员');
INSERT INTO `role` VALUES ('9', '项目部录入人员');

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
INSERT INTO `role_resources` VALUES ('1', '85');
INSERT INTO `role_resources` VALUES ('1', '86');
INSERT INTO `role_resources` VALUES ('1', '87');
INSERT INTO `role_resources` VALUES ('1', '88');
INSERT INTO `role_resources` VALUES ('1', '89');
INSERT INTO `role_resources` VALUES ('1', '90');
INSERT INTO `role_resources` VALUES ('1', '91');
INSERT INTO `role_resources` VALUES ('1', '92');
INSERT INTO `role_resources` VALUES ('1', '93');
INSERT INTO `role_resources` VALUES ('1', '94');
INSERT INTO `role_resources` VALUES ('1', '95');
INSERT INTO `role_resources` VALUES ('1', '96');
INSERT INTO `role_resources` VALUES ('1', '97');
INSERT INTO `role_resources` VALUES ('1', '98');
INSERT INTO `role_resources` VALUES ('1', '99');
INSERT INTO `role_resources` VALUES ('1', '100');
INSERT INTO `role_resources` VALUES ('1', '101');
INSERT INTO `role_resources` VALUES ('1', '102');
INSERT INTO `role_resources` VALUES ('1', '103');
INSERT INTO `role_resources` VALUES ('1', '104');
INSERT INTO `role_resources` VALUES ('1', '105');
INSERT INTO `role_resources` VALUES ('1', '106');
INSERT INTO `role_resources` VALUES ('1', '107');
INSERT INTO `role_resources` VALUES ('1', '108');
INSERT INTO `role_resources` VALUES ('1', '109');
INSERT INTO `role_resources` VALUES ('1', '110');
INSERT INTO `role_resources` VALUES ('1', '111');
INSERT INTO `role_resources` VALUES ('1', '112');
INSERT INTO `role_resources` VALUES ('1', '113');
INSERT INTO `role_resources` VALUES ('1', '114');
INSERT INTO `role_resources` VALUES ('1', '115');
INSERT INTO `role_resources` VALUES ('1', '116');
INSERT INTO `role_resources` VALUES ('1', '117');
INSERT INTO `role_resources` VALUES ('1', '118');
INSERT INTO `role_resources` VALUES ('2', '77');
INSERT INTO `role_resources` VALUES ('2', '78');
INSERT INTO `role_resources` VALUES ('2', '79');
INSERT INTO `role_resources` VALUES ('2', '81');
INSERT INTO `role_resources` VALUES ('2', '84');
INSERT INTO `role_resources` VALUES ('2', '85');
INSERT INTO `role_resources` VALUES ('2', '86');
INSERT INTO `role_resources` VALUES ('2', '87');
INSERT INTO `role_resources` VALUES ('2', '88');
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
INSERT INTO `role_resources` VALUES ('8', '75');
INSERT INTO `role_resources` VALUES ('8', '76');
INSERT INTO `role_resources` VALUES ('8', '80');
INSERT INTO `role_resources` VALUES ('8', '82');
INSERT INTO `role_resources` VALUES ('8', '83');
INSERT INTO `role_resources` VALUES ('9', '77');
INSERT INTO `role_resources` VALUES ('9', '78');
INSERT INTO `role_resources` VALUES ('9', '79');
INSERT INTO `role_resources` VALUES ('9', '81');
INSERT INTO `role_resources` VALUES ('9', '84');
INSERT INTO `role_resources` VALUES ('9', '85');
INSERT INTO `role_resources` VALUES ('9', '86');
INSERT INTO `role_resources` VALUES ('9', '87');
INSERT INTO `role_resources` VALUES ('9', '88');

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
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '3ef7164d1f6167cb9f2658c07d3c2f0a', '1', '管理员', '北京', '管理员', '1', '15510505500');
INSERT INTO `user` VALUES ('3', 'user2', '121', '1', 'lwb1', '', '', '3', '15810267343');
INSERT INTO `user` VALUES ('4', 'user3', 'user3', '1', 'lwb2', '', '', '4', '15810267343');
INSERT INTO `user` VALUES ('5', 'user4', 'user4', '1', null, null, null, '1', null);
INSERT INTO `user` VALUES ('8', 'user7', 'user7', '1', null, null, null, '1', null);
INSERT INTO `user` VALUES ('26', 'lwb1', '56d7d4c0ec5c9defdac4b2c13ee6d3d4', '1', 'lwb1', '', '', '6', '15810267343');
INSERT INTO `user` VALUES ('27', 'lwb2', '207457aac2d42075f777e5e9f41e4651', '1', 'lwb2', '', '', '7', '15810267343');
INSERT INTO `user` VALUES ('28', 'lwb3', '950c6a12c370851bc5725d2b816dfe50', '1', 'lwb3', '', '', '8', '15810267343');
INSERT INTO `user` VALUES ('29', 'admini', 'a3c1fd626ed9bb594a2d987d8b8a33b8', '1', 'admini', '', '', '5', '15810267343');
INSERT INTO `user` VALUES ('30', 'lwl1', 'b0ca47c204208d6b02e54f292b7e622f', '1', '123', '123', '123', '7', '1231111');
INSERT INTO `user` VALUES ('31', 'lwl2', '77a692f688af6b50bf92e8c74953bc43', '1', '112312', '13123', '3123', '8', '12321313');

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
INSERT INTO `user_role` VALUES ('1', '1');
INSERT INTO `user_role` VALUES ('1', '2');
INSERT INTO `user_role` VALUES ('1', '3');
INSERT INTO `user_role` VALUES ('1', '4');
INSERT INTO `user_role` VALUES ('1', '7');
INSERT INTO `user_role` VALUES ('4', '9');
INSERT INTO `user_role` VALUES ('3', '9');
INSERT INTO `user_role` VALUES ('26', '8');
INSERT INTO `user_role` VALUES ('27', '9');
INSERT INTO `user_role` VALUES ('28', '9');
INSERT INTO `user_role` VALUES ('29', '1');
INSERT INTO `user_role` VALUES ('31', '1');
INSERT INTO `user_role` VALUES ('30', '1');

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
