package main.java.service.PrototypePattern;

import main.java.bean.PrototypePattern.CaffeineBeverage;
import main.java.bean.PrototypePattern.CoffeeWithHooK;

/**
 * Created by Yang on 2018/3/13.
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        CaffeineBeverage coffeeWithHooK = new CoffeeWithHooK();
        System.out.println("\nMaking tea...");
        coffeeWithHooK.prepareRecipe();
    }
}
