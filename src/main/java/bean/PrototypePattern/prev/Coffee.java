package main.java.bean.PrototypePattern.prev;

/**
 * Created by Yang on 2018/3/13.
 * 最开始的咖啡和茶类
 */
public class Coffee {
    void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void brewCoffeeGrinds(){
        System.out.println("Dripping Coffee through filter");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    public void addSugarAndMilk(){
        System.out.println("Adding sugar and milk");
    }
}
