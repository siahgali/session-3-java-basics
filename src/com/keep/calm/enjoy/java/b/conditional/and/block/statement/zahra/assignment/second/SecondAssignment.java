package com.keep.calm.enjoy.java.b.conditional.and.block.statement.zahra.assignment.second;
import java.util.Scanner;
public class SecondAssignment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a grade ( > 0): ");

        int num = scan.nextInt();
        // Closing Scanner after the use
        scan.close();
        char result = ' ' ;

        if (num > 20 ) {
            result = 'W';
        } else if (num>17 && num<=20) {
            result = 'A';
        }
         else if (num>14 && num<=17) { result='B';}
          else if (num>11 && num<=14) { result='C'; }
           else if (num>10 && num<=11) {result='D';}
            else if (num>0 && num<=10) {result='F';}

else {
    System.out.println("your grade is not in the range  ");
}
if (result!=' ') {
    System.out.println("your grade is in group: " + result);
}
}


    }


