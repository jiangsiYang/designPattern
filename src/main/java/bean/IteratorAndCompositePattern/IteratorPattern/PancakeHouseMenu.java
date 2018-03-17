package main.java.bean.IteratorAndCompositePattern.IteratorPattern;

import java.util.*;
import java.util.Iterator;

/**
 * Created by Yang on 2017/12/27.
 * ArrayList 结构
 */
public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList();
        addItem("烤鸡翅", "非常好吃的烤鸡翅", false, 9.9);
        addItem("燕麦粥", "美味营养", false, 4);
        addItem("健康沙拉", "注重健康", true, 6.6);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    /**
     *
     */
    public Iterator createIterator() {
//        return new PancakeMenuIterator(menuItems);    不再使用自己写的迭代器 而是用java.util的迭代器
        return  menuItems.iterator();
    }
}
