CREATE TABLE `enterprise`(
                             `id` INT AUTO_INCREMENT COMMENT '序号' ,
                             `organization` VARCHAR(255)   DEFAULT NULL COMMENT '所属机构' ,
                             `primary_classify` VARCHAR(255)   DEFAULT NULL COMMENT '一级分类' ,
                             `short_name` VARCHAR(255)   DEFAULT NULL COMMENT '简称' ,
                             `intro` VARCHAR(255)   DEFAULT NULL COMMENT '简介' ,
                             `is_show` VARCHAR(1)   DEFAULT NULL COMMENT '是否显示' ,
                             `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                             `update_time` DATETIME   DEFAULT NULL COMMENT '最后更新时间' ,
                             PRIMARY KEY (id)
)  COMMENT = '产业企业';
