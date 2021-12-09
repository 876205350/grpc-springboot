package com.lrbj.grpcserver.service;

import com.lrbj.grpc.lib.GreeterOuterClass;
import com.lrbj.grpc.lib.UserOrderGrpc;
import com.lrbj.grpc.lib.UserOrderOuterClass;
import com.lrbj.grpcserver.entity.Order;
import com.lrbj.grpcserver.entity.User;
import com.lrbj.grpcserver.mapper.OrderDao;
import com.lrbj.grpcserver.mapper.UserDao;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@GrpcService(UserOrderOuterClass.class)
public class UserOrderService extends UserOrderGrpc.UserOrderImplBase {
    @Autowired
    UserDao userDao;
    @Autowired
    OrderDao orderDao;

    @Override
    public void addUserOrder(UserOrderOuterClass.UORequest request, StreamObserver<UserOrderOuterClass.UOResponse> responseStreamObserver){
        System.out.println(request);
        boolean flag = doUserOrder(request);
        UserOrderOuterClass.UOResponse.Builder response = UserOrderOuterClass.UOResponse.newBuilder();
        if (flag){
            response.setCode(200);
            response.setMsg("成功");
            response.setData("");
        }else {
            response.setCode(999);
            response.setMsg("失败");
            response.setData("");
        }
        responseStreamObserver.onNext(response.build());
        responseStreamObserver.onCompleted();
    }
    @Transactional(rollbackFor=Exception.class,timeout=10)
    public boolean doUserOrder(UserOrderOuterClass.UORequest request){
        request.getId();
        boolean flag = true;
        User user = new User();
        user.setNickname(request.getNickname());
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        int numU = userDao.insert(user);
        if (numU<0){
            flag = false;
        }
        List<UserOrderOuterClass.UORequest.ORequest> oRequestList = request.getORequestsList();
        for (int i = 0; i < oRequestList.size(); i++) {
            Order order = new Order();
            order.setOrderstatus(oRequestList.get(i).getOrderstatus());
            order.setProductid(oRequestList.get(i).getProductid());
            order.setUserid(request.getId());
            int numO = orderDao.insert(order);
            if (numO<0){
                flag = false;
            }
        }
        return flag;
    }
    @Override
    public void selectOrder(UserOrderOuterClass.RequestId oRequest,StreamObserver<UserOrderOuterClass.OResponse> oResponseStreamObserver){
        int userId = oRequest.getUserId();
        List<Order> orders = orderDao.selectByUserId(userId);
        UserOrderOuterClass.OResponse.Builder oResponse = UserOrderOuterClass.OResponse.newBuilder();
        UserOrderOuterClass.order.Builder order = UserOrderOuterClass.order.newBuilder();
        for (int i = 0; i < orders.size(); i++) {
            order.setId(orders.get(i).getId());
            order.setOrderstatus(orders.get(i).getOrderstatus());
            order.setProductid(orders.get(i).getProductid());
            order.setUserid(orders.get(i).getUserid());
            oResponse.addOrders(i,order);
        }
        oResponseStreamObserver.onNext(oResponse.build());
        oResponseStreamObserver.onCompleted();
    }
    @Override
    public void updateOrder(UserOrderOuterClass.order request,StreamObserver<UserOrderOuterClass.UOResponse> responseStreamObserver){
        System.out.println(request);
        Order order = new Order();
        BeanUtils.copyProperties(request,order);
        orderDao.updateByPrimaryKeySelective(order);
        order = orderDao.selectByPrimaryKey(request.getId());
        UserOrderOuterClass.UOResponse.Builder response = UserOrderOuterClass.UOResponse.newBuilder();
        response.setCode(200);
        response.setMsg("成功");
        response.setData(order.toString());
        responseStreamObserver.onNext(response.build());
        responseStreamObserver.onCompleted();
    }
}
