CREATE TABLE `soil_report`(
                            `id` INT AUTO_INCREMENT COMMENT '序号' ,
                            `soil_name` VARCHAR(255) DEFAULT NULL COMMENT '地块名称' ,
                            `crop_name` VARCHAR(255) DEFAULT NULL COMMENT '作物名称' ,
                            `soil_level` VARCHAR(255) DEFAULT NULL COMMENT '土壤等级' ,
                            `area` DECIMAL(10,2) DEFAULT NULL COMMENT '面积' ,
                            `soil_baseland` VARCHAR(255) DEFAULT NULL COMMENT '所属基地' ,
                            `soil_date` DATETIME DEFAULT NULL COMMENT '统计日期' ,
                            PRIMARY KEY (id)
)  COMMENT = '土壤分级报表';
