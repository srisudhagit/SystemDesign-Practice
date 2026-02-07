package com.systemdesign.lld.AbstractFactoryPattern;

public class WindowsGUIFactory implements GUIFactory {  
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
    
}
