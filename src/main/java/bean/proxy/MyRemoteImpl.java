package main.java.bean.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Yang on 2018/2/7.
 * UnicastRemoteObject超类可以让你得到某些“远程的”功能
 * 本类是简单示例
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    @Override
    public String sayHello() throws RemoteException {
        return "hey,how are you";
    }

    /**
     * UnicastRemoteObject类的构造器会抛出RemoteException，
     * 当类被实例化的时候，超类的构造器总会被调用
     *
     * @throws RemoteException
     */
    public MyRemoteImpl() throws RemoteException {
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();  //先产生远程对象
            Naming.rebind("RemoteHello", service);  //再使用Naming.rebind()绑定到rmiregistry，RemoteHello是注册的名称，客户将在RMJregistry中寻找它
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
