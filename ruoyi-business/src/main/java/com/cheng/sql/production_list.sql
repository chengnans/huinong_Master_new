DROP TABLE IF EXISTS production_list;
CREATE TABLE `production_list`(
                                  `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                  `production_id` VARCHAR(255)   DEFAULT NULL COMMENT '产品编号' ,
                                  `production_name` VARCHAR(255)   DEFAULT NULL COMMENT '产品名称' ,
                                  `affiliated_enterprise` VARCHAR(255)   DEFAULT NULL COMMENT '所属企业' ,
                                  `affiliated_organization` VARCHAR(255)   DEFAULT NULL COMMENT '所属机构' ,
                                  `zhuang` VARCHAR(255)   DEFAULT NULL COMMENT '当前状态' ,
                                  `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                  `operator` VARCHAR(255)   DEFAULT NULL COMMENT '操作人' ,
                                  `operating_time` DATETIME   DEFAULT NULL COMMENT '操作时间' ,
                                  PRIMARY KEY (id)
)  COMMENT = '产品列表';
