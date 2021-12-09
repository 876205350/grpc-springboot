package com.lrbj.grpcclient.service;

import com.lrbj.grpcclient.entity.User;
import com.lrbj.grpcclient.mapper.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    public List<User> select(){
        return userDao.selectUserAll();
    }
    public User selectOne(Integer id){
        return userDao.selectByPrimaryKey(id);
    }
}
