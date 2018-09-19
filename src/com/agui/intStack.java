package com.agui;

public class intStack {

    private int sizeOfarr;
    private int top;
    private int [] stack;

    public intStack(){

        // if constructor is passed with an empty
        sizeOfarr = 50;
        top = -1;
        stack = new int[sizeOfarr];
    }
    public intStack(int size){
        //if not empty and size is specified
        this.sizeOfarr = size;
        top = -1;
        stack = new int[sizeOfarr];
    }

    public int Pop(){
        if(!isEmpty()){
            return stack[top--];
        }
        else{
            return -1;
        }
    }
    public void Push(int item){
        if (!isFull()){
            top++;
            stack[top] = item;
        }
        else
            System.out.println("Error: stack is full");
    }
    private boolean isFull(){
        return(top == stack.length-1);
    }
    private boolean isEmpty(){
        return (top == -1);
    }

}
