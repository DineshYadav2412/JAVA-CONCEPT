//  Example :-  Input A -----> 65


package Java;

import java.util.Scanner;

public class ASCII_Value {
    
    public static void main(String[] args) {
        
        char ch;

        System.out.println("Enter any character ");

        Scanner ref = new Scanner(System.in);

        ch=ref.next().charAt(0);

        int a = ch;

        System.out.println("ASCII Value of "+ch +" is "+ a);


    }
}
