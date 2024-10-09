CREATE TABLE `old_tree`(
                         `id` INT AUTO_INCREMENT COMMENT '序号' ,
                         `bid` VARCHAR(255) DEFAULT NULL COMMENT '古树编号' ,
                         `year` INT DEFAULT NULL COMMENT '古树年龄' ,
                         `tree_name` VARCHAR(255) DEFAULT NULL COMMENT '古树名称' ,
                         `tree_type` VARCHAR(255) DEFAULT NULL COMMENT '古树类别' ,
                         `manager` VARCHAR(255) DEFAULT NULL COMMENT '管理人员' ,
                         `phone` INT DEFAULT NULL COMMENT '联系电话' ,
                         `tree_baseland` VARCHAR(255) DEFAULT NULL COMMENT '所属基地' ,
                         `tree_address` VARCHAR(255) DEFAULT NULL COMMENT '古树地址' ,
                         `status` VARCHAR(1) DEFAULT NULL COMMENT '状态' ,
                         `photo` VARCHAR(255) DEFAULT NULL COMMENT '图片' ,
                         `video` VARCHAR(255) DEFAULT NULL COMMENT '视频' ,
                         `qr` VARCHAR(255) DEFAULT NULL COMMENT '二维码' ,
                         `detail` VARCHAR(255) DEFAULT NULL COMMENT '古树简介' ,
                         `creat_time` DATETIME DEFAULT NULL COMMENT '创建日期' ,
                         PRIMARY KEY (id)
)  COMMENT = '古树管理';
