CREATE TABLE `facility_list`(
                                `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                `system_id` VARCHAR(255)   DEFAULT NULL COMMENT '系统编号' ,
                                `facility_id` VARCHAR(255)   DEFAULT NULL COMMENT '设施编号' ,
                                `facility_name` VARCHAR(255)   DEFAULT NULL COMMENT '设施名称' ,
                                `facility_type` VARCHAR(255)   DEFAULT NULL COMMENT '设施类型' ,
                                `facility_long` DECIMAL(10,2)   DEFAULT NULL COMMENT '长' ,
                                `facility_width` DECIMAL(10,2)   DEFAULT NULL COMMENT '宽' ,
                                `facility_tall` DECIMAL(10,2)   DEFAULT NULL COMMENT '高' ,
                                `detail` VARCHAR(255)   DEFAULT NULL COMMENT '备注' ,
                                `organization_name` VARCHAR(255)   DEFAULT NULL COMMENT '机构名称' ,
                                `monitor` VARCHAR(255)   DEFAULT NULL COMMENT '监管单位' ,
                                `phone` VARCHAR(255)   DEFAULT NULL COMMENT '联系电话' ,
                                `contact` VARCHAR(255)   DEFAULT NULL COMMENT '联系人' ,
                                `operator` VARCHAR(255)   DEFAULT NULL COMMENT '操作人' ,
                                `operating_time` DATETIME   DEFAULT NULL COMMENT '操作时间' ,
                                PRIMARY KEY (id)
)  COMMENT = '设施列表';
