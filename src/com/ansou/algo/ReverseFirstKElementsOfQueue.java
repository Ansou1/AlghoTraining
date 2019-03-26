package com.ansou.algo;

import java.util.*;

public class ReverseFirstKElementsOfQueue {

    static void Print(Queue<Integer> queue)
    {
        while (!queue.isEmpty()) {
            System.out.print( queue.peek() + ", ");
            queue.remove();
        }
    }

    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
        Stack<Integer> stk = new Stack<>();
        int temp = k;
        int size = q.size();

        while(--temp >= 0)
        {
            stk.push(q.remove());
        }

        while(!stk.isEmpty())
        {
            q.add(stk.pop());
        }
        temp = size-k;
        while(temp-- > 0)
        {
            q.add(q.remove());
        }
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        //Print(q);

        q = modifyQueue(q, 3);
        Print(q);
    }
}
