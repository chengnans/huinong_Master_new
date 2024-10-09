CREATE TABLE `device_center`(
                              `IMEI` VARCHAR(32) NOT NULL  COMMENT 'IMEI/MAC' ,
                              `device_classify` INT DEFAULT NULL COMMENT '设备分类' ,
                              `device_name` VARCHAR(255) DEFAULT NULL COMMENT '产品名称' ,
                              `device_id` VARCHAR(255) DEFAULT NULL COMMENT '产品ID' ,
                              `resource` VARCHAR(255) DEFAULT NULL COMMENT '接入来源' ,
                              `organization` VARCHAR(255) DEFAULT NULL COMMENT '所属机构' ,
                              PRIMARY KEY (IMEI)
)  COMMENT = '设备中心';
