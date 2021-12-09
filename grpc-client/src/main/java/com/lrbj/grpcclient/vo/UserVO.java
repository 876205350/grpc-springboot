package com.lrbj.grpcclient.vo;

import lombok.Data;

import java.util.List;

@Data
public class UserVO {
    /**
     * 自增主键
     */
    private Integer id;

    private String nickname;

    private String username;

    private String password;

    /**
     *
     * 订单数据
     */
    private List<OrderVO> orders;

}
