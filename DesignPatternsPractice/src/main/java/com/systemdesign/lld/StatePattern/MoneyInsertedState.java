package com.systemdesign.lld.StatePattern;


public class MoneyInsertedState implements MachineState {
    @Override
    public void selectItem(VendingMachine context, String itemCode) {
        System.out.println("Item already selected. Please insert money.");
    }

    @Override
    public void insertMoney(VendingMachine context, double amount) {
        System.out.println("Money already inserted: $" + amount);
    }

    @Override
    public void dispenseItem(VendingMachine context) {
        System.out.println("Dispensing item: " + context.getSelectedItem());
        context.setState(new IdleState());
        System.out.println("Please take your item. Thank you!");   
    }

    @Override
    public String getState(){
        return "MoneyInsertedState";
    }
}
