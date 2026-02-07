package com.systemdesign.lld.AbstractFactoryPattern;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Windows checkbox checked");
    }

    @Override
    public void uncheck() {
        System.out.println("Windows checkbox unchecked");
    }   
    
}
