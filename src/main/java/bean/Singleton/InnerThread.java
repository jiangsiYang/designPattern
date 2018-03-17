package main.java.bean.Singleton;

/**
 * Created by Yang on 2018/3/8.
 */
public class InnerThread implements Runnable {
    SingletonStaticInner singletonStaticInner;
    @Override
    public void run() {
        singletonStaticInner = SingletonStaticInner.getInstance();
        System.out.println(singletonStaticInner.hashCode());
    }
}
