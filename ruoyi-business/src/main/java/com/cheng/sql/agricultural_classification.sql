CREATE TABLE `agricultural_classification`(
                                              `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                              `classify_name` VARCHAR(255)   DEFAULT NULL COMMENT '分类名称' ,
                                              `classify` VARCHAR(255)   DEFAULT NULL COMMENT '上级分类' ,
                                              `photo_app` VARCHAR(255)   DEFAULT NULL COMMENT 'APP首页图片' ,
                                              `photo_crop` VARCHAR(255)   DEFAULT NULL COMMENT '农作物详情图片' ,
                                              `photo_default` VARCHAR(255)   DEFAULT NULL COMMENT '默认分类图片' ,
                                              `photo_background` VARCHAR(255)   DEFAULT NULL COMMENT '灌区背景图' ,
                                              `status` VARCHAR(255)   DEFAULT NULL COMMENT '数据状态' ,
                                              `operator` VARCHAR(255)   DEFAULT NULL COMMENT '操作人' ,
                                              `operating_time` DATETIME   DEFAULT NULL COMMENT '操作时间' ,
                                              PRIMARY KEY (id)
)  COMMENT = '农业分类设置';
