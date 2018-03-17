package main.java.bean.IteratorAndCompositePattern.IteratorPattern;

/**
 * Created by Yang on 2017/12/28.
 * 针对接口编程，不针对实现编程
 * 餐厅、早餐饼 都有一个共同的接口createIterator，且在IteratorWaitress（女侍者）只需要调用createIterator获得迭代器
 * 用Menu定义的对象只能调用createIterator方法
 */
public interface Menu {
    public java.util.Iterator createIterator();
}
