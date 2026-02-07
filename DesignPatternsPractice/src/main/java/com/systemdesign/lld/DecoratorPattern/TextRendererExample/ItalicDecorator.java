package com.systemdesign.lld.DecoratorPattern.TextRendererExample;

public class ItalicDecorator extends TextDecorator{

    public ItalicDecorator(TextView tv){
        super(tv);
    }

    @Override
    public void render(){
        System.out.println("<i>");
        this.view.render();
        System.out.println("<i/>");
    }
    
}
