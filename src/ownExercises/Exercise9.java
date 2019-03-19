package ownExercises;

import java.util.HashMap;

//Write a Java program to get the value of a specified key in a map
public class Exercise9 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"ValueOne");
        map.put(2,"ValueTwo");
        map.put(3,"ValueThree");
        map.put(4,"ValueFour");
        System.out.println(map.get(3));
        System.out.println(map.get(5));
        //można też przypisać do zmiennej
        String valueFromKeyTwo = map.get(2);
        System.out.println(valueFromKeyTwo);
    }
}
