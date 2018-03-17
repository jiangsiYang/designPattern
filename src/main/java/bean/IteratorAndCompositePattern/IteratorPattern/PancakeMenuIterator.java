package main.java.bean.IteratorAndCompositePattern.IteratorPattern;

import java.util.ArrayList;

/**
 * Created by Yang on 2017/12/27.
 */
public class PancakeMenuIterator implements Iterator {

    //    DinerMenu dinerMenu;    //如果是这样的话，会违反一个原则：只和最亲密朋友交谈，所以直接传进来 菜单集合
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
