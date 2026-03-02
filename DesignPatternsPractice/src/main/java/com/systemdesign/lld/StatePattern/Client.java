package com.systemdesign.lld.StatePattern;

public class Client {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        System.out.println(" State: "+ machine.getCurrentState().getState());
        machine.selectItem("A1");
        System.out.println(" State: "+ machine.getCurrentState().getState());
        
        machine.insertMoney(10.5);
        System.out.println(" State: "+ machine.getCurrentState().getState());

        machine.dispenseItem();
        System.out.println(" State: "+ machine.getCurrentState().getState());
    }
}
