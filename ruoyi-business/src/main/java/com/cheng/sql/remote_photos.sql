CREATE TABLE `remote_photos`(
                              `id` INT AUTO_INCREMENT COMMENT '序号' ,
                              `image_type` INT DEFAULT NULL COMMENT '图像类型' ,
                              `image_name` VARCHAR(255) DEFAULT NULL COMMENT '图像名称' ,
                              `image_address` VARCHAR(255) DEFAULT NULL COMMENT '图像地址' ,
                              `area` VARCHAR(255) DEFAULT NULL COMMENT '覆盖区域' ,
                              `device_name` VARCHAR(255) DEFAULT NULL COMMENT '设备名称' ,
                              `effect` VARCHAR(1) DEFAULT NULL COMMENT '是否失效' ,
                              `baseland` VARCHAR(255) DEFAULT NULL COMMENT '关联基地' ,
                              `create_time` DATETIME DEFAULT NULL COMMENT '创建时间' ,
                              `resource` VARCHAR(255) DEFAULT NULL COMMENT '图像来源' ,
                              PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT = '遥感图片';
