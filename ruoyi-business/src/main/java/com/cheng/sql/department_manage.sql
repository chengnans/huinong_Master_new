CREATE TABLE `department_manage`(
                                    `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                    `affiliation` VARCHAR(255)   DEFAULT NULL COMMENT '所属机构' ,
                                    `department_name` VARCHAR(255)   DEFAULT NULL COMMENT '部门名称' ,
                                    `department_description` VARCHAR(255)   DEFAULT NULL COMMENT '部门描述' ,
                                    `creation_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                    PRIMARY KEY (id)
)  COMMENT = '部门管理';
