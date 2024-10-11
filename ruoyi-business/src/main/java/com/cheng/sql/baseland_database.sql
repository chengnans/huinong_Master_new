CREATE TABLE `baseland_database`(
                                    `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                    `baseland_name` VARCHAR(255)   DEFAULT NULL COMMENT '基地名称' ,
                                    `logo` VARCHAR(255)   DEFAULT NULL COMMENT 'LOGO' ,
                                    `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                    PRIMARY KEY (id)
)  COMMENT = '基地数据库';
