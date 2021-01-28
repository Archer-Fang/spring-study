package com.kuang.demo02;

/**
 * @author ：fzj
 * @date ：2021/1/14
 */
public class Client {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserServicePorxy userServicePorxy = new UserServicePorxy();
        userServicePorxy.setUserService(userService);
        userServicePorxy.add();
    }
}
