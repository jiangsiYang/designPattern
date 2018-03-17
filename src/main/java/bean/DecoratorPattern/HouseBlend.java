package main.java.bean.DecoratorPattern;

/**
 * Created by Yang on 2018/2/26.
 * 混合咖啡
 */
public class HouseBlend extends Beverage {

    public HouseBlend(int size) {
        super(size);
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        if (getSize() == sizeEnum.TALL.getCode()) {
            return 0.79;
        } else if (getSize() == sizeEnum.GRANDE.getCode()) {
            return 0.89;
        } else if (getSize() == sizeEnum.VENTI.getCode()) {
            return 0.99;
        } else {
            return 0;
        }
    }
}
