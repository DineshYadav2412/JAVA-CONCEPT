package Java.Car_Showroom_Project;

import java.util.Scanner;
import java.util.UUID;

public class Employee extends Showroom implements utility{
    
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;

    @Override
    public void get_Details(){
        System.out.println("Employee ID: "+emp_id);
        System.out.println("Employee Name: "+emp_name);
        System.out.println("Employee Age: "+emp_age);
        System.out.println("Employee Department: "+emp_department);
        System.out.println("Showroom Name: "+showroom_Name);
    }

    @Override
    public void set_Details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();  // This is important Part [How to give random ID]
        emp_id = String.valueOf(uuid);
        System.out.println("================================================> ENTER EMPLOYEE DETAILS <================================================");
        System.out.println();
        System.out.println("Enter Employee Name: ");
        emp_name = sc.nextLine();
        System.out.println("Enter Employee Age: ");
        emp_age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Department: ");
        emp_department = sc.nextLine();
        System.out.println("Showroom Name: ");
        showroom_Name = sc.nextLine();
    } 
}
