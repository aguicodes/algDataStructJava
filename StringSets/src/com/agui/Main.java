package com.agui;

public class Main {

    public static void main(String[] args) {

        System.out.println("Lets go over the type of strings in java first");

        System.out.println("Specifically, String, StringBuffer and StringBuilder");
        System.out.println("String is immutable, so collects a lot of garbage in heap, when manipulated" +
                " it creates a copy and disgards the old one into garbage collection");

        System.out.println("StringBuffer and StringBuilder are mutable, StringBuffer is save for multithreading" +
                " but at the cost of performance, StringBuilder is not safe for multithreading but in a " +
                " single threaded environment it is recommend since its faster than StringBuffer");


        System.out.println("Now I will create class implemented as a set using all three");

        StringParentSet arr = new StringParentSet();
        //arr.printStrings();

        arr.addString("hello World");
        //arr.printStrings();
        arr.addString("its Wednesday today");
        arr.printStrings();
        arr.addString("its Wednesday today");
        arr.printStrings();
        arr.deleteString("hello World");
        arr.printStrings();







    }
}
