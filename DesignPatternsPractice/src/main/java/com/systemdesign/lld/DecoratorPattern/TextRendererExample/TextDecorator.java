package com.systemdesign.lld.DecoratorPattern.TextRendererExample;

abstract class TextDecorator implements TextView {
    protected TextView view;

    public TextDecorator(TextView tv){
        this.view = tv;
    }
}
