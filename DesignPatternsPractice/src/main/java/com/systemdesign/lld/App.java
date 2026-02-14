package com.systemdesign.lld;

import java.util.Scanner;

import com.systemdesign.lld.DecoratorPattern.Beverage;
import com.systemdesign.lld.DecoratorPattern.DarkRoast;
import com.systemdesign.lld.DecoratorPattern.Espresso;
import com.systemdesign.lld.DecoratorPattern.HouseBlend;
import com.systemdesign.lld.DecoratorPattern.Mocha;
import com.systemdesign.lld.DecoratorPattern.Soy;
import com.systemdesign.lld.DecoratorPattern.Whip;
import com.systemdesign.lld.ObserverPattern.WeatherExample.CurrentConditionsDisplay;
import com.systemdesign.lld.ObserverPattern.WeatherExample.WeatherData;
import com.systemdesign.lld.ParkingLotSystem.ParkingLot;
import com.systemdesign.lld.StratergyPattern.BirdExample.Duck;
import com.systemdesign.lld.StratergyPattern.BirdExample.FlyRocketedBehavior;
import com.systemdesign.lld.StratergyPattern.BirdExample.ModelDuck;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World! Choose from the menu to see results of various patterns" );
        System.out.println( "1. Strategy Pattern" );
        System.out.println( "2. Observer Pattern" );
        System.out.println( "3. Parking Lot" );
        System.out.println( "4. Decorator Pattern" );
        System.out.println( "5. Exit" );
        System.out.println( "Enter your choice" );
        Scanner sc = new Scanner(System.in);
        Integer choice = sc.nextInt();

        switch (choice) {
            case 1:
                //Test Strategy Pattern
                System.out.println("Testing Strategy Pattern");
                Duck mallard = new ModelDuck();
                mallard.performFly();
                mallard.performQuack();
                System.out.println("Change the fly behavior at runtime");
                mallard.setFlyBehavior(new FlyRocketedBehavior());
                mallard.performFly();
                mallard.display();
                break;

            case 2:
                //Test Observer Pattern
                System.out.println("Testing Observer Pattern");
                //subject creation
                WeatherData weatherData = new WeatherData();
                //observers creation and registration
                CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
                CurrentConditionsDisplay currentDisplay2 = new CurrentConditionsDisplay(weatherData);
                weatherData.registerObserver(currentDisplay);
                weatherData.registerObserver(currentDisplay2);
                weatherData.setMeasurements(80, 65, 30.4f);
                System.out.println("Display-1 : Weather data changed");
                currentDisplay.display();
                weatherData.setMeasurements(82, 70, 29.2f);
                System.out.println("Display-2 : Weather data changed");
                currentDisplay2.display();
                break;
            case 3:
                //test Parking Lot
                ParkingLot parkingLot = ParkingLot.getInstance();
                Level level1 = new Level(1, 20);
                
                parkingLot.addLevel(new Level(1, 20));
                parkingLot.addLevel(new Level(2, 20));

            // parkingLot.parkVehicle(new Car("ABC123", "Car"));
            
                //parkingLot.parkVehicle(new Truck("XYZ789", "Truck"));
        
            // parkingLot.parkVehicle(new MotorCycle("LMN456", "MotorCycle"));
                break;
            case 4:
                // Testing Decorator Pattern
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
                break;
            default:
                break;
        }
       

        
      
    }
}
