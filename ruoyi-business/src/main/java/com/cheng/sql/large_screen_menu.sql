CREATE TABLE `large_screen_menu`(
                                    `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                    `menu_classify` VARCHAR(255)   DEFAULT NULL COMMENT '菜单分组' ,
                                    `menu_name` VARCHAR(255)   DEFAULT NULL COMMENT '菜单名称' ,
                                    `menu_level` VARCHAR(255)   DEFAULT NULL COMMENT '菜单级别' ,
                                    `skip_address` VARCHAR(255)   DEFAULT NULL COMMENT '跳转地址' ,
                                    `parent_menu` VARCHAR(255)   DEFAULT NULL COMMENT '上级菜单' ,
                                    `organization` VARCHAR(255)   DEFAULT NULL COMMENT '所属机构' ,
                                    `menu_status` VARCHAR(255)   DEFAULT NULL COMMENT '当前状态' ,
                                    `create_time` DATETIME   DEFAULT NULL COMMENT '创建日期' ,
                                    PRIMARY KEY (id)
)  COMMENT = '大屏菜单管理';
