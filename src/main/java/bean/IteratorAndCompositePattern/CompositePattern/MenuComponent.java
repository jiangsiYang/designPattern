package main.java.bean.IteratorAndCompositePattern.CompositePattern;

/**
 * Created by Yang on 2018/1/15.
 * 所有的组件都必须实现MenuComponent接口；然而，叶节点和组合节点的角色不同，所以有些方法可能并不适合某种节点。面对这种情况，
 * 有时候，你最好是抛出运行时异常。
 * <p>
 * 组合模式以单一责任设计原则换取透明性。什么是透明性？通过让组件的接口同时包含一些管理子节点和叶节点的操作，客户就可以将组合和叶节点一视同仁。
 * 也就是说,一个元素究竟是组合还是叶节点，对客户是透明的（这里的透明是指对客户看不见，不等于黑盒白盒里的白盒透明性）
 * <p>
 * Think about,1、为什么叶节点用的方法不直接在叶节点定义，还要在MenuComponent接口定义好，然后在叶节点覆盖？
 * 2、为什么是抽象类，为什么不是接口？
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
}
