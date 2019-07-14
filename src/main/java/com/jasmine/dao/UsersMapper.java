package com.jasmine.dao;


import com.jasmine.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsersMapper {
     List<Users> getAllUsers();
}
