package com.systemdesign.lld.AbstractFactoryPattern;

public class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("Linux button clicked");
    }

    @Override
    public void paint() {
        System.out.println("Painting Linux button");
    }   
}
