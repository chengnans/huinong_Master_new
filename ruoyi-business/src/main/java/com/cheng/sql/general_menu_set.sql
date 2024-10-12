CREATE TABLE `general_menu_set`(
                                   `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                   `menu_group_name` VARCHAR(255)   DEFAULT NULL COMMENT '菜单组标题' ,
                                   `menu_child_name` VARCHAR(255)   DEFAULT NULL COMMENT '菜单项名称' ,
                                   `release_option` VARCHAR(255)   DEFAULT NULL COMMENT '发布选项' ,
                                   `release_view` VARCHAR(255)   DEFAULT NULL COMMENT '发布页面' ,
                                   `organization` VARCHAR(255)   DEFAULT NULL COMMENT '所属机构' ,
                                   `condition` VARCHAR(255)   DEFAULT NULL COMMENT '状态' ,
                                   `update_time` DATETIME   DEFAULT NULL COMMENT '更新时间' ,
                                   `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                   PRIMARY KEY (id)
)  COMMENT = '通用菜单配置';
