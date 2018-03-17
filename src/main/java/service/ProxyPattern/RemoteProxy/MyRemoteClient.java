package main.java.service.ProxyPattern.RemoteProxy;

import main.java.bean.proxy.MyRemote;

import java.rmi.Naming;

/**
 * Created by Yang on 2018/2/7.
 * 远程代理
 * 执行步骤:
 * 一：制作远程接口
 * 1、扩展java.rmi.Remote
 * 2、声明所有方法都会抛出RemoteException
 * 3、确定变量和返回值是属于原语primitive类型或者可序列话类型
 * 二：制作远程实现
 * 1、实现远程接口
 * 2、扩展UnicastRemoteObject
 * 3、设计一个不带变量的构造器，并声明RemoteException
 * 4、使用RMI Registry注册此服务
 * 三：产生Stub和Skeleton
 * 在远程实现类上执行rmic
 * 四：执行remiregistry
 * 开启一个终端，启动remiregistry，最简单的做法是从你的“classes”目录启动，本机可在D:\data\soft\Java\jdk1.8.0_91\bin\rmiregistry.exe点击启动
 * 五：启动服务
 * 可以从远程实现类中的main()方法启动，如本类
 *
 */
public class MyRemoteClient {

    public static void main(String[] args) {
        MyRemoteClient myRemoteClient = new MyRemoteClient();
        myRemoteClient.go();
    }

    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            System.out.println(service.sayHello());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
