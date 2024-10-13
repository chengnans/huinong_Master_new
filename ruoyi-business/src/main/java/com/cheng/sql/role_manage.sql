CREATE TABLE `role_manage`(
                              `id` INT AUTO_INCREMENT COMMENT '序号' ,
                              `institution` VARCHAR(255)   DEFAULT NULL COMMENT '选择机构' ,
                              `role_name` VARCHAR(255)   DEFAULT NULL COMMENT '角色名称' ,
                              `role_description` VARCHAR(255)   DEFAULT NULL COMMENT '角色描述' ,
                              `operation_permission` VARCHAR(255)   DEFAULT NULL COMMENT '菜单操作权限' ,
                              `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                              PRIMARY KEY (id)
)  COMMENT = '角色管理';
