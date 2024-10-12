CREATE TABLE `origin_management`(
                                    `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                    `producing_area` VARCHAR(255)   DEFAULT NULL COMMENT '产地名称' ,
                                    `creator` VARCHAR(255)   DEFAULT NULL COMMENT '创建人' ,
                                    `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                    PRIMARY KEY (id)
)  COMMENT = '产地管理';
