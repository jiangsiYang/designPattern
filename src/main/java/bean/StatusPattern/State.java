package main.java.bean.StatusPattern;

/**
 * Created by Yang on 2018/1/16.
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
