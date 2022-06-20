package com.keep.calm.enjoy.java.b.conditional.and.block.statement.nader.assignment.second;

import java.util.Scanner;

public class SecondAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your grade: ");
        int number =input.nextInt();

        char result = ' ';
        if (number > 20) {
            result = 'W';
        } else if (number > 17 && number <= 20) {
            result = 'A';
        } else if (number > 14 && number <= 17) {
            result = 'B';
        } else if (number > 11 && number <= 14) {
            result = 'C';
        } else if (number > 10 && number <= 11) {
            result = 'D';
        } else if (number > 0 && number <= 10) {
            result = 'F';
        } else {
            System.out.println("Your grade in not in the range");
        } if (result !=' ') {
            System.out.println("Your grade = " + result);
        }



    }


}
