package main.java.service.PrototypePattern;

import main.java.bean.PrototypePattern.SortDuck;

import java.util.Arrays;

/**
 * Created by Yang on 2018/3/14.
 */
public class DuckSortTestDrive {
    public static void main(String[] args) {
        SortDuck[] ducks = {new SortDuck("A", 8), new SortDuck("B", 12), new SortDuck("C", 5), new SortDuck("D", 44)};
        DuckSortTestDrive.display(ducks);

        Arrays.sort(ducks);
        System.out.println("\nAfter sorting:");
        DuckSortTestDrive.display(ducks);


    }

    public static void display(SortDuck[] ducks) {
        for (SortDuck duck : ducks) {
            System.out.println(duck.toString());
        }
    }
}
