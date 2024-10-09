CREATE TABLE `grow_cycle`(
                             `id` INT AUTO_INCREMENT COMMENT '序号' ,
                             `crop_name` VARCHAR(255)   DEFAULT NULL COMMENT '作物名称' ,
                             `cycle_num` VARCHAR(255)   DEFAULT NULL COMMENT '周期序号' ,
                             `cycle_name` VARCHAR(255)   DEFAULT NULL COMMENT '周期名称' ,
                             `cycle_time` VARCHAR(255)   DEFAULT NULL COMMENT '周期天数' ,
                             `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                             PRIMARY KEY (id)
)  COMMENT = '生长周期识别';
