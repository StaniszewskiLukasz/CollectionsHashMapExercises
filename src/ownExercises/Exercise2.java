package ownExercises;

import java.util.HashMap;

//Write a Java program to count the number of key-value (size) mappings in a map.
public class Exercise2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"ValueOne");
        map.put(2,"ValueTwo");
        map.put(3,"ValueThree");
        map.put(4,"ValueFour");
        System.out.println(map.size());
    }
}
