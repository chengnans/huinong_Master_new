CREATE TABLE `app_role_manage`(
                                  `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                  `role_name` VARCHAR(255)   DEFAULT NULL COMMENT '角色名称' ,
                                  `role_detail` VARCHAR(255)   DEFAULT NULL COMMENT '角色描述' ,
                                  `role_type` VARCHAR(255)   DEFAULT NULL COMMENT '角色类型' ,
                                  `apartment` VARCHAR(255)   DEFAULT NULL COMMENT '所属机构' ,
                                  `role_condition` VARCHAR(255)   DEFAULT NULL COMMENT '当前状态' ,
                                  `role_sorts` VARCHAR(255)   DEFAULT NULL COMMENT '排序' ,
                                  `operate_time` DATETIME   DEFAULT NULL COMMENT '操作时间' ,
                                  `operator` VARCHAR(255)   DEFAULT NULL COMMENT '操作人' ,
                                  PRIMARY KEY (id)
)  COMMENT = 'APP角色管理';
