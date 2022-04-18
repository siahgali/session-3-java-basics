package com.keep.calm.enjoy.java.e.string.formatting;

/**
 * %[argument_index$][flags][width][.precision]conversion
 */
public class StringFormatting {

    public static void main(String[] args) {
        formatWithRadix();
        formatWithZeroPaddingAndLeftJustify();
        formatWithGrouping();
        formatWithNegativePositive();
        formatWithArgumentIndex();
    }

    private static void formatWithRadix() {
        int myValue = 32;

        String s1 = String.format("%d", myValue);
        String s2 = String.format("%x", myValue);

        String s3 = String.format("%#x", myValue);
        String s4 = String.format("%#X", myValue);

        System.out.println();
        System.out.println("********************************************");
        System.out.println("Format Flag: #");
        System.out.println();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println();
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("********************************************");
    }

    private static void formatWithZeroPaddingAndLeftJustify() {
        int w = 5, x = 235, y = 481, z = 12;

        String s1 = String.format("W:%d X:%d", w, x);
        String s2 = String.format("Y:%d Z:%d", y, z);

        String s3 = String.format("W:%4d X:%4d", w, x);
        String s4 = String.format("Y:%4d Z:%4d", y, z);

        String s5 = String.format("W:%04d X:%04d", w, x);
        String s6 = String.format("Y:%04d Z:%04d", y, z);

        String s7 = String.format("W:%-4d X:%-4d", w, x);
        String s8 = String.format("Y:%-4d Z:%-4d", y, z);

        System.out.println();
        System.out.println("********************************************");
        System.out.println("Width and Format Flags: 0 and -");
        System.out.println();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println();
        System.out.println(s3);
        System.out.println(s4);
        System.out.println();
        System.out.println(s5);
        System.out.println(s6);
        System.out.println();
        System.out.println(s7);
        System.out.println(s8);
        System.out.println("********************************************");
    }

    private static void formatWithGrouping() {
        int iVal = 1234567;
        double dVal = 1234567.0d;

        String s1 = String.format("%d", iVal);
        String s2 = String.format("%,d", iVal);
        String s3 = String.format("%,.2f", dVal);

        System.out.println();
        System.out.println("********************************************");
        System.out.println("Format Flags: ,");
        System.out.println();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("********************************************");
    }

    private static void formatWithNegativePositive() {
        int iPosVal = 123, iNegVal = -456;

        String s1 = String.format("%d", iPosVal);
        String s2 = String.format("%d", iNegVal);

        String s3 = String.format("% d", iPosVal);
        String s4 = String.format("% d", iNegVal);

        String s5 = String.format("%+d", iPosVal);
        String s6 = String.format("%+d", iNegVal);

        String s7 = String.format("%(d", iPosVal);
        String s8 = String.format("%(d", iNegVal);
        String s9 = String.format("% (d", iPosVal);

        System.out.println();
        System.out.println("********************************************");
        System.out.println("Format Flags: Space, +, and (");
        System.out.println();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println();
        System.out.println(s3);
        System.out.println(s4);
        System.out.println();
        System.out.println(s5);
        System.out.println(s6);
        System.out.println();
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s9);
        System.out.println("********************************************");
    }

    private static void formatWithArgumentIndex() {
        int valA = 100, valB = 200, valC = 300;

        String s1 = String.format("%d %d %d",
                valA, valB, valC);

        String s2 = String.format("%3$d %1$d %2$d",
                valA, valB, valC);

        String s3 = String.format("%2$d %<d %1$d",
                valA, valB, valC);

        System.out.println();
        System.out.println("********************************************");
        System.out.println("Argument Index");
        System.out.println();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("********************************************");
    }
}
