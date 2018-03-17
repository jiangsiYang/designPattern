package main.java.bean.ObserverPattern;

import java.util.Observable;

/**
 * Created by Yang on 2017/11/1.
 * 具体的 主题（可观察者）实现类
 * 通过系统内置的可观察者接口,这里实现的是推的模式
 */
public class WeatherData3 extends Observable {
//    private ArrayList<Observer> observerList;   //构造器不再需要为了记住观察者们而建立数据结构了

    private float temperature;  //温度
    private float humidity;     //湿度
    private float pressure;     //气压

    public WeatherData3() {
//        this.observerList = new ArrayList();    //构造器不再需要为了记住观察者们而建立数据结构了
    }

    //获得最新气候数据 后 通知 观察者
    public void measurementsChange() {
        //setChanged()方法用来标记状态已经改变的事实，好让notifyObservers()知道当它被调用时应该更新观察者。
        //如果调用notifyObservers()前没有先调用setChanged()，观察者就不会被“通知”(可查看源码)
        setChanged();
        this.notifyObservers(this);     //推的方式，推的对象是本身
    }

    //获得最新的 气候数据
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChange();
    }


    //当采用拉的方式时，这些get方法会用到
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
