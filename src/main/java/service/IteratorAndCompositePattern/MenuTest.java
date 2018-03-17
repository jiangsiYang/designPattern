package main.java.service.IteratorAndCompositePattern;

import main.java.bean.IteratorAndCompositePattern.IteratorPattern.*;

/**
 * Created by Yang on 2017/12/27.
 * 这是统一利用Iterator进行遍历的，只需要维护一个版本即可
 */
public class MenuTest {

    public static void main(String[] args) {
        //用ArrayList格式的 餐单
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        //用数组形式的 餐单
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();
//        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
//        waitress.printMenu();
        IteratorWaitress iteratorWaitress = new IteratorWaitress(pancakeHouseMenu,dinerMenu,cafeMenu);
        iteratorWaitress.printMenu();
    }

}
