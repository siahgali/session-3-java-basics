package com.keep.calm.enjoy.java.d.methods.sums;

public class Sums {
    public static void main(String[] args) {
        showSum1(7.5f, 1.4f, 3);
        showSum2(7.5f, 1.4f, 0);
        showSum3(7.5f, 1.4f, 0);
    }

    static void showSum1(float x, float y, int count) {
        float sum = x + y;
        for(int i = 0; i < count; i++) {
            System.out.println(sum);
        }
    }

    static void showSum2(float x, float y, int count) {
        float sum = x + y;
        for(int i = 0; i < count; i++) {
            System.out.println(sum);
        }
        return;
    }

    static void showSum3(float x, float y, int count) {
        if (count < 1)
            return;
        float sum = x + y;
        for(int i = 0; i < count; i++) {
            System.out.println(sum);
        }
        return;
    }
}
