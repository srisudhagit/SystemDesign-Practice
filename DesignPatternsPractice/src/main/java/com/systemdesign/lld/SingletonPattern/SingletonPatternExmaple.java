package com.systemdesign.lld.SingletonPattern;

public class SingletonPatternExmaple {
    //private and static instance variable
    private static SingletonPatternExmaple instance;

    // private constructor
    private SingletonPatternExmaple(){

    }

    //static method to get the instance
    public static SingletonPatternExmaple getInstance(){
        if(instance == null){
            instance = new SingletonPatternExmaple();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        SingletonPatternExmaple singleton = SingletonPatternExmaple.getInstance();
        singleton.showMessage();
    }
    
}
