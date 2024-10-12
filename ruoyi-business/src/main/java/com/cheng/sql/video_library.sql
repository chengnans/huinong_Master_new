CREATE TABLE `video_library`(
                                `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                `video_id` VARCHAR(255)   DEFAULT NULL COMMENT '音视频编号' ,
                                `video_name` VARCHAR(255)   DEFAULT NULL COMMENT '音视频名称' ,
                                `video_address` VARCHAR(255)   DEFAULT NULL COMMENT '音视频地址' ,
                                `video_size` VARCHAR(255)   DEFAULT NULL COMMENT '音视频大小' ,
                                `video_length` VARCHAR(255)   DEFAULT NULL COMMENT '音视频长度' ,
                                `affiliated_organization` VARCHAR(255)   DEFAULT NULL COMMENT '所属机构' ,
                                `detail` VARCHAR(255)   DEFAULT NULL COMMENT '备注' ,
                                `zhuang` VARCHAR(255)   DEFAULT NULL COMMENT '当前状态' ,
                                `create_time` DATETIME   DEFAULT NULL COMMENT '创建时间' ,
                                `operator` VARCHAR(255)   DEFAULT NULL COMMENT '操作人' ,
                                `operating_time` DATETIME   DEFAULT NULL COMMENT '操作时间' ,
                                PRIMARY KEY (id)
)  COMMENT = '音视频库';
