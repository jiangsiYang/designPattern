package main.java.bean.PrototypePattern;


/**
 * Created by Yang on 2018/3/14.
 * 实现Comparable接口的compareTo方法，完成数组类的一个模板方法（排序）
 * 相当于compareTo就是排序模板方法的一个步骤，且指定由子类实现
 */
public class SortDuck implements Comparable {
    String name;
    int weight;

    public SortDuck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " weights is" + weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Object o) {
        SortDuck otherDuck = (SortDuck) o;
        if (this.weight < otherDuck.getWeight()) {
            return -1;
        } else if (this.weight == otherDuck.getWeight()) {
            return 0;
        } else {
            return 1;
        }
    }
}
