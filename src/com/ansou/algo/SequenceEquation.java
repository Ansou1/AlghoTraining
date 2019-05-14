package com.ansou.algo;

public class SequenceEquation {

    static int[] permutationEquation(int[] p) {
        int[] resultArr = new int[p.length];
        for(int i = 0; i < p.length; i++) {
            resultArr[p[p[p[i]-1]-1]-1] = p[i];
        }
        return resultArr;
    }

    public static void main(String[] args) {
        int[] p = {5,2,1,3,4};
        int[] result = permutationEquation(p);
        for (int elem: result) {
            System.out.println(elem);
        }
    }

}
