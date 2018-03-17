package main.java.bean.proxy;

import java.io.Serializable;

/**
 * Created by Yang on 2018/1/16..
 * 远程代理需要返回State对象，所以必须是可序列化的
 */
public interface State extends Serializable {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
