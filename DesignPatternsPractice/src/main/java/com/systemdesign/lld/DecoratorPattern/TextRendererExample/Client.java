package com.systemdesign.lld.DecoratorPattern.TextRendererExample;

public class Client {
    public static void main(String[] args) {
        TextView myView = new PlainTextView("Sudha is a Senior Software Developer");
        myView.render();
        TextDecorator boldDec = new BoldDecorator(myView);
        boldDec.render();

        TextDecorator italDec = new ItalicDecorator(boldDec);
        italDec.render();

    }
}
