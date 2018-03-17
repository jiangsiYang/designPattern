package main.java.service.IteratorAndCompositePattern;

import main.java.bean.IteratorAndCompositePattern.CompositePattern.V2.Menu;
import main.java.bean.IteratorAndCompositePattern.CompositePattern.V2.MenuComponent;
import main.java.bean.IteratorAndCompositePattern.CompositePattern.V2.MenuItem;
import main.java.bean.IteratorAndCompositePattern.CompositePattern.V2.Waitress;

/**
 * Created by Yang on 2017/12/27.
 * 加入了组合模式
 * 外部实现迭代（即女招待）
 */
public class MenuTestV4 {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Diner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course");

        //最顶层的菜单
        MenuComponent allMenus = new Menu("ALL MENUS","All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        //加入菜单项
        dinerMenu.add(new MenuItem("Pasta","最好吃的",true,3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie","苹果派，加了很多糖",true,1.59));

        pancakeHouseMenu.add(new MenuItem("烤鸡翅", "非常好吃的烤鸡翅", false, 9.9));
        pancakeHouseMenu.add(new MenuItem("燕麦粥", "美味营养", false, 4));
        pancakeHouseMenu.add(new MenuItem("健康沙拉", "注重健康", true, 6.6));

        cafeMenu.add(new MenuItem("猫屎咖啡", "高雅美味", false, 55));
        cafeMenu.add(new MenuItem("雀巢咖啡", "便捷充实", false, 8));
        cafeMenu.add(new MenuItem("兰黛咖啡", "不一样的诱惑", false, 32));

        Waitress waitress = new Waitress(allMenus);
        waitress.printVegetarianMenu();
    }
}
