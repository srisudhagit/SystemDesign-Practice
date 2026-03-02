package com.systemdesign.lld.StatePattern;

public class IdleState implements MachineState {
    @Override
    public void selectItem(VendingMachine context, String itemCode) {
        System.out.println("Item " + itemCode + " selected. Please insert money.");
        context.setState(new ItemSeletedState());
    }

    @Override
    public void insertMoney(VendingMachine context, double amount) {
        System.out.println("Please select an item before inserting money.");
    }

    @Override
    public void dispenseItem(VendingMachine context) {
        System.out.println("Please select an item and insert money before dispensing.");
    }
    
    @Override
    public String getState(){
        return "IdleState";
    }
}
