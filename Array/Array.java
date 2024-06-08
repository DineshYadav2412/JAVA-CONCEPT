package Array;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int marks[] = new int[3];

        marks[0] = 85;
        marks[1] = 90;
        marks[2] = 95;

        // System.out.println(marks[1]);

        // Second Way

        int marks1[] = { 95, 85, 99 };

        for (int i = 0; i < marks1.length; i++) {

            System.out.println("Second method " + marks1[i]);
        }

        System.out.println();

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks is " + marks[i]);
        }

        System.out.println();

        String names[] = new String[5];
        names[0] = "Rahul";
        names[1] = "Raj";
        names[2] = "Rohan";
        names[3] = "Rahul";
        names[4] = "Ramesh";

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name is " + names[i]);
        }

        System.out.println("=========================================================");

        System.out.println();
        System.out.println("Enter Array Size ");
        Scanner ref = new Scanner(System.in);

        int size = ref.nextInt();

        int numbers[] = new int[size];

        // Input 
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ref.nextInt();
        
        }

        // Display
        System.out.println("The Marks is store in the Array is ");
        for (int i = 0; i < size; i++) {
           
            System.out.println("Marks is "+numbers[i]);

           
        }

    }
}
