package main.java.service.ProxyPattern.RemoteProxy;

import main.java.bean.proxy.GumballMachine;
import main.java.bean.proxy.GumballMachineRemote;
import main.java.bean.proxy.GumballMonitor;
import main.java.bean.proxy.GumballRMIMonitor;

import java.rmi.Naming;

/**
 * Created by Yang on 2018/2/7.
 * 监视器，监听各糖果机（通过远程代理）
 */
public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {"rmi://kaka/gumballmachine"};
        GumballRMIMonitor[] monitor = new GumballRMIMonitor[location.length];
        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote gumballMachineRemote = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballRMIMonitor(gumballMachineRemote);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}
