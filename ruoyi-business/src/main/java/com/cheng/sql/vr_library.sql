CREATE TABLE `vr_library`(
                             `id` INT AUTO_INCREMENT COMMENT '序号' ,
                             `vr_id` VARCHAR(255)   DEFAULT NULL COMMENT 'VR编号' ,
                             `vr_name` VARCHAR(255)   DEFAULT NULL COMMENT 'VR名称' ,
                             `vr_address` VARCHAR(255)   DEFAULT NULL COMMENT 'VR地址' ,
                             `vr_relevant` VARCHAR(255)   DEFAULT NULL COMMENT '关联VR' ,
                             `affiliated_organization` VARCHAR(255)   DEFAULT NULL COMMENT '所属机构' ,
                             `detail` VARCHAR(255)   DEFAULT NULL COMMENT '备注' ,
                             `zhuang` VARCHAR(255)   DEFAULT NULL COMMENT '当前状态' ,
                             `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                             `operator` VARCHAR(255)   DEFAULT NULL COMMENT '操作人' ,
                             `operating_time` DATETIME   DEFAULT NULL COMMENT '操作时间' ,
                             PRIMARY KEY (id)
)  COMMENT = 'VR库';
