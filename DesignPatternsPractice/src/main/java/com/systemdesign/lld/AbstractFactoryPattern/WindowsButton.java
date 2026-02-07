package com.systemdesign.lld.AbstractFactoryPattern;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows button clicked");
    }

    @Override
    public void paint() {
        System.out.println("Painting Windows button");
    }
}
