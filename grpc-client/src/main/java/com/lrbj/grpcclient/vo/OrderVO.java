package com.lrbj.grpcclient.vo;

import lombok.Data;

@Data
public class OrderVO {
    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userid;

    /**
     * 商品ID
     */
    private Integer productid;

    /**
     * 订单状态
     */
    private Integer orderstatus;

}
