CREATE TABLE `birth_cycle`(
                              `id` INT AUTO_INCREMENT COMMENT '序号' ,
                              `crop_name` VARCHAR(255)   DEFAULT NULL COMMENT '农作物名称' ,
                              `type` VARCHAR(255)   DEFAULT NULL COMMENT '所属类别' ,
                              `period_name` VARCHAR(255)   DEFAULT NULL COMMENT '批次名称' ,
                              `birth_type` VARCHAR(255)   DEFAULT NULL COMMENT '生育周期类型' ,
                              `birth_time` VARCHAR(255)   DEFAULT NULL COMMENT '生育时期' ,
                              `create_time` VARCHAR(255)   DEFAULT NULL COMMENT '创建时间' ,
                              PRIMARY KEY (id)
)  COMMENT = '生育周期设置';
