package com.systemdesign.lld.StatePattern;


public class ItemSeletedState implements MachineState {

    @Override
    public void selectItem(VendingMachine context, String itemCode) {
        System.out.println("Item already selected. Please insert money.");
    }

    @Override
    public void insertMoney(VendingMachine context, double amount) {
        System.out.println("Money inserted: $" + amount);
        context.setCurrentBalance(amount);
        context.setState(new MoneyInsertedState());
    }

    @Override
    public void dispenseItem(VendingMachine context) {
        System.out.println("Please insert money before dispensing the item.");
    }

    @Override
    public String getState(){
        return "ItemSeletedState";
    }
}
