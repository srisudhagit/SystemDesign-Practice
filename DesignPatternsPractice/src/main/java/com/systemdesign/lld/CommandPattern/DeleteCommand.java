package com.systemdesign.lld.CommandPattern;

public class DeleteCommand implements EditorCommand {
    private Editor editor;
    private int length;
    private String deletedText;

    public DeleteCommand(Editor editor, int length) {
        this.editor = editor;
        this.length = length;
    }

    @Override
    public void execute() {
        deletedText = editor.delete(length);
        System.out.println("Deleted last " + length + " characters.");
    }

    @Override
    public void undo() {
        editor.type(deletedText);
        System.out.println("Undo delete: restored " + deletedText);
    }

}
