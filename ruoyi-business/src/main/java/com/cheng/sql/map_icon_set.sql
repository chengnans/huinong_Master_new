CREATE TABLE `map_icon_set`(
                               `id` INT AUTO_INCREMENT COMMENT '序号' ,
                               `name` VARCHAR(255)   DEFAULT NULL COMMENT '名称' ,
                               `icon_style` VARCHAR(255)   DEFAULT NULL COMMENT '图标种类' ,
                               `option_style` VARCHAR(255)   DEFAULT NULL COMMENT '选项卡种类' ,
                               `relevant_system` VARCHAR(255)   DEFAULT NULL COMMENT '关联系统' ,
                               `relevant_organization` VARCHAR(255)   DEFAULT NULL COMMENT '关联机构' ,
                               `detail` VARCHAR(255)   DEFAULT NULL COMMENT '备注' ,
                               `release_menu` VARCHAR(255)   DEFAULT NULL COMMENT '发布菜单' ,
                               `condition` VARCHAR(255)   DEFAULT NULL COMMENT '状态' ,
                               `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                               `update_time` DATETIME   DEFAULT NULL COMMENT '更新时间' ,
                               PRIMARY KEY (id)
)  COMMENT = '地图图标配置';
