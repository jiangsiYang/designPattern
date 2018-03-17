package main.java.service.IteratorAndCompositePattern;

import main.java.bean.IteratorAndCompositePattern.IteratorPattern.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yang on 2017/12/27.
 * 当有新菜单加入，只需要修改这里即可，不需要再去修改女招待了，而且也不需要在女招待里多次调用printMenu
 */
public class MenuTestV2 {

    public static void main(String[] args) {
        //用ArrayList格式的 餐单
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        //用数组形式的 餐单
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();
        List<Menu> list = new ArrayList<>();
        list.add(pancakeHouseMenu);
        list.add(dinerMenu);
        list.add(cafeMenu);


        IteratorWaitressV2 iteratorWaitress = new IteratorWaitressV2(list);
        iteratorWaitress.printMenu();
    }

}
