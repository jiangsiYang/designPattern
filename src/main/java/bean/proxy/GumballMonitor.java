package main.java.bean.proxy;

/**
 * Created by Yang on 2018/2/7.
 * 糖果监视器
 */
public class GumballMonitor {
    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("Gumball Machine:" + gumballMachine.getLocation());
        System.out.println("Gumball inventory:" + gumballMachine.getCount() + " gumballs    ");
        System.out.println("Gumball state:" + gumballMachine.getState());
    }
}
