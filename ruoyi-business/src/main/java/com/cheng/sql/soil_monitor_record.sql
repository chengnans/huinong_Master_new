CREATE TABLE `soil_monitor_record`(
                                      `id` INT AUTO_INCREMENT COMMENT '序号' ,
                                      `report_id` VARCHAR(255)   DEFAULT NULL COMMENT '报告编号' ,
                                      `sample_id` VARCHAR(255)   DEFAULT NULL COMMENT '样品编号' ,
                                      `sampling_date` DATETIME   DEFAULT NULL COMMENT '采样日期' ,
                                      `sampling_address` VARCHAR(255)   DEFAULT NULL COMMENT '采样地址' ,
                                      `analysis_date` DATETIME   DEFAULT NULL COMMENT '分析日期' ,
                                      `village` VARCHAR(255)   DEFAULT NULL COMMENT '行政村' ,
                                      `baseland` VARCHAR(255)   DEFAULT NULL COMMENT '基地' ,
                                      `plot` VARCHAR(255)   DEFAULT NULL COMMENT '地块' ,
                                      `pH` VARCHAR(255)   DEFAULT NULL COMMENT '酸碱度得分' ,
                                      `heavy_metal` VARCHAR(255)   DEFAULT NULL COMMENT '重金属得分' ,
                                      `pesticide_pollution` VARCHAR(255)   DEFAULT NULL COMMENT '农药污染得分' ,
                                      PRIMARY KEY (id)
)  COMMENT = '土壤检测记录';
