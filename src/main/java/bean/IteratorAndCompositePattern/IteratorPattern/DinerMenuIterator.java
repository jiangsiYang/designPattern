package main.java.bean.IteratorAndCompositePattern.IteratorPattern;

import java.util.Iterator;

/**
 * Created by Yang on 2017/12/27.
 * 因为数组不能用系统的迭代器，所以需要自己创建一个 迭代器 实现 系统迭代器接口
 */
public class DinerMenuIterator implements Iterator {

    //    DinerMenu dinerMenu;    //如果是这样的话，会违反一个原则：只和最亲密朋友交谈，所以直接传进来 菜单集合
    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

//    @Override
//    public void remove() {
//
//    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
