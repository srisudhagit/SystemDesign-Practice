package com.systemdesign.lld.DecoratorPattern.TextRendererExample;

public class PlainTextView implements TextView{
    private final String text;

    public PlainTextView(String str){
        this.text = str;
    }

    @Override
    public void render(){
        System.out.println(this.text);
    }
}
