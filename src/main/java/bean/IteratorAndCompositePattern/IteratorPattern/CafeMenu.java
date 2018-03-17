package main.java.bean.IteratorAndCompositePattern.IteratorPattern;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by Yang on 2017/12/27.
 * 数组 结构
 */
public class CafeMenu implements Menu {
    Hashtable menuItems;

    public CafeMenu() {
        this.menuItems = new Hashtable();
        addItem("猫屎咖啡", "高雅美味", false, 55);
        addItem("雀巢咖啡", "便捷充实", false, 8);
        addItem("兰黛咖啡", "不一样的诱惑", false, 32);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(),menuItem);
    }

    /**
     * 不是取得整个hashTable的迭代器，而是取得值这一部分的迭代器
     * @return
     */
    public Iterator createIterator(){
        return menuItems.values().iterator();
    }
}
