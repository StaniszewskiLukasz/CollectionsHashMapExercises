package ownExercises;

import java.util.HashMap;

//Write a Java program to get a collection view of the values contained in this map
public class Exercise11 {
    public static void main(String[] args) {
        HashMap<Integer,String> stringHashMap = new HashMap<>();
        stringHashMap.put(1,"ValueOne");
        stringHashMap.put(2,"ValueTwo");
        stringHashMap.put(3,"ValueThree");
        stringHashMap.put(4,"ValueFour");

        System.out.println(stringHashMap.values());

    }


}
