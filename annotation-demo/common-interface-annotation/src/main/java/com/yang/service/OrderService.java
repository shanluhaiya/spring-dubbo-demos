package com.yang.service;

import com.yang.model.UserAddress;

import java.util.List;

public interface OrderService {
    List<UserAddress> initOrder(String userId);
}
