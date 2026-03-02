package com.systemdesign.lld.CommandPattern;

public class Editor {
    private StringBuilder content;

    public Editor() {
        this.content = new StringBuilder();
    }

    public void type(String text) {
        content.append(text);
    }

    public String delete(int length) {
        int start = Math.max(0, content.length() - length);
        String deleted = content.substring(start);
        content.delete(start, content.length());
        return deleted;
    }

    public String getContent() {
        return content.toString();
    }
}
