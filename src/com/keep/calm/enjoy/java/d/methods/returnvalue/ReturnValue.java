package com.keep.calm.enjoy.java.d.methods.returnvalue;

public class ReturnValue {
    public static void main(String[] args) {
        double result = calculateInterest(100d, 0.05d, 10);
        System.out.println(result);
        System.out.println();

        double[] arrayResult = produceInterestHistory(100d, 0.05d, 10);
        for(double sumForThisYear : arrayResult)
            System.out.println(sumForThisYear);
    }

    static double calculateInterest(double amt, double rate, int years) {
        double interest = amt * rate * years;
        return interest;
    }

    static double[] produceInterestHistory(double amt, double rate, int years) {
        double[] accumulatedInterest = new double[years];
        for(int yearIndex = 0; yearIndex < years; yearIndex++) {
            int year = yearIndex + 1;
            accumulatedInterest[yearIndex] = calculateInterest(amt, rate, year);
        }
        return accumulatedInterest;
    }
}
