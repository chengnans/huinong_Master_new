CREATE TABLE `enterprise_list`(
                                  `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                  `enterprise_id` VARCHAR(255)   DEFAULT NULL COMMENT '企业编号' ,
                                  `enterprise_name` VARCHAR(255)   DEFAULT NULL COMMENT '企业名称' ,
                                  `enterprise_short_name` VARCHAR(255)   DEFAULT NULL COMMENT '企业简称' ,
                                  `enterprise_legal` VARCHAR(255)   DEFAULT NULL COMMENT '企业法人' ,
                                  `phone` VARCHAR(255)   DEFAULT NULL COMMENT '电话' ,
                                  `address` VARCHAR(255)   DEFAULT NULL COMMENT '地址' ,
                                  `live_name` VARCHAR(255)   DEFAULT NULL COMMENT '直播主体名称' ,
                                  `enterprise_classify` VARCHAR(255)   DEFAULT NULL COMMENT '企业分组' ,
                                  `organization` VARCHAR(255)   DEFAULT NULL COMMENT '所属机构' ,
                                  `zhuang` VARCHAR(255)   DEFAULT NULL COMMENT '当前状态' ,
                                  `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                  PRIMARY KEY (id)
)  COMMENT = '企业列表';
