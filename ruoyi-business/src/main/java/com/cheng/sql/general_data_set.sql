CREATE TABLE `general_data_set`(
                                   `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                   `name` VARCHAR(255)   DEFAULT NULL COMMENT '名称' ,
                                   `organization` VARCHAR(255)   DEFAULT NULL COMMENT '所属机构' ,
                                   `data_year` VARCHAR(255)   DEFAULT NULL COMMENT '所属年份' ,
                                   `data_month` VARCHAR(255)   DEFAULT NULL COMMENT '所属月份' ,
                                   `release_option` VARCHAR(255)   DEFAULT NULL COMMENT '发布选项' ,
                                   `condition` VARCHAR(255)   DEFAULT NULL COMMENT '状态' ,
                                   `update_time` DATETIME   DEFAULT NULL COMMENT '更新时间' ,
                                   `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                   PRIMARY KEY (id)
)  COMMENT = '通用数据配置';
