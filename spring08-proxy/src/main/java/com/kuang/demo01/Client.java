package com.kuang.demo01;

/**
 * @author ：fzj
 * @date ：2021/1/14
 */
public class Client {

    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.seeHouse();
        proxy.rent();
        proxy.hetong();
        proxy.fare();
    }

}
