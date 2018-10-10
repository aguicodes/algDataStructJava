package com.agui;

public class CharSets {

    private boolean[] chars = new boolean[128];

    public CharSets(){
        for(int j =0; j <128; j++){
            chars[j] = false;
        }
    }

    public void addChar(int val){
        if(!charExists(val)){

            System.out.println((char)val + " has been added");
            chars[val] = true;
        }
        else
            System.out.println("No duplicates allowed: Character " +(char) val + " already exists");

    }
    private boolean charExists(int value){
        return chars[value];
    }
    public void printChars(){
        for(int i = 0; i < 128; i++){
            if (chars[i])
                System.out.println((char)i );
        }
    }
    public void removeChar(int remove){
        chars[remove] = false;
        System.out.println((char)remove + " has been removed." );

    }



}
