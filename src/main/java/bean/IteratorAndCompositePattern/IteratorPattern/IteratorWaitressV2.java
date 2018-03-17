package main.java.bean.IteratorAndCompositePattern.IteratorPattern;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Yang on 2017/12/27.
 * 上一个版本中调用了printMenu()三次，有点丑，而且一旦有新菜单加入，就必须打开女招待实现并加入更多的代码，违反了“开放--关闭原则”
 */
public class IteratorWaitressV2 {

    List<Menu> menuArrayList;

    public IteratorWaitressV2(List<Menu> menuArrayList) {
        this.menuArrayList = menuArrayList;
    }

    public void printMenu() {
        Iterator menuIterator = menuArrayList.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + "  " + menuItem.getDesciption() + "   " + menuItem.getPrice());
        }
    }

}
