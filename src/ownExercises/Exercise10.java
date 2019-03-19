package ownExercises;

import java.util.HashMap;
import java.util.Set;

//Write a Java program to get a set view of the keys contained in this map
public class Exercise10 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"ValueOne");
        map.put(2,"ValueTwo");
        map.put(3,"ValueThree");
        map.put(4,"ValueFour");
        Set setKey = map.keySet();
        System.out.println(setKey);//z przypisaniem do zmiennej
        System.out.println(map.keySet()); // bez przypisania do zmiennej
    }
}
