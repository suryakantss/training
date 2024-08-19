package com.hsbc.aophomegrown;

import com.hsbc.aophomegrown.service.OrderService;
import com.hsbc.aophomegrown.service.PaymentService;
import com.hsbc.aophomegrown.service.ShippingService;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("AOP!!");
        OrderService os = new OrderService();
        PaymentService ps = new PaymentService();
        ShippingService ss = new ShippingService();
        ps.pay();
        os.placeOrder();
        ss.ship();
    }
}
