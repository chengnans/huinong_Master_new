CREATE TABLE `data_source_manage`(
                                     `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                     `bid` VARCHAR(255)   DEFAULT NULL COMMENT '数据源编号' ,
                                     `data_source_name` VARCHAR(255)   DEFAULT NULL COMMENT '数据源名称' ,
                                     `platform_name` VARCHAR(255)   DEFAULT NULL COMMENT '平台名称' ,
                                     `app_name` VARCHAR(255)   DEFAULT NULL COMMENT '应用名称' ,
                                     `due_date` DATETIME   DEFAULT NULL COMMENT '到期日期' ,
                                     `status` VARCHAR(1)   DEFAULT NULL COMMENT '状态' ,
                                     `create_time` DATETIME   DEFAULT NULL COMMENT '创建日期' ,
                                     PRIMARY KEY (id)
)  COMMENT = '数据源管理';
