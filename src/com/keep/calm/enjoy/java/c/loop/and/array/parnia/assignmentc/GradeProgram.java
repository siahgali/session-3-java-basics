package com.keep.calm.enjoy.java.c.loop.and.array.parnia.assignmentc;
import java.util.Scanner;
public class GradeProgram {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Grade of students");
            float grade = scanner.nextFloat();

            if(grade > 20){
                System.out.println("w");
            }else if(grade >= 17 && grade <= 20){
                System.out.println("A");
            }else if(grade >= 14 && grade < 17){
                System.out.println("B");
            }else if(grade >= 11 && grade < 14){
                System.out.println("C");
            }else if(grade >= 10 && grade < 11){
                System.out.println("D");
            }else if(grade >= 0  && grade  < 10) {
                System.out.println("F");}
            else{System.out.println("grade not valid");
                }
            }

    }



