package com.systemdesign.lld.AbstractFactoryPattern;

public class LinuxCheckBox implements CheckBox {    
    @Override
    public void check() {
        System.out.println("Linux checkbox checked");
    }

    @Override
    public void uncheck() {
        System.out.println("Linux checkbox unchecked");
    }       
}
