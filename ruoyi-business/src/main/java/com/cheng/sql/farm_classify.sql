CREATE TABLE `farm_classify`(
                              `id` INT AUTO_INCREMENT COMMENT '序号' ,
                              `farm_classify` INT DEFAULT NULL COMMENT '农事分类' ,
                              `farm_operation` VARCHAR(255) DEFAULT NULL COMMENT '农事操作' ,
                              `operate_require` VARCHAR(255) DEFAULT NULL COMMENT '操作要求' ,
                              `organization` VARCHAR(255) DEFAULT NULL COMMENT '所属机构' ,
                              `status` VARCHAR(1) DEFAULT NULL COMMENT '数据状态' ,
                              `create_time` DATETIME DEFAULT NULL COMMENT '创建时间' ,
                              PRIMARY KEY (id)
)  COMMENT = '农事分类';
