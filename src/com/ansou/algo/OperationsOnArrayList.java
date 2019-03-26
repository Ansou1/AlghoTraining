package com.ansou.algo;

import java.util.ArrayList;
import java.util.Collections;

public class OperationsOnArrayList {

    // Function to insert element into list
    public static void insert(ArrayList<Integer> list, int x)
    {
        list.add(x);
    }

    // Function to sort list in Increasing order
    public static void IncOrder(ArrayList<Integer> list)
    {
        Collections.sort(list);

    }

    // Function to search element in the lise
    // val : element to be searched
    public static void Search(ArrayList<Integer> list, int val)
    {
        if (list.contains(val))
            System.out.println(list.indexOf(val));
        else
            System.out.println("-1");
    }

    // Function to sort list in decreasing order
    public static void DecOrder(ArrayList<Integer> list)
    {
        Collections.sort(list, Collections.reverseOrder());
    }

    public static void main(String[] args) {
    }
}
