CREATE TABLE `large_screen_set`(
                                   `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                   `big_screen_id` VARCHAR(255)   DEFAULT NULL COMMENT '大屏编号' ,
                                   `big_screen_classify` VARCHAR(255)   DEFAULT NULL COMMENT '大屏分组' ,
                                   `big_screen_name` VARCHAR(255)   DEFAULT NULL COMMENT '大屏名称' ,
                                   `title` VARCHAR(255)   DEFAULT NULL COMMENT '自定义标题' ,
                                   `display_level` VARCHAR(255)   DEFAULT NULL COMMENT '显示级别' ,
                                   `area_level` VARCHAR(255)   DEFAULT NULL COMMENT '区域级别' ,
                                   `organization` VARCHAR(255)   DEFAULT NULL COMMENT '所属机构' ,
                                   `status` VARCHAR(255)   DEFAULT NULL COMMENT '当前状态' ,
                                   `create_time` DATETIME   DEFAULT NULL COMMENT '创建日期' ,
                                   PRIMARY KEY (id)
)  COMMENT = '大屏基础设置';
