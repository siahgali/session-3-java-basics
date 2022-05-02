package com.keep.calm.enjoy.java.fatemeh.assignment.second;

import java.util.Scanner;

public class SecondAssignment {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter grade marks");
        double grade = scan.nextDouble();

        if(grade >= 20){
            System.out.println("Excellent: Grade w");
        }else if(grade < 20 && grade >= 17){
            System.out.println("Very Good: Grade A");
        }else if(grade < 17 && grade >= 14){
            System.out.println("Good: Grade B");
        }else if(grade < 14 && grade >= 11){
            System.out.println("Satisfactory: Grade C");
        }else if(grade < 11 && grade >= 10){
            System.out.println("Work Hard: Grade D");
        }else if(grade < 10 && grade >= 0){
            System.out.println("Just Passed: Grade F");
        }else {
            System.out.println("Failed!");
        }
    }

    }

