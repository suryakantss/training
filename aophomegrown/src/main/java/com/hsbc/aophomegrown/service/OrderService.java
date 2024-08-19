package com.hsbc.aophomegrown.service;

import com.hsbc.aophomegrown.aspect.LogAspect;
import com.hsbc.aophomegrown.aspect.SecurityAspect;

public class OrderService {
    private LogAspect la = new LogAspect();
    private SecurityAspect sa = new SecurityAspect();
    public void placeOrder(){
        sa.checkRole();
        la.logbefore();
        System.out.println("Order Placed...");
        la.logafter();
    }
}
