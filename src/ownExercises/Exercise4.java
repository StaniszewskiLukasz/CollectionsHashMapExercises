package ownExercises;

import java.util.HashMap;
import java.util.Map;

//Write a Java program to remove all of the mappings from a map
public class Exercise4 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"ValueOne");
        map.put(2,"ValueTwo");
        map.put(3,"ValueThree");
        map.put(4,"ValueFour");
        map.clear();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
