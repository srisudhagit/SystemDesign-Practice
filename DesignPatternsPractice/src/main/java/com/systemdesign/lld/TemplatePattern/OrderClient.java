package com.systemdesign.lld.TemplatePattern;

public class OrderClient {
    public static void main(String[] args) {
        System.out.println("Processing a regular order:");
        OrderProcessor regularOrder = new RegularOrderProcessor();
        regularOrder.processOrder();

        System.out.println("\nProcessing a prime order:");
        OrderProcessor primeOrder = new PrimeOrderProcessor();
        primeOrder.processOrder();

        System.out.println("\nProcessing an international order:");
        OrderProcessor internationalOrder = new InternationalOrderProcessor();
        internationalOrder.processOrder();
    }
}
