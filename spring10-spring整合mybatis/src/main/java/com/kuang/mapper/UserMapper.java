package com.kuang.mapper;

import com.kuang.pojo.User;

import java.util.List;

/**
 * @author ：fzj
 * @date ：2021/1/15
 */
public interface UserMapper {

    List<User> selectAllUsers();
}
