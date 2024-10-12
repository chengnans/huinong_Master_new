CREATE TABLE `industrial_price`(
                                   `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                   `time` DATETIME   DEFAULT NULL COMMENT '日期' ,
                                   `interface_class_name` VARCHAR(255)   DEFAULT NULL COMMENT '接口分类名称' ,
                                   `producing_area` VARCHAR(255)   DEFAULT NULL COMMENT '所在产地' ,
                                   `price` VARCHAR(255)   DEFAULT NULL COMMENT '价格' ,
                                   `adjust_price` VARCHAR(255)   DEFAULT NULL COMMENT '调整价格' ,
                                   `local_class_name` VARCHAR(255)   DEFAULT NULL COMMENT '本地分类名称' ,
                                   `data_source_name` VARCHAR(255)   DEFAULT NULL COMMENT '数据源名称' ,
                                   `platform_name` VARCHAR(255)   DEFAULT NULL COMMENT '平台名称' ,
                                   `application_name` VARCHAR(255)   DEFAULT NULL COMMENT '应用名称' ,
                                   `creator` VARCHAR(255)   DEFAULT NULL COMMENT '创建人' ,
                                   `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                   PRIMARY KEY (id)
)  COMMENT = '产业价格管理';
