CREATE TABLE `rz`(
                        `id` INT NOT NULL AUTO_INCREMENT COMMENT '序号' ,
                        `time` DATETIME DEFAULT NULL COMMENT '日期' ,
                        `tempo` INT DEFAULT NULL COMMENT '温度' ,
                        `hum` INT DEFAULT NULL COMMENT '空气湿度' ,
                        `tr` INT DEFAULT NULL COMMENT '土壤湿度' ,
                        `lx` INT DEFAULT NULL COMMENT '光照强度' ,
                        `eyht` INT DEFAULT NULL COMMENT '二氧化碳' ,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT = '软著';
