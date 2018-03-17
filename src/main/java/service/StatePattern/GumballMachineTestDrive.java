package main.java.service.StatePattern;

import main.java.bean.StatusPattern.GumballMachine;

/**
 * Created by Yang on 2018/1/16.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        gumballMachine.getCount();

    }
}
