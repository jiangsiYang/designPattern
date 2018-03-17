package main.java.bean.IteratorAndCompositePattern.CompositePattern.V2;


import main.java.bean.IteratorAndCompositePattern.CompositePattern.V2.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Yang on 2018/1/15.
 */
public class Menu extends MenuComponent {
    List<MenuComponent> menuComponents = new ArrayList();  //菜单可以有任意数目的孩子，这些孩子都必须属于MenuComponent类型
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("------------------");

        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }

    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }

}
