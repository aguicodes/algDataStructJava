package com.agui;

public class setImplementation {
    private int size = 50;
    private int [] arr;
    private int index = -1;
    public setImplementation(){
        arr = new int [size];
    }
    public setImplementation(int size){
        this.size = size;
        arr = new int [this.size];
    }
    public void add(int value){
        if(doesNotExist(value)){
            index++;
            //System.out.println(index);
            arr[index] = value;
            //System.out.println(arr[index]);
        }

    }
    public boolean doesNotExist(int val){
        int length = index;
        for(int i = 0; i <= length; i++){
            if (arr[i] == val)
                return false;
        }
        return true;

    }
    public void printvals(){
        for(int i = 0; i <=index; i++){
            System.out.println(arr[i]);
        }
    }

}
