package main.java.bean.PrototypePattern;

/**
 * Created by Yang on 2018/3/13.
 * 咖啡因饮料超类
 */
public abstract class CaffeineBeverage {
    //用一个prepareRecipe()方法来处理茶和咖啡，声明为final，因为不希望子类覆盖掉这个方法
    //这就是模板方法,在本例中算法是用来制作咖啡因饮料的，算法内的每一个步骤都被一个方法代表了
    public final void prepareRecipe() {
        boilWater();    //boilWater和pourInCup是咖啡和茶都是一样的操作 直接在超类中写好
        brew();     //brew和addCondiments 咖啡和茶的做法是不一样的，所以这两个方法必须声明为抽象，具体怎么做让子类去操心
        pourInCup();
        if (customerWantsCondiments()) {    //钩子的一种实现
            addCondiments();
        }

        hook(); //钩子
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public abstract void brew();

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public abstract void addCondiments();

    /**
     * 这是一个钩子，即默认不做事的方法，子类可以视情况决定要不要覆盖他们
     */
    void hook() {

    }

    /**
     * 钩子的一种用处,控制了咖啡因饮料是否执行某部分算法
     * 如果顾客“想要”调料，我们才调用addCondiments
     */
    public boolean customerWantsCondiments() {
        return true;
    }

}
