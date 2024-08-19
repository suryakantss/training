package com.hsbc.aophomegrown.service;

import com.hsbc.aophomegrown.aspect.LogAspect;

public class ShippingService {
    private LogAspect la = new LogAspect();
    public void ship() {
        la.logbefore();
        System.out.println("Processing Payment...");
        la.logafter();
    }
}
