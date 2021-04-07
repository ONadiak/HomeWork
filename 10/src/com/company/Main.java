package com.company;

import java.util.*;

public class Main {
    public static <type> Set union(Set set1, Set set2)
    {
        Set<type> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <type> Set intersect(Set set1, Set<String> set2) {
        Set<type> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }


    public static void main(String[] args) {

        Set <String> set1 = new HashSet<>();
        set1.add("5");
        set1.add("6");
        set1.add("3");
        set1.add("4");

        Set <String> set2 = new HashSet<>();
        set2.add("5");
        set2.add("17");
        set2.add("3");
        set2.add("25");

        System.out.println(union(set1,set2));
        System.out.println(" ");
        System.out.println(intersect(set1,set2));

        //          Task 2

        Map<String, String> persons = new HashMap<String, String>();

        persons.put("Bozuk", "Oleh");
        persons.put("Vunnuth", "Max");
        persons.put("Vitush", "Max");
        persons.put("Danulyak", "Ivan");
        persons.put("Kovalenko", "Evgen");
        persons.put("Kozar", "Mykola");
        persons.put("Kosenko", "Orest");
        persons.put("Kuzma", "Roman");
        persons.put("Lev", "Nazar");
        persons.put("Lohin", "Oleksandr");



        boolean isSimilar = false;
        for (Map.Entry<String, String> entry : persons.entrySet()) {
            for (Map.Entry<String, String> other : persons.entrySet()) {
                if (entry.getValue() == other.getValue() && entry.getKey()!= other.getKey() )
                    isSimilar = true;

            }
        }
        if (isSimilar)
            System.out.println("There are similar names");
        else System.out.println("There are not similar names");

        persons.values().removeIf(x->x.contains("Orest"));

        System.out.println(persons);
    }


}