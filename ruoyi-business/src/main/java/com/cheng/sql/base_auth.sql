CREATE TABLE `base_auth`(
                            `id` INT AUTO_INCREMENT COMMENT '序号' ,
                            `auth_condition` VARCHAR(255)   DEFAULT NULL COMMENT '状态' ,
                            `auth_ai` VARCHAR(255)   DEFAULT NULL COMMENT 'AI农授权' ,
                            `auth_department` VARCHAR(255)   DEFAULT NULL COMMENT '授权机构' ,
                            `auth_time` DATETIME   DEFAULT NULL COMMENT '授权时间' ,
                            `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                            PRIMARY KEY (id)
)  COMMENT = '基地授权';
