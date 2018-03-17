package main.java.bean.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Yang on 2018/2/7.
 * 对于远程RMI来说，Retemo接口具有特别的意义（“记号”接口），尽管不具有方法
 * 本类是简单示例
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;    //远程接口可能会面临网络/IO的问题，所以必须声明远程异常
}
