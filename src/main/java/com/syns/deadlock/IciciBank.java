package com.syns.deadlock;

public class IciciBank  implements Runnable{

    public String openSite() {
        System.out.println("Welcome Icici Bank Customers");
        return "IciciBank  Site opened";
    }

    public void run() {
        System.out.println("My thread is in running state.");
        openSite();
    }
}
