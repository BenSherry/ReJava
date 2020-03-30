package com.jasoyang.session6.MyStaticProxy;

public class AdminServiceProxy implements AdminService {

    private AdminService adminService;

    public AdminServiceProxy(AdminService adminService) {
        this.adminService = adminService;
    }

    public void update() {
        adminService.update();
    }

    public Object find() {
        return adminService.find();
    }
}
