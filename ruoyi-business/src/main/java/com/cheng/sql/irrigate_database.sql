CREATE TABLE `irrigate_database`(
                                    `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                    `baseland_name` VARCHAR(255)   DEFAULT NULL COMMENT '基地名称' ,
                                    `irrigate_name` VARCHAR(255)   DEFAULT NULL COMMENT '灌区名称' ,
                                    `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                    PRIMARY KEY (id)
)  COMMENT = '灌区数据库';
