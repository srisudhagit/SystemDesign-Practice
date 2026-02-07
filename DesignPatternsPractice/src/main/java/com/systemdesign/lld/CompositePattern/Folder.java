package com.systemdesign.lld.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem{
     private final String name;
     private List<FileSystemItem> items;

     public Folder(String name){
        this.name = name;
        items = new ArrayList<>();
     }

     public void addItem(FileSystemItem item){
        this.items.add(item);
     }

     @Override
     public int getSize(){
        int size = 0;
        for(FileSystemItem item: items){
            size += item.getSize();
        }
        return size;
     }

     @Override
     public void printStructure(String indent){
        System.out.println("Printing folder with name : "+this.name);
         for(FileSystemItem item: items){
            item.printStructure(indent);
        }
     }

      @Override
    public void delete() {
        for (FileSystemItem item : items) {
            item.delete();
        }
        System.out.println("Deleting folder: " + name);
    }
    
}
