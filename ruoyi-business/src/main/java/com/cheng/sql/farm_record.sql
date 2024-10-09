CREATE TABLE `farm_record`(
                            `id` INT AUTO_INCREMENT COMMENT '序号' ,
                            `baseland_name` VARCHAR(255) DEFAULT NULL COMMENT '基地' ,
                            `grop_name` VARCHAR(32) DEFAULT NULL COMMENT '作物名称' ,
                            `grow_cycle` DATETIME DEFAULT NULL COMMENT '生长周期' ,
                            `farm_operation` VARCHAR(32) DEFAULT NULL COMMENT '农事操作' ,
                            `farm_requirement` DATETIME DEFAULT NULL COMMENT '农事要求' ,
                            `operation_time` DATETIME DEFAULT NULL COMMENT '操作日期' ,
                            `working_hours` VARCHAR(255)  DEFAULT NULL COMMENT '实际工时' ,
                            `photos` VARCHAR(255) DEFAULT NULL COMMENT '作业图片' ,
                            `input` VARCHAR(255) DEFAULT NULL COMMENT '投入品' ,
                            `input_quantity` VARCHAR(255) DEFAULT NULL COMMENT '投入数量' ,
                            `detail` VARCHAR(255) DEFAULT NULL COMMENT '详细操作描述' ,
                            PRIMARY KEY (id)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT = '农事记录';
