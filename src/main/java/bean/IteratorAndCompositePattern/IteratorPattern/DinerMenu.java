package main.java.bean.IteratorAndCompositePattern.IteratorPattern;

import java.util.Iterator;

/**
 * Created by Yang on 2017/12/27.
 * 数组 结构
 */
public class DinerMenu implements Menu {
    MenuItem[] menuItems;
    static final int MAX_ITEMS = 6;
    int numberOfitems = 0;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
        addItem("鸡腿蛋饭", "营养便宜", false, 11);
        addItem("手撕鸡排骨", "好吃美味", false, 15);
        addItem("鹅腿饭", "优雅正", false, 25);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfitems >= MAX_ITEMS) {
            System.out.println("Sorry,menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfitems] = menuItem;
            numberOfitems++;
        }
    }

    /**
     * 用迭代器代替 数组 去进行同一接口的遍历
     * @return
     */
    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }

    /**
     * 在不够优雅的第一代女招待Waitress里还需要用到
     * 但在改进后的第二代IteratorWaitress 里已经不需要了，而且这个方法会暴露内部的实现
     * @return
     */
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
