package com.itianfen.gmall.service;

import com.itianfen.gmall.bean.UmsMember;
import com.itianfen.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Long memberId);
}
