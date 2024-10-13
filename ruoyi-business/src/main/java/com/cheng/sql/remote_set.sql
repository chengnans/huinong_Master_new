CREATE TABLE `remote_set`(
                             `id` INT AUTO_INCREMENT COMMENT '序号' ,
                             `apartment_id` VARCHAR(255)   DEFAULT NULL COMMENT '机构编号' ,
                             `apartment_name` VARCHAR(255)   DEFAULT NULL COMMENT '机构名称' ,
                             `open_service` VARCHAR(255)   DEFAULT NULL COMMENT '开通服务' ,
                             `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                             PRIMARY KEY (id)
)  COMMENT = '遥感服务配置';
