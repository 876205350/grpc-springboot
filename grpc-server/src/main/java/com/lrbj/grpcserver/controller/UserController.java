package com.lrbj.grpcserver.controller;


import com.lrbj.grpcserver.entity.User;
import com.lrbj.grpcserver.service.UserService;
import com.lrbj.grpcserver.tools.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/add")
    public Result add(User user){
        log.info("shuru======:"+String.valueOf(user));
        int res =  userService.insert(user);
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
}
