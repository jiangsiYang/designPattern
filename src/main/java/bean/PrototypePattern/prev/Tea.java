package main.java.bean.PrototypePattern.prev;

/**
 * Created by Yang on 2018/3/13.
 * 最开始的咖啡和茶类
 */
public class Tea {
    void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void steepTeaBag(){
        System.out.println("steeping the tea");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    public void addLemon(){
        System.out.println("Adding lemon");
    }
}
