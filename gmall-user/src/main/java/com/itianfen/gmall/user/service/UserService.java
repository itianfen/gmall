package com.itianfen.gmall.user.service;

import com.itianfen.gmall.user.bean.UmsMember;
import com.itianfen.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Long memberId);
}
