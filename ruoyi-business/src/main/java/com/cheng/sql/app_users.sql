CREATE TABLE `app_users`(
                            `id` INT AUTO_INCREMENT COMMENT '序号' ,
                            `phone` VARCHAR(255)   DEFAULT NULL COMMENT '手机号码' ,
                            `user_name` VARCHAR(255)   DEFAULT NULL COMMENT '用户昵称' ,
                            `user_condition` VARCHAR(255)   DEFAULT NULL COMMENT '用户状态' ,
                            `device_number` VARCHAR(255)   DEFAULT NULL COMMENT '绑定设备数' ,
                            `apartment` VARCHAR(255)   DEFAULT NULL COMMENT '所属机构' ,
                            `city` VARCHAR(255)   DEFAULT NULL COMMENT '所在城市' ,
                            `register_time` DATETIME   DEFAULT NULL COMMENT '注册时间' ,
                            `last_login_time` DATETIME   DEFAULT NULL COMMENT '上次登录时间' ,
                            `user_origin` VARCHAR(255)   DEFAULT NULL COMMENT '用户来源' ,
                            PRIMARY KEY (id)
)  COMMENT = 'APP用户';
