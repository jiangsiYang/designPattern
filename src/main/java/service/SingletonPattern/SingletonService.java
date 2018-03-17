package main.java.service.SingletonPattern;

import main.java.bean.ObserverPattern.CurrentConditionsDisplay;
import main.java.bean.ObserverPattern.ForecastDisplay;
import main.java.bean.ObserverPattern.StatisticsDisplay;
import main.java.bean.ObserverPattern.WeatherData;
import main.java.bean.Singleton.Singleton;
import main.java.bean.Singleton.SingletonEnum;
import main.java.bean.Singleton.SingletonStaticInner;

import java.lang.reflect.Constructor;

/**
 * Created by Yang on 2017/11/1.
 * 获取单件模式的唯一实例
 */
public class SingletonService {
    public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.getInstance();     //双重锁检测实现

        SingletonStaticInner singletonStaticInner = SingletonStaticInner.getInstance();     //静态内部类实现

        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;   //枚举实现

        //利用反射构建打破单例模式的约束
        try {
            Constructor con = Singleton.class.getDeclaredConstructor();
            con.setAccessible(true);    //设置为可访问
            Singleton singleton1 = (Singleton) con.newInstance();
            Singleton singleton2 = (Singleton) con.newInstance();
            //验证是否是不同对象
            System.out.println(singleton1.equals(singleton2));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        //利用反射看看能不能打破枚举实现的单例模式
        Constructor enumCon = SingletonEnum.class.getDeclaredConstructor();
        enumCon.setAccessible(true);
        SingletonEnum singletonEnum1 = (SingletonEnum)enumCon.newInstance();
        SingletonEnum singletonEnum2 = (SingletonEnum)enumCon.newInstance();
        System.out.println(singletonEnum1.equals(singletonEnum2));
    }
}
