package com.hsbc.aophomegrown.aspect;

import java.time.LocalDateTime;

public class LogAspect {

    public  void logbefore(){
        System.out.println("Before...." + LocalDateTime.now());
    }
    public  void logafter(){
        System.out.println("After...." + LocalDateTime.now());
    }

}
