package ownExercises;

import java.util.HashMap;
import java.util.Map;

//Write a Java program to copy all of the mappings from the specified map to another map
public class Exercise3 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"ValueOne");
        map.put(2,"ValueTwo");
        map.put(3,"ValueThree");
        map.put(4,"ValueFour");
        HashMap<Integer,String> mapSecond = new HashMap<>();
        for (Map.Entry<Integer, String> FirstMapValue : map.entrySet()) {
            mapSecond.put(FirstMapValue.getKey(),FirstMapValue.getValue());
        }
        for (Map.Entry<Integer, String> entry : mapSecond.entrySet()) {
            System.out.println(entry);
        }
    }
}
