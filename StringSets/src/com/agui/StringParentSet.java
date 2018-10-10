package com.agui;

public class StringParentSet {


    // class has required fields, if constructor is empty it will size arr to 50, else to the size
    // passed in the argument

    private int size = 50;
    private int position = -1;
    private String [] arr;

    public StringParentSet(){
        arr = new String[this.size];
    }
    public StringParentSet( int size){
        this.size = size;
        arr = new String[this.size];
    }
    public void addString ( String s){

        if(!stringExists(s)){
            this.position++;
            arr[this.position] = s;

        }
        else
            System.out.println(s + " already exists and will not be added.");
    }
    public void deleteString(String s){
        for(int i = 0; i <=this.position; i++){
            if (s.equals(arr[i])) {
                System.out.println(arr[i] + " has been deleted.");
                arr[i] = null;
            }
        }
    }
    public void insertString (String s , int index){
        //todo
    }
    public void resizeArray (int size){
        //todo
    }
    public void printStrings(){
        if (this.position == -1)
            System.out.println("\nAdd strings first");
        for(int i = 0; i <= this.position; i++){
            if(arr[i] != null)
                System.out.println( arr[i]);
        }
    }
    private boolean stringExists(String val){
        for(int i = 0; i <=this.position; i++){
            if (val.equals(arr[i]))
                return true;
        }
        return false;
    }


}
