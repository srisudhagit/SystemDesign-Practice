package com.systemdesign.lld.AbstractFactoryPattern;

public class LinuxGUIFactory implements GUIFactory {  
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }   
}
