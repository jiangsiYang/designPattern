package main.java.bean.DecoratorPattern;

/**
 * Created by Yang on 2018/2/26.
 * 饮料超类
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public Beverage() {
    }

    public Beverage(int size) {
        this.size = size;
    }

    public abstract double cost();  //计算价钱必须在子类中实现

    int size = 1;   //饮料大小  默认小杯

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public enum sizeEnum {
        TALL(1),    //小杯
        GRANDE(2),  //中杯
        VENTI(3);   //大杯

        sizeEnum(Integer code) {
            this.code = code;
        }

        private Integer code;

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }
    }

}
