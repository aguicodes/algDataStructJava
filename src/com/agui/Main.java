package com.agui;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //lets start with the typical Hello World;
        String word = "Hello world!";
        System.out.println(word);
        System.out.printf("%s\n", word);

        // lets learn about stack first - FILO (First in Last out)
        //stack is commonly implemented though linked list or arrays

        intStack stack = new intStack(5);
        System.out.println(stack.Pop());
        // recieve -1 if empty

        stack.Push(1);
        stack.Push(2);
        stack.Push(3);
        stack.Push(4);
        stack.Push(5);
        // let's try and push when full
        stack.Push(6);

        System.out.println(stack.Pop());
        System.out.println(stack.Pop());

        System.out.printf("let's pop the remaining 3...\n");
        System.out.println(stack.Pop());
        System.out.println(stack.Pop());
        System.out.println(stack.Pop());

        if(stack.Pop() == -1)
            System.out.printf("stack is empty...\n");




    }
}
