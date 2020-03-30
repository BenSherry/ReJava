package com.jasoyang.session6.MyStaticProxy;

public class AdminServiceImpl implements AdminService {
    public void update() {
        System.out.println("update some thing");
    }

    public Object find() {
        System.out.println("find some thing");
        return new Object();
    }
}
