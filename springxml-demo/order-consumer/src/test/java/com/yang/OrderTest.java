package com.yang;

import com.yang.model.UserAddress;
import com.yang.service.impl.OrderServiceImpl;

import java.util.List;

public class OrderTest {
    public static void main(String[] args) {
        OrderServiceImpl orderService = new OrderServiceImpl();
        List<UserAddress> userAddresses = orderService.initOrder("12312312312");
        for (UserAddress userAddress : userAddresses) {
            System.out.println("用户地址: " + userAddress.getUserAddress());
        }
    }
}
