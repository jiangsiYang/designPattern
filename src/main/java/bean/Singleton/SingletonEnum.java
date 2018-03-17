package main.java.bean.Singleton;

/**
 * Created by Yang on 2017/12/9.
 * 单件模式(枚举实现 特点：线程安全/非懒加载/能防止反射构建)
 * 使用枚举实现的单例模式，不但可以防止利用反射强行构建单例对象，而且可以在枚举类对象被反序列化的时候，保证反序列的返回结果是同一对象
 * 对于其他方式实现的单例模式，如果既想要做到可序列化，又想要反序列化为同一对象，则必须实现readResolve方法
 */
public enum  SingletonEnum {
    INSTANCE,INSTANCE2;   //相当于 public static final SingletonEnum XXX,XXX2;
}
