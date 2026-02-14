package com.systemdesign.lld.ObserverPattern.FitnessTrackerExample;

public class Client {
    public static void main(String[] args) {
        FitnessData fitdata = new FitnessData();

        DisplayPannel dp = new DisplayPannel();
        GoalChecker gc = new GoalChecker();

        fitdata.subscribe(dp);
        fitdata.subscribe(gc);

        fitdata.setFitnessData(5,5,5);

        fitdata.setFitnessData(50,50,50);
    }
}
