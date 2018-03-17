package main.java.bean.IteratorAndCompositePattern.IteratorPattern;

import java.util.ArrayList;

/**
 * Created by Yang on 2017/12/27.
 * 女招待，打印出菜单
 * 这是没有任何优雅设计的原始版本 有几种集合类型 就需要几种不同的遍历循环
 */
public class Waitress {
    //用ArrayList格式的 餐单
    PancakeHouseMenu pancakeHouseMenu;
    //用数组形式的 餐单
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
        MenuItem[] dinerItems = dinerMenu.getMenuItems();

        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = breakfastItems.get(i);
            System.out.println(menuItem.getName() + "  " + menuItem.getDesciption() + "   " + menuItem.getPrice());
        }

        for (int i = 0; i < dinerItems.length; i++) {
            MenuItem menuItem = dinerItems[i];
            if (menuItem != null) {
                System.out.println(menuItem.getName() + "  " + menuItem.getDesciption() + "   " + menuItem.getPrice());
            }
        }
    }
}
