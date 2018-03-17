package main.java.bean.ObserverPattern;

/**
 * Created by Yang on 2017/11/1.
 * 观察者模式的 主题（可观察者） 接口
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
