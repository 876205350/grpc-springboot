package com.lrbj.grpcclient.service;

import com.lrbj.grpc.lib.GreeterGrpc;
import com.lrbj.grpc.lib.GreeterOuterClass;
import com.lrbj.grpc.lib.UserOrderGrpc;
import com.lrbj.grpc.lib.UserOrderOuterClass;
import com.lrbj.grpcclient.entity.Order;
import com.lrbj.grpcclient.tools.Result;
import com.lrbj.grpcclient.vo.OrderVO;
import com.lrbj.grpcclient.vo.UserVO;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GrpcClientService {
    //两种获取Channel方式
    //方法一
    @GrpcClient("local-grpc-server")
    private Channel serverChannel;

    public String sendMessage(String name) {
        GreeterGrpc.GreeterBlockingStub stub = GreeterGrpc.newBlockingStub(serverChannel);
        GreeterOuterClass.HelloReply response = stub.sayHello(GreeterOuterClass.HelloRequest.newBuilder().setName(name).build());
        return response.getMessage();
    }
    //甲方需要把订单信息同步到已系统
    public Result addUserOrder(UserVO userVO){
        UserOrderGrpc.UserOrderBlockingStub stub = UserOrderGrpc.newBlockingStub(serverChannel);

        UserOrderOuterClass.UORequest.Builder user = UserOrderOuterClass.UORequest.newBuilder();
//        user.setId(userVO.getId());
        user.setNickname(userVO.getNickname());
        user.setUsername(userVO.getUsername());
        user.setPassword(userVO.getPassword());
        UserOrderOuterClass.UORequest.ORequest.Builder orderBuilder = UserOrderOuterClass.UORequest.ORequest.newBuilder();
//        List<UserOrderOuterClass.UORequest.ORequest> orderList = new ArrayList<>();
        List<OrderVO> orderVOS = userVO.getOrders();
//        if(orderVOS != null && orderVOS.size() > 0) {
//            for (int i = 0; i < orderVOS.size(); i++) {
//                OrderVO order = orderVOS.get(i);
//                orderBuilder.setId(order.getId());
//                orderBuilder.setOrderstatus(order.getOrderstatus());
//                orderBuilder.setProductid(order.getProductid());
//                orderBuilder.setUserid(order.getUserid());
//                user.addORequests(i,orderBuilder);
//            }
//        }
        List<UserOrderOuterClass.UORequest.ORequest> objects = new ArrayList<>();
        for (OrderVO orderVO : orderVOS) {
            UserOrderOuterClass.UORequest.ORequest.Builder build = UserOrderOuterClass.UORequest.ORequest.newBuilder();
            build.setId(orderVO.getId());
            build.setUserid(orderVO.getUserid());
            build.setOrderstatus(orderVO.getOrderstatus());
            build.setProductid(orderVO.getProductid());
            objects.add(build.build());
        }
        user.addAllORequests(objects);
        UserOrderOuterClass.UOResponse response = stub.addUserOrder(user.build());
        Result result = new Result();
        result.setCode(response.getCode());
        result.setMsg(response.getMsg());
        result.setData(response.getData());
        return result;
    }
    //查询对应用户的订单
    public Result selectUserOrder(Integer userId){
        UserOrderGrpc.UserOrderBlockingStub stub = UserOrderGrpc.newBlockingStub(serverChannel);
        UserOrderOuterClass.OResponse oResponse = stub.selectOrder(UserOrderOuterClass.RequestId.newBuilder().setUserId(userId).build());
        System.out.println("====================="+oResponse);
        List<UserOrderOuterClass.order> orderList = oResponse.getOrdersList();
        List<OrderVO> orderVOList = new ArrayList<>();
        for (int i = 0; i < orderList.size(); i++) {
            OrderVO orderVO = new OrderVO();
            BeanUtils.copyProperties(orderList.get(i),orderVO);
            orderVOList.add(orderVO);
        }
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(orderVOList);
        return result;
    }
    public Result updateOrder(OrderVO orderVO){
        UserOrderGrpc.UserOrderBlockingStub stub = UserOrderGrpc.newBlockingStub(serverChannel);
        UserOrderOuterClass.order.Builder order = UserOrderOuterClass.order.newBuilder();
        BeanUtils.copyProperties(orderVO,order);
        UserOrderOuterClass.UOResponse uoResponse = stub.updateOrder(order.build());
        Result result = new Result();
        result.setCode(uoResponse.getCode());
        result.setMsg(uoResponse.getMsg());
        result.setData(uoResponse.getData());
        return result;
    }
}
