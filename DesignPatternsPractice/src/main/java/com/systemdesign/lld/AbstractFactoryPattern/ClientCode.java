package com.systemdesign.lld.AbstractFactoryPattern;

public class ClientCode {
    public static void main(String[] args) {
        GUIFactory guiFactory;

        guiFactory = new WindowsGUIFactory();
        Button wbutton = guiFactory.createButton();
        wbutton.click();
        CheckBox wcheckbox = guiFactory.createCheckBox();
        wcheckbox.check();

        guiFactory = new LinuxGUIFactory();
        Button lbutton = guiFactory.createButton();
        lbutton.click();
        CheckBox lcheckbox = guiFactory.createCheckBox();
        lcheckbox.check();
    }
}
