CREATE TABLE `soil_health_standard_library`(
                                               `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                               `bid` VARCHAR(255)   DEFAULT NULL COMMENT '编号' ,
                                               `name` VARCHAR(255)   DEFAULT NULL COMMENT '名称' ,
                                               `publish_time` DATETIME   DEFAULT NULL COMMENT '发布日期' ,
                                               `implementation_time` DATETIME   DEFAULT NULL COMMENT '施行日期' ,
                                               `soil_style` VARCHAR(255)   DEFAULT NULL COMMENT '土地类型' ,
                                               `soil_texture` VARCHAR(255)   DEFAULT NULL COMMENT '土壤质地' ,
                                               `detail` VARCHAR(255)   DEFAULT NULL COMMENT '备注' ,
                                               `soil_status` VARCHAR(1)   DEFAULT NULL COMMENT '状态' ,
                                               PRIMARY KEY (id)
)  COMMENT = '土壤健康标准库';
