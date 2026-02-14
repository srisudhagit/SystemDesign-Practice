package com.systemdesign.lld.ProxyPattern;

public class Client {

    public static void main(String[] args) {
        Image img1 = new ProxyImage("abc.txt");
        Image img2 = new ProxyImage("def.txt");
        Image img3 = new ProxyImage("ghi.txt");

        // this won't instantiate highresolutionimage
        System.out.println(img1.getFileName());

        img2.display();
        System.out.println(img2.getFileName());

        System.out.println(img3.getFileName());
    }
}
