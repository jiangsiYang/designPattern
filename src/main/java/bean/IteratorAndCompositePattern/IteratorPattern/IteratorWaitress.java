package main.java.bean.IteratorAndCompositePattern.IteratorPattern;

import java.util.Iterator;

/**
 * Created by Yang on 2017/12/27.
 * 女招待，打印出菜单
 * 这是统一利用Iterator进行遍历的，只需要维护一个版本即可
 */
public class IteratorWaitress {

    //用ArrayList格式的 餐单
    Menu pancakeHouseMenu;
    //用数组形式的 餐单
    Menu dinerMenu;
    //hashTable
    Menu cafeMenu;

    public IteratorWaitress(Menu pancakeHouseMenu, Menu dinerMenu,Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        printMenu(pancakeIterator);
        printMenu(dinerIterator);
        printMenu(cafeIterator);
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + "  " + menuItem.getDesciption() + "   " + menuItem.getPrice());
        }
    }

}
