package ownExercises;

import java.util.HashMap;
import java.util.Map;
//Write a Java program to associate the specified value with the specified key in a HashMap.
public class Exercise1 {
    public static void main(String[] args) {
        HashMap<Integer,String> stringHashMap = new HashMap<>();
        stringHashMap.put(1,"ValueOne");
        stringHashMap.put(2,"ValueTwo");
        stringHashMap.put(3,"ValueThree");
        stringHashMap.put(4,"ValueFour");
        System.out.println(stringHashMap); // to wydrukuje klucz i wartość
        for (Integer integer : stringHashMap.keySet()) { // keySet zwraca klucze, co oczywiste przeszukujemy Integery(lub to co mamy pod kluczem)
            System.out.println(integer);
        }
        for (String value : stringHashMap.values()) { // values zwraca wartości, co oczywiste przeszukujemy Stringi(lub to co mamy pod kluczem)
            System.out.println(value);
        }
        for (Map.Entry<Integer, String> stringEntry : stringHashMap.entrySet()) { //zwraca obiekty które zawierają wartości klucz-wartość
            System.out.println(stringEntry);
        }
    }

}
