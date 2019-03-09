package com.syns.deadlock;

public class MultiThreads {



    public static void main(String args[]) {

        System.out.println("Main thread Started......");

            AviodDeadLock dl=new AviodDeadLock();
            HdfcBank bank1=new HdfcBank();
            IciciBank bank2=new IciciBank();
            MultiThreads main=new MultiThreads();

                Thread t1=new Thread(bank1);
                t1.start();


                Thread t2=new Thread(bank1);
                t2.start();

                Thread t3=new Thread(bank1);
                t3.start();


                Thread t4=new Thread(bank2);
                t4.start();

                dl.method1();
                dl.method2();



        }
    }

