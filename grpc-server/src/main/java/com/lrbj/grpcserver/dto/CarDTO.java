package com.lrbj.grpcserver.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class CarDTO {
    //编号
    private Long id;
    //车牌
    private String vin;
    //单价
    private double price;
    //总价
    private double totalPrice;
    //生产时间
    private Date publishDate;
    //品牌名
    private String brand;
    //颜色
    private String color;
    //零件
    private List<PartDTO> partDTOS;
    //司机
    private DriverDTO driverDTO;
}
