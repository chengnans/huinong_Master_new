CREATE TABLE `disaster_model`(
                                 `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                 `disaster_type` VARCHAR(255)   DEFAULT NULL COMMENT '灾害类型' ,
                                 `disaster_name` VARCHAR(255)   DEFAULT NULL COMMENT '灾害名称' ,
                                 `occur_time` VARCHAR(255)   DEFAULT NULL COMMENT '发生时段' ,
                                 `main_parameter` VARCHAR(255)   DEFAULT NULL COMMENT '主要参数' ,
                                 `parameter_interval` VARCHAR(255)   DEFAULT NULL COMMENT '参数区间' ,
                                 `disaster_detail` VARCHAR(255)   DEFAULT NULL COMMENT '灾害说明' ,
                                 `measures` VARCHAR(255)   DEFAULT NULL COMMENT '应对措施' ,
                                 `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                 PRIMARY KEY (id)
)  COMMENT = '灾害模型';
