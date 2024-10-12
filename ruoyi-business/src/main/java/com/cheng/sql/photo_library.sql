CREATE TABLE `photo_library`(
                                `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                `photo_id` VARCHAR(255)   DEFAULT NULL COMMENT '图片编号' ,
                                `photo_name` VARCHAR(255)   DEFAULT NULL COMMENT '图片名称' ,
                                `photo_preview` VARCHAR(255)   DEFAULT NULL COMMENT '图片预览' ,
                                `photo_address` VARCHAR(255)   DEFAULT NULL COMMENT '图片地址' ,
                                `photo_size` VARCHAR(255)   DEFAULT NULL COMMENT '图片大小' ,
                                `photo_dimension` VARCHAR(255)   DEFAULT NULL COMMENT '图片尺寸' ,
                                `photo_format` VARCHAR(255)   DEFAULT NULL COMMENT '图片格式' ,
                                `detail` VARCHAR(255)   DEFAULT NULL COMMENT '备注' ,
                                `affiliated_organization` VARCHAR(255)   DEFAULT NULL COMMENT '所属机构' ,
                                `zhuang` VARCHAR(255)   DEFAULT NULL COMMENT '当前状态' ,
                                `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                `operator` VARCHAR(255)   DEFAULT NULL COMMENT '操作人' ,
                                `operating_time` DATETIME   DEFAULT NULL COMMENT '操作时间' ,
                                PRIMARY KEY (id)
)  COMMENT = '图片库';
