package com.ansou.algo;

import java.util.PriorityQueue;

public class OperationsOnPriorityQueue {


    // Function to insert element into the queue
    static void insert(PriorityQueue<Integer> q, int k){
        q.add(k);
    }

    // Function to find an element k
    static boolean find(PriorityQueue<Integer> q, int k){
        return q.contains(k);
    }

    // Function to delete the element from queue
    static int delete(PriorityQueue<Integer> q){
        return q.remove();
    }

    public static void main(String[] args) {
    }
}
