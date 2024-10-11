CREATE TABLE `farm_classify1`(
                                 `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                 `farm_classify` VARCHAR(255)   DEFAULT NULL COMMENT '农事分类' ,
                                 `farm_name` VARCHAR(255)   DEFAULT NULL COMMENT '农事名称' ,
                                 `farm_key` VARCHAR(255)   DEFAULT NULL COMMENT '农事要点' ,
                                 `used` VARCHAR(1)   DEFAULT NULL COMMENT '是否常用' ,
                                 `organization` VARCHAR(255)   DEFAULT NULL COMMENT '所属机构' ,
                                 `resource` VARCHAR(255)   DEFAULT NULL COMMENT '数据来源' ,
                                 `status` VARCHAR(255)   DEFAULT NULL COMMENT '数据状态' ,
                                 `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                 PRIMARY KEY (id)
)  COMMENT = '农事分类设置';
