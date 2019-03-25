package com.study.mapper;

import com.study.model.UserRole;
import com.study.util.MyMapper;

import java.util.List;

public interface UserRoleMapper extends MyMapper<UserRole> {
     List<Integer> findUserIdByRoleId(Integer roleId);
}