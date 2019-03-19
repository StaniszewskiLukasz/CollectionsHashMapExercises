package ownExercises;

import java.util.HashMap;

//Write a Java program to test if a map contains a mapping for the specified key.
public class Exercise7 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"ValueOne");
        map.put(2,"ValueTwo");
        map.put(3,"ValueThree");
        map.put(4,"ValueFour");
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Something"));
    }
}
