package com.yang.service.impl;


import com.yang.model.UserAddress;
import com.yang.service.OrderService;
import com.yang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 1. 将服务提供者注册到注册中心
 *    1. 引入dubbo依赖(2.6.2)
 *    2. 引入zooker的客户端(curator)
 *    3.
 * 2. 将服务消费者去注册中心订阅提供者的服务地址
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        return userService.getUserAddressList(userId);
    }
}
