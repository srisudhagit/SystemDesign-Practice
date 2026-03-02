package com.systemdesign.lld.CommandPattern;

public class TypeCommand implements EditorCommand{
    private Editor editor;
    private String text;

    public TypeCommand(Editor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.type(text);
        System.out.println("Typed: " + text);
    }

    @Override
    public void undo() {
        editor.delete(text.length());
        System.out.println("Undo typing: " + text);
    }
}
