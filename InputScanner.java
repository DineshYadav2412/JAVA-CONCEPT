/*
 *  ---------------> Input (Scanner class ) <------------------
 * 
 *  Scanner is a predefined class in java which is available in 
 *  java.util Package. It is used to get user INPUT.
 * 
 *  RULE :- 
 * 
 *  1) If we use Scanner class must have to create object of Scanner class.
 * 
 * Syntax :- 
 * 
 *  Scanner sc =  new Scanner( System.in);
 * 
 *  2) Scanner class methods :-
 * 
 *  1) nextLine();  // String
 *  2) nextInt();   // integer
 *  3) nextFloat(); // floating
 *  4) nextBoolean(); // true or false
 *  5) nextDouble(); // double
 * 
 * 
 *  ---------------------> OutPut (System.out.print()) <---------------------------------------
 * 
 * ==> It is an output statement in java through which we can print the variables 
 *     expression and many more contents.
 * 
 * 
 */

import java.util.Scanner;

public class InputScanner {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter your name ");
        String name=sc.nextLine();

        System.out.println("Your name is "+name);

        int a, b, c;

        System.out.println("Please Enter two numbers ");

        a=sc.nextInt();
        b=sc.nextInt();

        c=a+b;

        System.out.println("The sum of two number is : "+c);
        


    }
}
