package main.java.bean.Singleton;

/**
 * Created by Yang on 2017/11/28.
 * 单件模式(双重锁检测实现 特点：线程安全/懒加载/不能防止反射构建)
 * 私有的构造器、一个静态方法提供给外部调用实例、一个静态变量（实例化的变量）
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;    //该类变量持有唯一的单件实例  volatile的作用是当多个线程在下面同步锁创建实例那里阻塞的时候，当最先进入的线程实例化  uniqueInstance的时候，uniqueInstance的状态改变能通知到其它阻塞的线程，当放开同步锁，下一个线程进入时，再二次判断uniqueInstance == null的时候就知道uniqueInstance已经非null了；说法二：volatile修饰符阻止了变量访问前后的指令重排，保证了指令执行顺序

//    private static Singleton uniqueInstance1 = new Singleton();    //如果是类加载的时候就实例化好，就是饥汉式，也就不存在多线程创建多个实例的问题了

    private Singleton() {
        //私有构造器
    }

    public static Singleton getInstance() {
        //提供给外部的全局访问点
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    /**
     * 该单例类如果实现了Serializable接口，则必须添加readResolve()方法,如果既想要做到可序列化，又想要反序列化为同一对象，则必须实现readResolve方法。
     * 反序列化时内存Hook这段代码
     * @return
     */
    private Object readResolve() {
        return uniqueInstance;
    }
}
