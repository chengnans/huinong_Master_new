CREATE TABLE `growers`(
                        `id` INT AUTO_INCREMENT COMMENT '编号' ,
                        `classify` VARCHAR(255) DEFAULT NULL COMMENT '种植户分类' ,
                        `name` VARCHAR(255) DEFAULT NULL COMMENT '种植户名称' ,
                        `photo` VARCHAR(255) DEFAULT NULL COMMENT '种植户头像' ,
                        `phone` VARCHAR(15) DEFAULT NULL COMMENT '联系电话' ,
                        `location` VARCHAR(255) DEFAULT NULL COMMENT '所在地区' ,
                        `address` VARCHAR(255) DEFAULT NULL COMMENT '详细地址' ,
                        `subsidy` DECIMAL(10,2) DEFAULT NULL COMMENT '农业补贴' ,
                        `remark` VARCHAR(255) DEFAULT NULL COMMENT '备注' ,
                        `status` VARCHAR(1) DEFAULT NULL COMMENT '状态' ,
                        `planting` VARCHAR(255) DEFAULT NULL COMMENT '种植地块' ,
                        `own` VARCHAR(1) DEFAULT NULL COMMENT '是否产权所有人' ,
                        PRIMARY KEY (id)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT = '种植户管理';
