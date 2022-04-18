package com.keep.calm.enjoy.java.d.methods.command.line;

public class CommandLine {
    public static void main(String[] args) {
        if(args.length < 1)
            System.out.println("No args provided");
        else
            for(String arg : args)
                System.out.println(arg);

    }
}
