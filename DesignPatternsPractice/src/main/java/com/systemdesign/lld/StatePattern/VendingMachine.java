package com.systemdesign.lld.StatePattern;

public class VendingMachine {
    MachineState currentState;
    private String selectedItem;
    private double currentBalance;

    public VendingMachine() {
        this.currentState = new IdleState();
    }

    public void setState(MachineState state) {
        this.currentState = state;
    }

    public void selectItem(String itemCode) {
        this.selectedItem = itemCode;
        currentState.selectItem(this, itemCode);
    }

    public void insertMoney(double amount) {
        currentState.insertMoney(this, amount);
    }

    public void setCurrentBalance(double amount) {
        this.currentBalance += amount;
    }

    public Double getCurrentBalance() {
        return this.currentBalance;
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    public void reset() {
        this.selectedItem = null;
        this.currentBalance = 0.0;
        this.currentState = new IdleState();
    }

    public MachineState getCurrentState() {
        return this.currentState;
    }
}
