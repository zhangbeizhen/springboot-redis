-- 2019-3-14
drop table if exists employee;
CREATE TABLE `employee` (
  `id` INT(16) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `last_name` VARCHAR(128) DEFAULT NULL COMMENT '姓名',
  `email` VARCHAR(128) DEFAULT NULL COMMENT '邮件',
  `gender` INT(2) DEFAULT NULL COMMENT '性别',
  `card_number` VARCHAR(64) DEFAULT NULL COMMENT '胸卡编号',
  `post` VARCHAR(128) DEFAULT NULL COMMENT '岗位',
  `department_id` INT(11) DEFAULT NULL COMMENT '部门编号',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='员工表' ;