package com.systemdesign.lld.CommandPattern;

import java.util.Stack;

public class EditorInvoker {
    private EditorCommand command;
    private Stack<EditorCommand> commandHistory = new Stack<>();

    public EditorInvoker() {
        this.commandHistory = new Stack<>();
    }

    public void setCommand(EditorCommand command) {
        this.command = command;
    }

    public void executeCommand() {
        if (command != null) {
            command.execute();
            commandHistory.push(command);
        }
    }

    public void undoCommand() {
        if (!commandHistory.isEmpty()) {
            EditorCommand previousCommand = commandHistory.pop();
            previousCommand.undo();
        }
    }
}
