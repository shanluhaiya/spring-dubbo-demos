package com.yang.service;

import com.yang.model.UserAddress;

import java.util.List;

public interface UserService {
    List<UserAddress> getUserAddressList(String userId);
}
