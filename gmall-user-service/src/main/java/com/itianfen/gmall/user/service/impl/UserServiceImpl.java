package com.itianfen.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itianfen.gmall.bean.UmsMemberReceiveAddress;
import com.itianfen.gmall.bean.UmsMember;
import com.itianfen.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.itianfen.gmall.user.mapper.UserMapper;
import com.itianfen.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {

        return userMapper.selectAll();

    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Long memberId) {
        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(example);
        return umsMemberReceiveAddresses;
    }
}
