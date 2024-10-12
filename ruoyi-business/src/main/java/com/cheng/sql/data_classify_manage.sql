CREATE TABLE `data_classify_manage`(
                                       `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                       `classification_name` VARCHAR(255)   DEFAULT NULL COMMENT '分类名称' ,
                                       `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                       PRIMARY KEY (id)
)  COMMENT = '数据分类管理';
