package com.yang.consumer;

import com.yang.model.UserAddress;
import com.yang.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class MyConsumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = context.getBean(OrderService.class);
        List<UserAddress> addresses = orderService.initOrder("1232132");
//        UserService userService = (UserService) context.getBean("userService");
//        List<UserAddress> addresses = userService.getUserAddressList("1231213123");
        for (UserAddress address : addresses) {
            System.out.println(address.getUserAddress());
        }

        System.in.read();
    }
}
