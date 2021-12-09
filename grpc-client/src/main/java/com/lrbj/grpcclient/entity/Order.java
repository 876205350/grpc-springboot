package com.lrbj.grpcclient.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * order
 * @author 
 */
@Data
public class Order implements Serializable {
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

    private static final long serialVersionUID = 1L;
}