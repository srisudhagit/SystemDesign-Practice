package com.systemdesign.lld.ProxyPattern;

public class ProxyImage implements Image{
    private String fileName;
    private HighResolutionImage realImage;

    public ProxyImage(String fileName){
        this.fileName = fileName;
        System.out.println("ImageProxy: Created for " + fileName + ". Real image not loaded yet.");
    }

    @Override
    public void display() {
         // Lazy initialization: Load only when display() is called
        if (realImage == null) {
            System.out.println("ImageProxy: display() requested for " + fileName + ". Loading high-resolution image...");
            realImage = new HighResolutionImage(fileName);
        } else {
            System.out.println("ImageProxy: Using cached high-resolution image for " + fileName);
        }

        // Delegate the display call to the real image
        realImage.display();
    }

    // doesn't load image when thumbnails or filenames are called. Calls the High resolution image only when the actual image load needed.

    @Override
    public String getFileName() {
        return this.fileName;
    }
    
}
