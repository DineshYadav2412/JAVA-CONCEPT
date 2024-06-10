package Java.Car_Showroom_Project;

import java.util.Scanner;

public class Showroom implements utility{

    String showroom_Name;
    String showroom_Location;
    int Total_Employee;
    int Total_Cars_Stock=0;
    String Manager_Name;


@Override
    public void get_Details(){
        System.out.println("Showroom Name: "+showroom_Name);
        System.out.println("Showroom Location: "+showroom_Location);
        System.out.println("Manager Name "+Manager_Name);
        System.out.println("Total Employees "+Total_Cars_Stock);
    }

@Override
    public void set_Details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================> ENTER SHOWROOM DETAILS <================================================");
        System.out.println();
        System.out.println("Enter Showroom Name: ");
        showroom_Name = sc.nextLine();
        System.out.println("Enter Showroom Location: ");
        showroom_Location = sc.nextLine();
        System.out.println("Enter Total Employees: ");
        Total_Employee = sc.nextInt();
        System.out.println("Enter Total Cars Stock: ");
        Total_Cars_Stock = sc.nextInt();
        System.out.println("Enter Manager Name: ");
        Manager_Name = sc.nextLine();   
    }
}