package com.lrbj.grpcclient.controller;

import com.lrbj.grpcclient.entity.Order;
import com.lrbj.grpcclient.service.GrpcClientService;
import com.lrbj.grpcclient.tools.Result;
import com.lrbj.grpcclient.vo.OrderVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private GrpcClientService grpcClientService;

    @RequestMapping("/select")
    public Result select(Integer userId){
        return grpcClientService.selectUserOrder(userId);
    }
    @RequestMapping("/updateOrder")
    public Result updateOrder(OrderVO orderVO){
        return grpcClientService.updateOrder(orderVO);
    }
}
