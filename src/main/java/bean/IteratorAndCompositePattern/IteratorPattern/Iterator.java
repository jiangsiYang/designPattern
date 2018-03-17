package main.java.bean.IteratorAndCompositePattern.IteratorPattern;

/**
 * Created by Yang on 2017/12/27.
 */
public interface Iterator {
    boolean hasNext();  //判断是否有更多元素
    Object next();  //返回下一个元素
}
