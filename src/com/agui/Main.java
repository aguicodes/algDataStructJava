package com.agui;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //lets start with the typical Hello World;
        String word = "Hello world!";
        System.out.println(word);
        System.out.printf("%s\n", word);

        // lets lear about stack first - FIFO (First in First out)
        //stack is commonly implemented though linked list or arrays

        intStack stack = new intStack(10);
        System.out.println(stack.Pop());

        stack.Push(1);
        stack.Push(2);
        stack.Push(3);
        stack.Push(4);
        stack.Push(5);

        System.out.println(stack.Pop());
        System.out.println(stack.Pop());

        System.out.printf("let's po the remaining 3...\n");
        System.out.println(stack.Pop());
        System.out.println(stack.Pop());
        System.out.println(stack.Pop());

        if(stack.Pop() == -1)
            System.out.printf("stack is empty...\n");




    }
}
