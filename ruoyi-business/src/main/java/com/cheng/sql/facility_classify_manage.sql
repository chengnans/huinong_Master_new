CREATE TABLE `facility_classify_manage`(
                                           `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                           `classify_id` INT   DEFAULT NULL COMMENT '分类ID' ,
                                           `classify_name` VARCHAR(255)   DEFAULT NULL COMMENT '分类名称' ,
                                           `classify_icon` VARCHAR(255)   DEFAULT NULL COMMENT '分类图标' ,
                                           `classify_photo` VARCHAR(255)   DEFAULT NULL COMMENT '分类图片' ,
                                           `f_sort` VARCHAR(255)   DEFAULT NULL COMMENT '排序' ,
                                           `f_set` VARCHAR(255)   DEFAULT NULL COMMENT '设置' ,
                                           `zhuang` VARCHAR(255)   DEFAULT NULL COMMENT '状态' ,
                                           `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                           PRIMARY KEY (id)
)  COMMENT = '设施分类管理';

