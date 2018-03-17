package main.java.bean.IteratorAndCompositePattern.IteratorPattern;

/**
 * Created by Yang on 2017/12/27.
 * 菜单项,不论是卖早餐的还是做西餐的，一种食品品类就是一个MenuItem
 */
public class MenuItem {
    String name;
    String desciption;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String desciption, boolean vegetarian, double price) {
        this.name = name;
        this.desciption = desciption;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
