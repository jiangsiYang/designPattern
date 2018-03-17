package main.java.bean.HashCode;

import java.util.HashMap;

/**
 * Created by Yang on 2017/12/11.
 */
public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        People people = (People) obj;
        return this.name.equals(people.name) && this.age == people.age;
    }

    @Override
    public int hashCode(){
        //重写equals 最好也重写hashCode
        return this.name.hashCode()*37 +age;
    }

    public static void main(String[] args) {

        People p1 = new People("Jack", 12);
        System.out.println(p1.hashCode());

        HashMap<People, Integer> hashMap = new HashMap<People, Integer>();
        hashMap.put(p1, 1);

        System.out.println(hashMap.get(new People("Jack", 12)));

        HashMap<Integer, Integer> hashMap2 = new HashMap<>();
        hashMap2.put(1, 1);
        System.out.println(hashMap2.get(1));
    }
}
