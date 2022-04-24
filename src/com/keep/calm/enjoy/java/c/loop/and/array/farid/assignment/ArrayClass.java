package com.keep.calm.enjoy.java.c.loop.and.array.farid.assignment;

public class ArrayClass {
    public static void main(String[] args) {

        String[] colors = {"red", "blue", "purple", "yellow", "pink"};

        System.out.println("The length of the array is " + colors.length);

        String[] itemStartWithB = new String[1];
        for (int i = 0; i < colors.length - 1; i++) {

            String item = colors[i];
            if (item.startsWith("b")) {

                itemStartWithB[0] = item;
            }
        }

        System.out.println("The item starts with letter 'b' is " + itemStartWithB[0]);
    }
}
