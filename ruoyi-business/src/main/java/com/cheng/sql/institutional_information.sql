CREATE TABLE `institutional_information`(
                                            `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                            `institution_name` VARCHAR(255)   DEFAULT NULL COMMENT '机构名称' ,
                                            `insitution_abbreviation` VARCHAR(255)   DEFAULT NULL COMMENT '机构简介' ,
                                            `contact` VARCHAR(255)   DEFAULT NULL COMMENT '联系人' ,
                                            `contact_number` VARCHAR(255)   DEFAULT NULL COMMENT '联系电话' ,
                                            `institution_type` VARCHAR(255)   DEFAULT NULL COMMENT '机构类型' ,
                                            `institution_scale` VARCHAR(255)   DEFAULT NULL COMMENT '机构规模' ,
                                            `region` VARCHAR(255)   DEFAULT NULL COMMENT '所属区域' ,
                                            `full_address` VARCHAR(255)   DEFAULT NULL COMMENT '详细地址' ,
                                            `longitude` VARCHAR(255)   DEFAULT NULL COMMENT '经度' ,
                                            `dimension` VARCHAR(255)   DEFAULT NULL COMMENT '维度' ,
                                            `remarksin_formation` VARCHAR(255)   DEFAULT NULL COMMENT '备注信息' ,
                                            `business_license_number` VARCHAR(255)   DEFAULT NULL COMMENT '营业执照号' ,
                                            `license_number` VARCHAR(255)   DEFAULT NULL COMMENT '经营许可证编号' ,
                                            `trade_name` VARCHAR(255)   DEFAULT NULL COMMENT '商标名称' ,
                                            `creation_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                            PRIMARY KEY (id)
)  COMMENT = '机构信息';
