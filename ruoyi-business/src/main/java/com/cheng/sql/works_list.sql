CREATE TABLE `works_list`(
                             `id` INT AUTO_INCREMENT COMMENT '序号' ,
                             `works_id` VARCHAR(255)   DEFAULT NULL COMMENT '作品编号' ,
                             `works_name` VARCHAR(255)   DEFAULT NULL COMMENT '作品名称' ,
                             `works_cover` VARCHAR(255)   DEFAULT NULL COMMENT '封面' ,
                             `publisher` VARCHAR(255)   DEFAULT NULL COMMENT '发布人' ,
                             `publish_time` DATETIME   DEFAULT NULL COMMENT '发布时间' ,
                             `affiliated_enterprise` VARCHAR(255)   DEFAULT NULL COMMENT '所属企业' ,
                             `affiliated_organization` VARCHAR(255)   DEFAULT NULL COMMENT '所属机构' ,
                             `zhuang` VARCHAR(255)   DEFAULT NULL COMMENT '当前状态' ,
                             `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                             PRIMARY KEY (id)
)  COMMENT = '作品列表';
