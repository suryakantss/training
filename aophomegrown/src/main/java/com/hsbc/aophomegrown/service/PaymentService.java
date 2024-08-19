package com.hsbc.aophomegrown.service;

import com.hsbc.aophomegrown.aspect.LogAspect;

public class PaymentService {
    private LogAspect la = new LogAspect();
    public void pay() {
        la.logbefore();
        System.out.println("Processing Payment...");
        la.logafter();
    }
}
