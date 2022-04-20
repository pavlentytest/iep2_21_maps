package ru.samsung.itschool.mdev;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        // Maps - словари
        // key => value

        Map<String,String> countries = new HashMap<>();
        countries.put("first","Russia");
        countries.put("third","Germany");
        countries.put("five","Finland");
        countries.put("four","France");

        String value = countries.get("four");
        for(Map.Entry<String,String> obj: countries.entrySet()) {
            System.out.println(obj.getKey() + "; "+obj.getValue());
        }

        // countries.containsKey()
        //countries.containsValue()
        class User {
            private String name;
            private int age;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }

        TreeMap<Integer, User> treeMap = new TreeMap<>();
        treeMap.put(1, new User("Ivan",20));
        treeMap.put(1, new User("Ivan",20));
        treeMap.put(2, new User("Petr",21));
        treeMap.put(2, new User("Petr",21));

        

        for(Map.Entry<Integer,User> u: treeMap.entrySet()) {
            System.out.println(u.getKey() + "; "+u.getValue().name);
        }

    }
}
