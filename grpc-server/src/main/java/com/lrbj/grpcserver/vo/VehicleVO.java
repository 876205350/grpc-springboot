package com.lrbj.grpcserver.vo;

import lombok.Data;

@Data
public class VehicleVO {
    /**
     * 编号
     */
    private Long id;
    /**
     * 裸车单价
     */
    private Double price;
    /**
     * 牌子
     */
    private String brandName;
}
