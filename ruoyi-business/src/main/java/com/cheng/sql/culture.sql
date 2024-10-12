CREATE TABLE `culture`(
                          `id` INT AUTO_INCREMENT COMMENT '序号' ,
                          `organization` VARCHAR(255)   DEFAULT NULL COMMENT '所属机构' ,
                          `primary_classify` VARCHAR(255)   DEFAULT NULL COMMENT '一级分类' ,
                          `secondary_classify` VARCHAR(255)   DEFAULT NULL COMMENT '二级分类' ,
                          `main_title` VARCHAR(255)   DEFAULT NULL COMMENT '主标题' ,
                          `secondary_title` VARCHAR(255)   DEFAULT NULL COMMENT '副标题' ,
                          `is_show` VARCHAR(1)   DEFAULT NULL COMMENT '是否显示' ,
                          `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                          `update_time` DATETIME   DEFAULT NULL COMMENT '最后更新时间' ,
                          PRIMARY KEY (id)
)  COMMENT = '文化融合';
