package com.keep.calm.enjoy.java.c.loop.and.array.farid.assignment.second;

import java.util.Scanner;

public class SecondAssignment {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter grade");
        double grade = scan.nextDouble();

        if (grade > 20) {
            System.out.println("W");
        } else if (grade > 17 && grade < 20) {
            System.out.println("A");
        } else if (grade > 14 && grade < 17) {
            System.out.println("B");
        } else if (grade > 11 && grade < 14) {
            System.out.println("C");
        } else if (grade > 10 && grade < 11) {
            System.out.println("D");
        } else if (grade > 0 && grade < 10) {
            System.out.println("F");
        }
    }

}
