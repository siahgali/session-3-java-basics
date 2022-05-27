package com.keep.calm.enjoy.java.b.conditional.and.block.statement.zahra.assignment;
import java.util.Scanner;
public class CalculOOP {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers and an operator(+ - * /): ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        char operator= scan.next().charAt(0);
        Calcul cal=new Calcul(num1,num2);
        System.out.println(cal.calculate(operator));
    }
}

