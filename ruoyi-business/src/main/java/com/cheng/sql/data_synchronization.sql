CREATE TABLE `data_synchronization`(
                                       `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                       `bid` VARCHAR(255)   DEFAULT NULL COMMENT '编号' ,
                                       `task_name` VARCHAR(255)   DEFAULT NULL COMMENT '任务名称' ,
                                       `data_source_name` VARCHAR(255)   DEFAULT NULL COMMENT '数据源名称' ,
                                       `interface_class_name` VARCHAR(255)   DEFAULT NULL COMMENT '接口分类名称' ,
                                       `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                       PRIMARY KEY (id)
)  COMMENT = '数据同步任务';
