package main.java.bean.IteratorAndCompositePattern.CompositePattern;

/**
 * Created by Yang on 2018/1/15.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    public void printMenu(){
        allMenus.print();;
    }
}
