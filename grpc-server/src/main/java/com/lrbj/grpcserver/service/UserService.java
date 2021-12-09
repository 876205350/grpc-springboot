package com.lrbj.grpcserver.service;


import com.lrbj.grpcserver.entity.User;
import com.lrbj.grpcserver.mapper.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public int insert(User user){
        log.info("fasdfasdfas-----"+ user);
        return userDao.insert(user);
    }
    public int delete(Integer id){
        return  userDao.deleteByPrimaryKey(id);
    }
}
