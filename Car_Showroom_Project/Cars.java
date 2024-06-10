package Java.Car_Showroom_Project;

import java.util.Scanner;

public class Cars extends Showroom implements utility{

    String Car_Name;
    String Car_Color;
    String Car_fuel_type;
    int Car_price;
    String Car_type;
    String Car_transmission;


    @Override
    public void get_Details(){
        System.out.println("Name "+Car_Name);
        System.out.println("Color "+Car_Color);
        System.out.println("Fuel Type "+Car_fuel_type);
        System.out.println("Price "+Car_price);
        System.out.println("Car Type "+Car_type);
        System.out.println("Transmission "+Car_transmission);
    }

    @Override
    public void set_Details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================> ENTER CAR DETAILS <================================================");
        System.out.println();
        System.out.println("Enter Car Name: ");
        Car_Name = sc.nextLine();
        System.out.println("Enter Car Color: ");
        Car_Color = sc.nextLine();
        System.out.println("Enter Fuel Type (PETROL / DIESEL): ");
        Car_fuel_type = sc.nextLine();
        System.out.println("Enter Car Price:");
        Car_price = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Car Type (SEDAN / HATCHBACK / SUV): ");
        Car_type = sc.nextLine();
        System.out.println("Enter Transmission Type (AUTOMATIC / MANUAL): ");
        Car_transmission = sc.nextLine();
        Total_Cars_Stock++;  // When new car will add it will increase the stocks.
    }
    
}
