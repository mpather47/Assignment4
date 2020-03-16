package org.example;

import java.sql.SQLOutput;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        //Different types of Collection interfaces
        //Collections
        System.out.println("Collections");
        Collection<String> col = new ArrayList<String>();
        col.add("a");
        col.add("b");
        col.add("c");
        col.add("d");
        col.remove("b");
        System.out.println(col);
        System.out.println(col.size());
        col.clear();
        System.out.println(col.isEmpty());


       //Maps
        System.out.println("\nMaps");
        Map<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("a",1);
        hm.put("b",2);
        hm.put("c",3);
        hm.put("d",4);
        hm.remove("b");
        System.out.println(hm.containsKey("b"));
        hm.replace("d",5);
        System.out.println(hm);
        System.out.println(hm.keySet());


        //Set
        System.out.println("\nSets");

        Set<String> hs = new HashSet<String>();
        hs.add("lemur");
        hs.add("orangatang");
        hs.add("spider monkey");
        hs.add("silverback gorilla");

        hs.remove("orangatang");
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.contains("spider monkey"));


        //Lists
        System.out.println("\nLists");
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.remove("b");
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list.isEmpty());
    }
}
