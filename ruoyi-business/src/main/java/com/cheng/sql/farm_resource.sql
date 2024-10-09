CREATE TABLE `farm_resource`(
                              `id` INT AUTO_INCREMENT COMMENT '农资编号' ,
                              `type` VARCHAR(255) DEFAULT NULL COMMENT '所属类别' ,
                              `name` VARCHAR(255) DEFAULT NULL COMMENT '农资名称' ,
                              `another_name` VARCHAR(255) DEFAULT NULL COMMENT '别名' ,
                              `measuring_unit` VARCHAR(255) DEFAULT NULL COMMENT '计量单位' ,
                              `specification` VARCHAR(255) DEFAULT NULL COMMENT '规格' ,
                              `description` VARCHAR(255) DEFAULT NULL COMMENT '备注' ,
                              `status` VARCHAR(1) DEFAULT NULL COMMENT '状态' ,
                              `create_time` VARCHAR(255) DEFAULT NULL COMMENT '创建时间' ,
                              PRIMARY KEY (id)
)  COMMENT = '农资管理';
