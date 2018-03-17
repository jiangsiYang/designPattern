package main.java.bean.AdapterAndFacadePattern.AdapterPattern;

/**
 * Created by Yang on 2018/3/9.
 * 我想拿火鸡来冒充鸭子，需要适配器帮我把火鸡转换为鸭子
 * 相要转换为什么 就实现对应的接口
 */
public class TurkeyAdapter implements Duck {
    Turkey wildTurKey;

    public TurkeyAdapter(Turkey wildTurKey) {
        this.wildTurKey = wildTurKey;
    }

    @Override
    public void quack() {
        this.wildTurKey.gobble();
    }

    /**
     * 鸭子能飞远，火鸡飞很近，不顾一切让火鸡模拟鸭子，所以鸭子飞一次，火鸡就要飞5次 = = ~
     */
    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            this.wildTurKey.fly();
        }
    }
}
