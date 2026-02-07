package com.systemdesign.lld.PrototypePattern;

public class ClientRegistry {
    // This can be replaced with a HashMap for better performance
    private java.util.Map<String, Shape> shapeMap = new java.util.HashMap<>();

    public void registerShape(String key, Shape shape) {
        shapeMap.put(key, shape);
    }

    // clone and return the shape associated with the key
    public Shape getShape(String key) {
        Shape shape = shapeMap.get(key);
        if (shape != null) {
            return shape.clone();
        }
        return null;
    }

    public static void main(String[] args) {
        ClientRegistry registry = new ClientRegistry();

        Circle circle = new Circle(5);
        Square square = new Square(10);

        registry.registerShape("circle1", circle);
        registry.registerShape("square1", square);

        // use the key to get cloned shapes
        Shape clonedCircle = registry.getShape("circle1");
        Shape clonedSquare = registry.getShape("square1");

        System.out.println("Original Circle radius: " + ((Circle) circle).getRadius());
        System.out.println("Cloned Circle radius: " + ((Circle) clonedCircle).getRadius());

        System.out.println("Original Square side length: " + ((Square) square).getSideLength());
        System.out.println("Cloned Square side length: " + ((Square) clonedSquare).getSideLength());
    }
    
}
