package com.systemdesign.lld.StatePattern;

public interface MachineState {
    void selectItem(VendingMachine context, String itemCode);
    void insertMoney(VendingMachine context, double amount);
    void dispenseItem(VendingMachine context);
    String getState();
}
