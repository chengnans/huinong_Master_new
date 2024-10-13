CREATE TABLE `farm_machine`(
                               `id` INT AUTO_INCREMENT COMMENT '序号' ,
                               `station_name` VARCHAR(255)   DEFAULT NULL COMMENT '站点名称' ,
                               `contact` VARCHAR(255)   DEFAULT NULL COMMENT '联系人' ,
                               `phone` VARCHAR(255)   DEFAULT NULL COMMENT '联系电话' ,
                               `station_addr` VARCHAR(255)   DEFAULT NULL COMMENT '站点地址' ,
                               `apartment` VARCHAR(255)   DEFAULT NULL COMMENT '所属机构' ,
                               `operator` VARCHAR(255)   DEFAULT NULL COMMENT '操作人' ,
                               `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                               PRIMARY KEY (id)
)  COMMENT = '农机站点';
