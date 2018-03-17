package main.java.service.ProxyPattern.RemoteProxy;


import main.java.bean.proxy.GumballMachine;
import main.java.bean.proxy.GumballMonitor;

import java.util.Scanner;

/**
 * Created by Yang on 2018/1/16.
 * 非远程代理的 获取糖果机的状态
 */
public class GumballMachineTestDrive {
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
//        if (args.length < 2) {
//            System.out.println("GumballMachine <name> <inventory>");
//            System.exit(1);
//        }
//        count = Integer.parseInt(args[1]);
//        GumballMachine gumballMachine = new GumballMachine(args[0], count);   没有控制台输入啊
        try {
            GumballMachine gumballMachine = new GumballMachine(name, count);
            GumballMonitor monitor = new GumballMonitor(gumballMachine);
            monitor.report();
        }catch (Exception e){

        }
    }
}
