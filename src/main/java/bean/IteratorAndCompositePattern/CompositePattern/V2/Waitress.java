package main.java.bean.IteratorAndCompositePattern.CompositePattern.V2;


import java.util.Iterator;

/**
 * Created by Yang on 2018/1/15.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
        ;
    }

    //明确告诉女招待哪些项目是素食
    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                //如果是组件是菜单的话会抛出UnsupportedOperationException异常，需要捕捉,然后继续遍历
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {

            }

        }
    }
}
