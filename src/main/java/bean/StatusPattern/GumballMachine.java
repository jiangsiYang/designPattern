package main.java.bean.StatusPattern;

import java.util.Stack;

/**
 * Created by Yang on 2018/1/16.
 */
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = soldOutState;     //默认是售罄状态
    int count = 0;

    //糖果机初始糖果数量由外部传进来
    public GumballMachine(int gumballCount) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = gumballCount;
        if (gumballCount > 0) {
            //如果糖果机超过0颗糖果，状态置为noQuarterState
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }


    public void turnCrank() {
        state.turnCrank();
        state.dispense();   //这是个内部动作 用户不可以直接要求机器发送糖果 所以是在turnCrank()方法后调用的
    }
//    public void dispense() {
//        state.dispense();
//    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0) {
            count = count - 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
