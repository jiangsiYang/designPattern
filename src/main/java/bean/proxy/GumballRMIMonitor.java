package main.java.bean.proxy;

import java.rmi.RemoteException;

/**
 * Created by Yang on 2018/2/7.
 * 糖果监视器
 * 改写以符合代理模式
 */
public class GumballRMIMonitor {
    GumballMachineRemote gumballMachine;

    public GumballRMIMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine:" + gumballMachine.getLocation());
            System.out.println("Gumball inventory:" + gumballMachine.getCount() + " gumballs    ");
            System.out.println("Gumball state:" + gumballMachine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
