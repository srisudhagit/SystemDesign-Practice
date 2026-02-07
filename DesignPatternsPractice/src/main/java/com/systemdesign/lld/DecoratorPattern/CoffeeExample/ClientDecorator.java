package com.systemdesign.lld.DecoratorPattern.CoffeeExample;

public class ClientDecorator {
    public static void main(String[] args) {
            Beverage espresso = new Espresso();
            System.out.println(espresso.getDescription()+" "+"Cost of Espresso: " + espresso.cost());

            Beverage darkRoastBeverage = new DarkRoast();
            darkRoastBeverage = new Mocha(darkRoastBeverage);
            darkRoastBeverage = new Mocha(darkRoastBeverage);
            darkRoastBeverage = new Whip(darkRoastBeverage);
            System.out.println(darkRoastBeverage.getDescription()+" "+" costs : " + darkRoastBeverage.cost());

            Beverage houseBlend = new HouseBlend();
            houseBlend = new Soy(houseBlend);
            houseBlend = new Mocha(houseBlend);
            houseBlend = new Whip(houseBlend);
            System.out.println(houseBlend.getDescription()+" costs : " + houseBlend.cost());
    }
}
