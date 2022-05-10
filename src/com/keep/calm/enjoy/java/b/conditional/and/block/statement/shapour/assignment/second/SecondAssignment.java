package com.keep.calm.enjoy.java.b.conditional.and.block.statement.shapour.assignment.second;

public class SecondAssignment {
    public static void main(String[] args) {
        int theScore = 12;

        if (theScore > 20) {
            System.out.println("grade = W") ;
        }else if(theScore >= 17 && theScore < 20) {
            System.out.println("grade = A");
        }else if (theScore >= 14 && theScore < 17) {
            System.out.println("grade = B");
        }else if (theScore >= 11 && theScore < 14) {
            System.out.println("grade = C");
        }else if (theScore > 10 && theScore < 11) {
            System.out.println("grade = D");
        }else {
            System.out.println("grade = F");
        }
    }
}
