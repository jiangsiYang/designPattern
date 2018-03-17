package main.java.bean.IteratorAndCompositePattern.CompositePattern.V2;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by Yang on 2018/1/15.
 * 遍历组件内的菜单项，并且确保所有的子菜单（以及子子菜单。。。）都被包括进来
 */
public class CompositeIterator implements Iterator {
    Stack stack = new Stack();

    //将要遍历的顶层组合的迭代器传入
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            //从堆栈的顶层中取出一个迭代器，看看是否还有下一个元素。如果它没有元素，我们将它弹出堆栈，然后递归地调用hasNext()
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                //如果元素是一个菜单，我们有了另一个需要被包含进遍历中的组合，所以我们将它丢进堆栈中
                stack.push(component.createIterator());
            }
            //不管是不是菜单，我们都要返回该组件
            return component;
        }
        return null;
    }
}
