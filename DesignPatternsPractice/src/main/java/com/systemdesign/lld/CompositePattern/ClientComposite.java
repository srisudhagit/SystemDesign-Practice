package com.systemdesign.lld.CompositePattern;

public class ClientComposite {
    public static void main(String[] args) {
        FileSystemItem file1 = new File("abc.txt", 1);
        FileSystemItem file2 = new File("def.jpg", 2);
        FileSystemItem file3 = new File("ghi.csv", 3);

        Folder documentsFolder = new Folder("documents");
        documentsFolder.addItem(file1);
        documentsFolder.addItem(file3);
        
        Folder imagesFolder = new Folder("images");
        imagesFolder.addItem(file2);

        Folder homeFolder = new Folder("home");
        homeFolder.addItem(imagesFolder);
        homeFolder.addItem(documentsFolder);

        // treating folder and file the similar way using composite pattern by implementing the same interface
        System.out.println("--------Printing folder--------");
        homeFolder.printStructure("");

        System.out.println("Total size of home folder : "+ homeFolder.getSize());

        System.out.println("\n--------- Deleting all --------");
        homeFolder.delete();
    }
}
