CREATE TABLE `farm_plan`(
                          `id` INT AUTO_INCREMENT COMMENT '序号' ,
                          `baseland_name` VARCHAR(255) DEFAULT NULL COMMENT '基地' ,
                          `crop_name` VARCHAR(255) DEFAULT NULL COMMENT '作物名称' ,
                          `grow_cycle` VARCHAR(255) DEFAULT NULL COMMENT '生长周期' ,
                          `farm_operation` VARCHAR(255) DEFAULT NULL COMMENT '农事操作' ,
                          `farm_require` VARCHAR(255) DEFAULT NULL COMMENT '农事要求' ,
                          `begin_time` DATETIME DEFAULT NULL COMMENT '农事开始时间' ,
                          `end_time` DATETIME DEFAULT NULL COMMENT '要求完成时间' ,
                          `operate_time` VARCHAR(255) DEFAULT NULL COMMENT '操作工时' ,
                          `photos` VARCHAR(255) DEFAULT NULL COMMENT '参考图片' ,
                          `videos` VARCHAR(255) DEFAULT NULL COMMENT '参考视频' ,
                          `input` VARCHAR(255) DEFAULT NULL COMMENT '投入品' ,
                          `input_quantity` VARCHAR(255) DEFAULT NULL COMMENT '投入量' ,
                          `description` VARCHAR(255) DEFAULT NULL COMMENT '农事作业描述' ,
                          `operator` VARCHAR(255) DEFAULT NULL COMMENT '任务分配给' ,
                          PRIMARY KEY (id)
)  COMMENT = '农事计划';
