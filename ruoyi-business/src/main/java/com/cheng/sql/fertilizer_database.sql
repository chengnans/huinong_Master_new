CREATE TABLE `fertilizer_database`(
                                      `id` INT AUTO_INCREMENT COMMENT '序号',
                                      `fertilizer_name` VARCHAR(255)  DEFAULT NULL COMMENT '肥料名称',
                                      `fertilizer_type` VARCHAR(255)  DEFAULT NULL COMMENT '肥料类型',
                                      `nitrogen` DECIMAL(10,2) DEFAULT NULL COMMENT '氮素含量',
                                      `phosphorus` DECIMAL(10,2) DEFAULT NULL COMMENT '磷素含量',
                                      `potassium` DECIMAL(10,2) DEFAULT NULL COMMENT '钾素含量',
                                      `status` VARCHAR(1) DEFAULT NULL COMMENT '状态',
                                      `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
                                       PRIMARY KEY (id)
)  COMMENT = '肥料数据库';
