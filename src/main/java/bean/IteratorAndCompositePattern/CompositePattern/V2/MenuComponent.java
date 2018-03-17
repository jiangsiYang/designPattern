package main.java.bean.IteratorAndCompositePattern.CompositePattern.V2;

import java.util.Iterator;

/**
 * Created by Yang on 2018/1/15.
 * 不同于V1版本的内部print()方法实现，这里可以让外部（女招待）进行迭代
 * 组合迭代器，每个组件加上createIterator()方法，可以让女招待使用迭代器遍历整个组合
 */
public class MenuComponent {
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }
}
