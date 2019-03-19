package ownExercises;
//Write a Java program to create a set view of the mappings contained in a map
import java.util.HashMap;
import java.util.Set;

public class Exercise8 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"ValueOne");
        map.put(2,"ValueTwo");
        map.put(3,"ValueThree");
        map.put(4,"ValueFour");
        System.out.println(map + "Widok mapy");
        Set set = map.entrySet();
        System.out.println(set + "Widok seta");
    }
}
