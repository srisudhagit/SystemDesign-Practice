package com.systemdesign.lld.PrototypePattern;

public class ClientClass {
    public static void main(String[] args) {
        Shape firstShape = new Circle(3);
        Shape secondShape = new Square(4);

        Shape clonedShape1 = firstShape.clone();
        Shape clonedShape2 = secondShape.clone();

        System.out.println("Original Circle radius: " + ((Circle) firstShape).getRadius());
        System.out.println("Cloned Circle radius: " + ((Circle) clonedShape1).getRadius());

        System.out.println("Original Square side length: " + ((Square) secondShape).getSideLength());
        System.out.println("Cloned Square side length: " + ((Square) clonedShape2).getSideLength());

    }
    
}
