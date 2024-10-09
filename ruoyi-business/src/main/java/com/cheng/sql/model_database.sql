CREATE TABLE `model_database`(
                                 `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                 `baseland_name` INT   DEFAULT NULL COMMENT '基地名称' ,
                                 `crop_name` VARCHAR(255)   DEFAULT NULL COMMENT '作物名称' ,
                                 `grow_cycle_type` DATETIME   DEFAULT NULL COMMENT '生育周期类型' ,
                                 `average_yield` VARCHAR(255)   DEFAULT NULL COMMENT '历史平均亩产' ,
                                 `forecast_yield` DECIMAL(10,2)   DEFAULT NULL COMMENT '预测亩产' ,
                                 `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                 PRIMARY KEY (id)
)  COMMENT = '模型数据库';
