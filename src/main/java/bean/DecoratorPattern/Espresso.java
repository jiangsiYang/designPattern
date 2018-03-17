package main.java.bean.DecoratorPattern;

/**
 * Created by Yang on 2018/2/26.
 * 意式浓咖啡
 */
public class Espresso extends Beverage {

    public Espresso(int size) {
        super(size);
        description = "Espresso";
    }

    @Override
    public double cost() {
        if (getSize() == sizeEnum.TALL.getCode()) {
            return 1.89;
        } else if (getSize() == sizeEnum.GRANDE.getCode()) {
            return 1.99;
        } else if (getSize() == sizeEnum.VENTI.getCode()) {
            return 2.09;
        } else {
            return 0;
        }
    }
}
