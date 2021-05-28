package com.yang.service.impl;

import com.yang.model.UserAddress;
import com.yang.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        List<UserAddress> addresses = new ArrayList<>();
        UserAddress address = new UserAddress();
        address.setUserAddress("深圳市南山区");
        address.setConsignee("1212123");
        address.setUserId("12312312312");
        address.setIsDefault("1");
        address.setPhoneNum("1772222222");
        address.setId(1);

        addresses.add(address);

        UserAddress address2 = new UserAddress();
        address2.setUserAddress("深圳市宝安区");
        address2.setConsignee("23232323232");
        address2.setUserId("12312312312");
        address2.setIsDefault("0");
        address2.setPhoneNum("13512312312");
        address2.setId(2);
        addresses.add(address2);

        return addresses;
    }
}
