package com.syns.deadlock;

public class HdfcBank  implements Runnable{


    public String openSite() {
        System.out.println("Welcome to Hdfc Bank Customer");
        return "Hdfc Bank Site  Opened";
    }

    public void run() {
        System.out.println("My thread is in running state.");
        openSite();
    }
}
