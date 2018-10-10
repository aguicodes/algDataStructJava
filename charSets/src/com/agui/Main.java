package com.agui;

public class Main {

    public static void main(String[] args) {
        char [] arr = {'a', 'b', 'c'};

        for (int i = 0; i < arr.length; i++){
            int num = arr[i];
            System.out.println(num);
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        CharSets arr1 = new CharSets();

        arr1.addChar('a');
        arr1.addChar('b');
        arr1.addChar('c');

        arr1.printChars();
        arr1.addChar('c');
        arr1.removeChar('a');
        arr1.printChars();



    }
}
