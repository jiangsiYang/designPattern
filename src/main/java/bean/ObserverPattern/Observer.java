package main.java.bean.ObserverPattern;

/**
 * Created by Yang on 2017/11/1.
 * 观察者接口 当主题通知观察者变化时 调用update（）方法
 * 需要成为观察者的实现该接口
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
