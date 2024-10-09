CREATE TABLE `overview_statistics`(
                                    `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                    `alarm_time` DATETIME DEFAULT NULL COMMENT '预警时间' ,
                                    `device_name` VARCHAR(255) DEFAULT NULL COMMENT '设备名称' ,
                                    `alarm_type` VARCHAR(255) DEFAULT NULL COMMENT '预警类型' ,
                                    `alarm_reason` VARCHAR(255) DEFAULT NULL COMMENT '预警原因' ,
                                    `alarm_baseland` VARCHAR(255) DEFAULT NULL COMMENT '所属基地' ,
                                    PRIMARY KEY (id)
)  COMMENT = '概览统计';
