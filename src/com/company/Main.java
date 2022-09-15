package com.company;

import java.util.*;

import static java.util.Collections.reverseOrder;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        TreeSet<City> set = new TreeSet<>();

        for (int i = 0; i < 15; i++) {
            City city= new City(random.nextInt(1,1000),"City" + (i+1));
            if (city.getKode() % 2 != 0){
                set.add(city);
            }
        }

        TreeSet<City> treeSetdes = (TreeSet<City>) set.descendingSet();
        for (City i: treeSetdes) {
            System.out.println(i);
        }

        }
    }
