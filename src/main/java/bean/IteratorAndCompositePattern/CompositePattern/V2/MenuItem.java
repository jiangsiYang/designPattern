package main.java.bean.IteratorAndCompositePattern.CompositePattern.V2;

import main.java.bean.IteratorAndCompositePattern.CompositePattern.V2.MenuComponent;

import java.util.Iterator;

/**
 * Created by Yang on 2018/1/15.
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.print(",  " + getPrice());
        System.out.println("  -- " + getDescription());
    }

    //选择一：返回null。如果这么做，客户代码就需要条件语句来判断返回值是否为null
    //选择二：返回一个迭代器，而这个迭代器的hasNext()永远返回false
    public Iterator createIterator() {
        return new NullIterator();
    }
}
