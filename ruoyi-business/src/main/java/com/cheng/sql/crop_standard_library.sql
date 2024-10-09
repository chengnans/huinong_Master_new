CREATE TABLE `crop_standard_library`(
                                        `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                        `crop_photo` VARCHAR(255)   DEFAULT NULL COMMENT '农作物图片' ,
                                        `crop_name` VARCHAR(255)   DEFAULT NULL COMMENT '农作物名称' ,
                                        `type` VARCHAR(255)   DEFAULT NULL COMMENT '所属类别' ,
                                        `classification_level` VARCHAR(255)   DEFAULT NULL COMMENT '分类级别' ,
                                        `status` VARCHAR(255)   DEFAULT NULL COMMENT '数据状态' ,
                                        `operator` VARCHAR(255)   DEFAULT NULL COMMENT '操作人' ,
                                        `operating_time` DATETIME   DEFAULT NULL COMMENT '操作时间' ,
                                        PRIMARY KEY (id)
)  COMMENT = '种植业标准库';
