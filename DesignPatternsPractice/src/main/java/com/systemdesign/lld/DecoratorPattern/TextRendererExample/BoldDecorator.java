package com.systemdesign.lld.DecoratorPattern.TextRendererExample;

public class BoldDecorator extends TextDecorator{

    public BoldDecorator(TextView textView){
        super(textView);
    }

    @Override
    public void render(){
        System.out.println("<b>");
        this.view.render();
        System.out.println("<b/>");
    }
    
}
