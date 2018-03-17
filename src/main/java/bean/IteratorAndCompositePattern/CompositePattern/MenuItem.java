package main.java.bean.IteratorAndCompositePattern.CompositePattern;

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

    public void print(){
        System.out.print("  "+getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        System.out.print(",  "+getPrice());
        System.out.println("  -- "+getDescription());
    }
}
