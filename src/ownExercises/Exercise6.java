package ownExercises;

import java.util.HashMap;

//Write a Java program to get a shallow copy of a HashMap instance
public class Exercise6 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"ValueOne");
        map.put(2,"ValueTwo");
        map.put(3,"ValueThree");
        map.put(4,"ValueFour");
        System.out.println("Pierwsza mapa" + map);
        HashMap mapSecond = new HashMap<>();
        mapSecond = (HashMap)map.clone();
        System.out.println("Kopiowana mapa" +mapSecond);
    }
}
