/*---------------------------> Decisition Making <----------------------------------

 1) If Statement        :- [ Simple if,  if- else, if else ladder, Nested if ]
 2) Switch Statement    :- []

 */

// --------------------------------------------------------------------------------------------------------------------------------------------------------

/* 
//  Simple If-Statement :- it is used when we want to test a condition.

import java.util.Scanner;

public class DecisitionMaking {
    
    public static void main(String[] args) {
        int a, b;

        System.out.println("Enter two numbers ");
        Scanner sc = new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();
        if (a>b) {

            System.out.println("A is greater then B");
        }
        System.out.println("Thankyou");
    }
}

*/

// ------------------------------------------------------------------------------------------------------------------------------------------------------------

/* 
// If- else Statement :- it is used to execute two statements either if statement or else statement for a single condition.

import java.util.Scanner;

public class DecisitionMaking {

    public static void main(String[] args) {
        int n; 
        System.out.println("Enter a Number ");
        Scanner sc= new Scanner(System.in);

        n=sc.nextInt();

        if(n>=0){
            System.out.println("The number " +n+ " is Positive ");
        }
        else{
            System.out.println("The number " +n+ " is Negative ");
        }
    }
}

*/

// ---------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;

/**
 *  else-if-ladder Statement :- it is used when we have only one if block , multiple else-if block and at last one else block.
 * 
 *

public class DecisitionMaking {

    public static void main(String[] args) {
         
        int marks;

        System.out.println("Enter Marks ");

        Scanner sc = new Scanner(System.in);

        marks = sc.nextInt();

        if (marks>80) {
            System.out.println("Topper");
        }
        else if (marks <80 && marks>=60) {
            System.out.println("First");
        }
      else{
        System.out.println("Fail");
      }
    }
    
}

*/

// ----------------------------------------------------------------------------------------------------------------------------------

/**
 * Nested if-else-Statement :- When we defined if else block , inside this if
 * else block we define another if else block is called Nested if else
 * Statement.
 

public class DecisitionMaking {

    public static void main(String[] args) {

        int a, b, c;

        System.out.println("Enter three number ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("A is greater");
            } else {
                System.out.println("C is greater");
            }
        } else {
            if (b > c) {
                System.out.println("B is greater");
            } else {
                System.out.println("C is greater");
            }
        }

    }
}

*/

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------

/**
 * Switch Statement :- switch is a multiple choice decision making selection
 * statement it is
 * used when we want to select only case out of multiple cases.
 */

public class DecisitionMaking {

    public static void main(String[] args) {

        int a, b, ch;

        System.out.println("enter Two number ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Enter user choice..!");

        ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Sum of two number is " + (a + b));
                break;

            case 2:
                System.out.println("Sub of two number is " + (a - b));
                break;

            case 3:
                System.out.println("Multi of two number is " + (a * b));
                break;

            case 4:
                System.out.println("div of two number is " + (a / b));
                break;

            default:
            System.out.println("Sorry Invalid choice...!");
                break;
        }
    }
}