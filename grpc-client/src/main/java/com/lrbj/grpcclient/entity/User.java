package com.lrbj.grpcclient.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    /**
     * 自增主键
     */
    private Integer id;

    private String nickname;

    private String username;

    private String password;

    private static final long serialVersionUID = 1L;
}