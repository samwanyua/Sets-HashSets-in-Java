package intellij;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Sets and HashSets
        // Set - is one way to group like objects together as one unit
        /*
        A list maintains order but a hashset doesn't have any particular order
        Sets - don't allow duplicates


         */
        Set<String> names = new HashSet<>();
        // TreeSet - order them naturally - alphabetical order
        // HashSet -  faster than treeSet
        // Use treeSet when you want a set but you really care about the order

        // LinkedHashSet - maintain insertion order, almost as fast as hashset



        // adding objects to set
        names.add("Walter");
        names.add("John");
        names.add("Ruth");
        names.add("Arnold");

        // removing objects
        names.remove("Walter"); // using index doesn't remove elements - no particular order

        // getting size
        System.out.println(names.size());

        // contain
        System.out.println(names.contains("Ruth")); // returns either true or false

        // is empty
        System.out.println(names.isEmpty()); // returns boolean value

        // get rid of all elements
//        names.clear();

        // Iterating through sets
        for(String name : names){
            System.out.println(name);
        }

        // using lamda
        names.forEach(System.out::println);

        // using  iterator
        Iterator<String> namesIterator = names.iterator();
        while(namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }

        // sets and hashSets - use them when you don't want duplicates, don't care the order, removing duplicates
        List<Integer> marks = new ArrayList<>();
        marks.add(2);
        marks.add(3);
        marks.add(1);
        marks.add(2);
        marks.add(6);
        marks.add(5);
        marks.add(6);

        System.out.println(marks);

        Set<Integer> marksSet = new HashSet<>(marks);
        System.out.println(marksSet);

        System.out.println(names);

        System.out.println("Hello world!");
    }
}