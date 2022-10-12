package id.co.mandiri.bankapp.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BelajarCollection {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Satu");
        stringList.add("Dua");
        stringList.add("Tiga");
        System.out.println(stringList);

        System.out.println("=============");
        for(String element : stringList){
            System.out.println(element);
        }
        System.out.println("=============");
        stringList.forEach(System.out::println);

        System.out.println("=============");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Satu");
        map.put(2, "Dua");
        map.put(3, "Tiga");
        map.put(4, "Satu");
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map);
        System.out.println("=============");
    }
}
