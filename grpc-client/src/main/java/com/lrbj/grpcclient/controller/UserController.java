package com.lrbj.grpcclient.controller;

import com.lrbj.grpcclient.entity.User;
import com.lrbj.grpcclient.service.GrpcClientService;
import com.lrbj.grpcclient.service.UserService;
import com.lrbj.grpcclient.tools.Result;
import com.lrbj.grpcclient.vo.OrderVO;
import com.lrbj.grpcclient.vo.UserVO;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private GrpcClientService grpcClientService;

    @RequestMapping("/add")
    public Result add(User user){
        log.info("shuru======:"+String.valueOf(user));
        Result result = new Result();
        if (StringUtils.isEmpty(user.getId())){
            result.setCode(400);
            result.setMsg("失败");
        }else {
            int res = userService.insert(user);
            if (res > 0) {
                result.setCode(200);
                result.setMsg("成功");
            } else {
                result.setCode(400);
                result.setMsg("失败");
            }
        }
        return result;
    }
    @RequestMapping("/selectOne/{id}")
    public Result selectOne(@PathVariable("id") Integer id){
//        StringUtils.isEmpty(id);
        Assert.hasText(String.valueOf(id),"id不能为空");
        User user = userService.selectOne(id);
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(user);
        return result;
    }
    @RequestMapping("/delete")
    public Result delete(Integer id){
        log.info(String.valueOf(id));
        int res = userService.delete(id);
        Result result = new Result();
        if (res>0){
            result.setCode(200);
            result.setMsg("成功");
        }else {
            result.setCode(400);
            result.setMsg("失败");
        }
        return result;
    }
    @RequestMapping("/select")
    public Result<User> select(){
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(userService.select());
        return result;
    }
    @RequestMapping("/adds")
    public Result adds(@RequestBody UserVO userVO){
        log.info(String.valueOf(userVO.getId()));
        Result result = grpcClientService.addUserOrder(userVO);
        return result;
    }
    @RequestMapping("/addO")
    public String addO(UserVO userVO){
        log.info(String.valueOf(userVO.getId()));
        System.out.println(userVO);
        List<OrderVO> orderVOS = userVO.getOrders();
        User user = new User();
        user.setId(userVO.getId());
        user.setNickname(userVO.getNickname());
        user.setUsername(userVO.getUsername());
        user.setPassword(userVO.getPassword());
        System.out.println("user==="+user);
        for(OrderVO order : orderVOS) {
            System.out.println(order.getId());
            System.out.println(order.getOrderstatus());
            System.out.println(order.getProductid());
            System.out.println(order.getProductid());
        }
        System.out.println(userVO);
        return null;
    }
}
