package com.systemdesign.lld.CompositePattern;

public class File implements FileSystemItem{
    private final String name;
    private final int size;
    
    public File(String nm, int sz){
        this.name = nm;
        this.size = sz;
    }
    
    @Override
    public int getSize(){
        return this.size;
    }

     @Override
    public void printStructure(String indent) {
        System.out.println(indent + "- " + name + " (" + size + " KB)");
    }

    @Override
    public void delete() {
        System.out.println("Deleting file: " + name);
    }
}
