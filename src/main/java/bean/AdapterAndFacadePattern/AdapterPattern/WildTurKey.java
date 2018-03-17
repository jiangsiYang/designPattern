package main.java.bean.AdapterAndFacadePattern.AdapterPattern;

/**
 * Created by Yang on 2018/3/9.
 */
public class WildTurKey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
