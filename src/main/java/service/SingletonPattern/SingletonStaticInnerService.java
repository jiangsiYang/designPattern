package main.java.service.SingletonPattern;

import main.java.bean.Singleton.InnerThread;

/**
 * Created by Yang on 2018/3/8.
 */
public class SingletonStaticInnerService {
    public static void main(String[] args) {
        InnerThread innerThread1 = new InnerThread();
        InnerThread innerThread2 = new InnerThread();
        InnerThread innerThread3 = new InnerThread();

        innerThread1.run();
        innerThread2.run();
        innerThread3.run();

    }
}
