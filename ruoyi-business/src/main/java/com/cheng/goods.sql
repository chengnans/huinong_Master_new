CREATE TABLE `goods` (
                         `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
                         `GOODS_NAME` varchar(255) DEFAULT NULL COMMENT '商品名字',
                         `put_way_flag` tinyint(1) DEFAULT NULL COMMENT '商品是否上架，0：下架，1：上架',
                         `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                         `create_by` varchar(64) DEFAULT NULL COMMENT '创建人',
                         `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                         `update_by` varchar(64) DEFAULT NULL COMMENT '更新人',
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商品表'

