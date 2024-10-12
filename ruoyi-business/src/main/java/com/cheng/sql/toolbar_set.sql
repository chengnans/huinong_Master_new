CREATE TABLE `toolbar_set`(
                              `id` INT AUTO_INCREMENT COMMENT '序号' ,
                              `name` VARCHAR(255)   DEFAULT NULL COMMENT '名称' ,
                              `relevant_system` VARCHAR(255)   DEFAULT NULL COMMENT '关联系统' ,
                              `release_menu` VARCHAR(255)   DEFAULT NULL COMMENT '发布菜单' ,
                              `relevant_organization` VARCHAR(255)   DEFAULT NULL COMMENT '关联机构' ,
                              `zhuang` VARCHAR(1)   DEFAULT NULL COMMENT '状态' ,
                              `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                              PRIMARY KEY (id)
)  COMMENT = '工具栏配置';
