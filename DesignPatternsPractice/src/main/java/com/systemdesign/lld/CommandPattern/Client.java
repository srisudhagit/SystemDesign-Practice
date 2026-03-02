package com.systemdesign.lld.CommandPattern;

public class Client {
    public static void main(String[] args) {
       Editor editor = new Editor();
       EditorInvoker invoker = new EditorInvoker();

       TypeCommand typeCommand1 = new TypeCommand(editor, "Hello ");
       invoker.setCommand(typeCommand1);
       invoker.executeCommand();

       TypeCommand typeCommand2 = new TypeCommand(editor, "World!");
       invoker.setCommand(typeCommand2);
       invoker.executeCommand();

       System.out.println("Current Content: " + editor.getContent());

        invoker.undoCommand();
        System.out.println("After Undo: " + editor.getContent());

        invoker.setCommand(typeCommand2);
        invoker.executeCommand();

        DeleteCommand deleteCommand = new DeleteCommand(editor, 6);
        invoker.setCommand(deleteCommand);
        invoker.executeCommand();

        System.out.println("After Delete: " + editor.getContent());
    
        
    }
}
