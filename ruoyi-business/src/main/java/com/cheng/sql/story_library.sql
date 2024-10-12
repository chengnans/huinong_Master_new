CREATE TABLE `story_library`(
                                `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                `story_id` VARCHAR(255)   DEFAULT NULL COMMENT '故事编号' ,
                                `story_name` VARCHAR(255)   DEFAULT NULL COMMENT '故事名称' ,
                                `affiliated_organization` VARCHAR(255)   DEFAULT NULL COMMENT '所属机构' ,
                                `detail` VARCHAR(255)   DEFAULT NULL COMMENT '备注' ,
                                `zhuang` VARCHAR(255)   DEFAULT NULL COMMENT '当前状态' ,
                                `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                `operator` VARCHAR(255)   DEFAULT NULL COMMENT '操作人' ,
                                `operating_time` DATETIME   DEFAULT NULL COMMENT '操作时间' ,
                                PRIMARY KEY (id)
)  COMMENT = '故事库';
