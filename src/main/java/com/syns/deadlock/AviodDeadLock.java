package com.syns.deadlock;

public class AviodDeadLock
{



        public void method1() {
            synchronized (HdfcBank.class ) {
                System.out.println("Aquired lock on HDFC.class object");
                synchronized (IciciBank.class) {
                    System.out.println("Aquired lock on Icici.class object");
                }
            }
        }

        public void method2() {
            synchronized (IciciBank.class) {
                System.out.println("Aquired lock on IciciBank.class object");

                synchronized (HdfcBank.class) {
                    System.out.println("Aquired lock on HdfcBank.class object");
                }
            }
        }

}
