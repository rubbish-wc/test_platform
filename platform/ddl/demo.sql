
-- 建库
-- navicat 新建 数据库 pubud

-- 建表
CREATE TABLE `demo_t` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `age` int(10) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `creation_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `created_by` bigint(20) DEFAULT NULL,
  `last_update_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  `last_updated_by` bigint(20) DEFAULT NULL,
  `object_version_number` bigint(20) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- 插入测试数据
INSERT INTO `demo` VALUES (null, 'lisi', '12312', 'zhangsan', 19, 'male', CURRENT_TIMESTAMP, 10001, CURRENT_TIMESTAMP, 10001, 1);
INSERT INTO `demo` VALUES (null, 'wanger', '123123', 'zhangsda', 29, 'female', CURRENT_TIMESTAMP, 10002, CURRENT_TIMESTAMP, 10002, 1);

