package ru.samsung.itschool.mdev;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeMap<String,TreeMap<String,Integer>> shop
                = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String line;
       // for(int i=0;i<6;i++){
            while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            String words[] = line.split(" ");
            // 0 - Ivanov 1 - paper 2 - 10
            TreeMap<String, Integer> inner = new TreeMap<>();
            if (shop.containsKey(words[0])) {
                if (shop.get(words[0]).containsKey(words[1])) {
                    inner = shop.get(words[0]);
                    inner.put(words[1], inner.get(words[1]) + Integer.parseInt(words[2]));
                    shop.put(words[0], inner);
                } else {
                    inner = shop.get(words[0]);
                    inner.put(words[1], Integer.parseInt(words[2]));
                    shop.put(words[0], inner);
                }
            } else {
                inner.put(words[1], Integer.parseInt(words[2]));
                shop.put(words[0], inner);
            }
        }

        for(Map.Entry<String,TreeMap<String,Integer>> entry: shop.entrySet()) {
            System.out.println(entry.getKey() + ": ");
            for(Map.Entry<String,Integer> entry2: entry.getValue().entrySet()) {
                System.out.println(entry2.getKey() + " " + entry2.getValue());
            }
        }








    }
}
