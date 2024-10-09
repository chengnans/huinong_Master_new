CREATE TABLE `diseases_standard_library`(
                                            `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                            `diseases_name` VARCHAR(255)   DEFAULT NULL COMMENT '病虫害名称' ,
                                            `diseases_type` VARCHAR(255)   DEFAULT NULL COMMENT '病虫害类型' ,
                                            `resource` VARCHAR(255)   DEFAULT NULL COMMENT '数据来源' ,
                                            `crop_name` VARCHAR(255)   DEFAULT NULL COMMENT '易发作物名称' ,
                                            `status` VARCHAR(1)   DEFAULT NULL COMMENT '数据状态' ,
                                            `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                            PRIMARY KEY (id)
)  COMMENT = '病虫害标准库';
