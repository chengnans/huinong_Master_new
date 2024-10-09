CREATE TABLE `digital_base`(
                             `id` INT AUTO_INCREMENT COMMENT '序号' ,
                             `name` VARCHAR(255) DEFAULT NULL COMMENT '基地名称' ,
                             `short_name` VARCHAR(255) DEFAULT NULL COMMENT '基地简称' ,
                             `area` DECIMAL(10,2) DEFAULT NULL COMMENT '基地面积' ,
                             `classify` VARCHAR(255) DEFAULT NULL COMMENT '农业板块' ,
                             `type` VARCHAR(255) DEFAULT NULL COMMENT '种植/养殖类型' ,
                             `institution` VARCHAR(255) DEFAULT NULL COMMENT '所属机构' ,
                             `city` VARCHAR(255) DEFAULT NULL COMMENT '所在城市' ,
                             `town` VARCHAR(255) DEFAULT NULL COMMENT '镇' ,
                             `village` VARCHAR(255) DEFAULT NULL COMMENT '村' ,
                             `time` DATETIME DEFAULT NULL COMMENT '登记时间' ,
                             `contacts` VARCHAR(255) DEFAULT NULL COMMENT '联系人' ,
                             `phone` VARCHAR(15) DEFAULT NULL COMMENT '联系电话' ,
                             PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT = '基地信息';
