package com.keep.calm.enjoy.java.d.methods.swap;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 20;
        swap(val1, val2);
        System.out.println("val1 = " + val1);
        System.out.println("val2 = " + val2);
    }

    static void swap(int i, int j) {
        int k = i;
        i = j;
        j = k;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }

}
