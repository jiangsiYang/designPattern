package main.java.service.ProxyPattern.RemoteProxy;


import main.java.bean.proxy.GumballMachine;
import main.java.bean.proxy.GumballMonitor;

import java.rmi.Naming;
import java.util.Scanner;

/**
 * Created by Yang on 2018/1/16.
 * 远程代理 获取糖果机的状态
 */
public class GumballMachineRMITestDrive {
    public static void main(String[] args) {
        int count = 0;
        String name = null;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("GumballMachine <name>");
            name = scanner.nextLine();
        } while (name == null || name.length() == 0);
        do {
            System.out.println("GumballMachine <inventory>");
            try {
                count = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
            }
        } while (count == 0);
        try {
            //擦 一直报错 java.rmi.ConnectException: Connection refused to host: 127.0.0.1; nested exception is:
//            java.net.ConnectException: Connection refused: connect
//            at sun.rmi.transport.tcp.TCPEndpoint.newSocket(TCPEndpoint.java:619)
//            at sun.rmi.transport.tcp.TCPChannel.createConnection(TCPChannel.java:216)
//            at sun.rmi.transport.tcp.TCPChannel.newConnection(TCPChannel.java:202)
//            at sun.rmi.server.UnicastRef.newCall(UnicastRef.java:342)
//            at sun.rmi.registry.RegistryImpl_Stub.rebind(Unknown Source)
//            at java.rmi.Naming.rebind(Naming.java:177)
            GumballMachine gumballMachine = new GumballMachine(name, count);
            Naming.rebind("rmi://127.0.0.1:8444/" + name + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
