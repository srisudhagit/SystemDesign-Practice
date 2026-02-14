package com.systemdesign.lld.ObserverPattern.FitnessTrackerExample;

public class GoalChecker implements Observer{

    @Override
    public void update(int a, int b, float c) {
        if(a > 10 && b > 10 && c > 10){
            System.out.println("Goal reached!!!!!");
        }else{
            System.out.println("Work harder...You are almost there");
        }
    }


    
}
