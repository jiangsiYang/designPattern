package main.java.bean.Singleton;

/**
 * Created by Yang on 2017/11/28.
 * 单件模式(静态内部类实现 特点：线程安全/懒加载/不能防止反射构建)
 * INSTANCE对象初始化的时机并不是在单例类SingletonStaticInner被加载的时候，而是在调用getInstance方法，使得静态内部类LazyHolder被加载的时候。因此这种实现方式是利用classloader的加载机制来实现懒加载，并保证构建单例的线程安全。
 */
public class SingletonStaticInner {
    private static class LazyHolder {    //只有内部类才能是私有/静态的
        private static final SingletonStaticInner uniqueInstance = new SingletonStaticInner();
    }

    private SingletonStaticInner() {

    }

    public static SingletonStaticInner getInstance() {
        return LazyHolder.uniqueInstance;
    }
}
