package com.ansou.algo;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        result.add((a.get(0) > b.get(0) ? 1 : 0) + (a.get(1) > b.get(1) ? 1 : 0) + (a.get(2) > b.get(2) ? 1 : 0));
        result.add((a.get(0) < b.get(0) ? 1 : 0) + (a.get(1) < b.get(1) ? 1 : 0) + (a.get(2) < b.get(2) ? 1 : 0));

        return result;
    }

    public static void main(String[] args) {
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        first.add(50);
        first.add(60);
        first.add(70);

        second.add(3);
        second.add(6);
        second.add(10);

        System.out.println(compareTriplets(first, second));
    }

}
