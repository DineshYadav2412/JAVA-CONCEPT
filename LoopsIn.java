
/* -------------> In java we have 4 Loops <----------
 * 
 * 1) for loop
 * 2) while loop
 * 3) do while loop
 * 4) for each loop
 * 
 * To use any loops we have some steps like :-
 * 
 * step 1) Intlization
 * 
 * step 2) Condition
 * 
 * step 3) Increment / decrement
 * 
 */

//  -----------> Example of While Loop <-----------

/* 

public class LoopsIn {
    public static void main(String[] args) {
        int i;
        i=1;  // This is intilization
        while(i<=10){ // This is condition
            System.out.println(i);
            i++; // This is increment
        }
    }
}

*/

// --------------> For Loop <----------------

/* 
// In while loop first condition is checked then loop is execute.


public class LoopsIn {

    public static void main(String[] args) {

      //for(intilization ; condition ; increment )

        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }
}

*/


// -------------------> Do While Loop <--------------

//  While loop mostly we use when we want atlest one execution.
//  In DO WHILE LOOP :-  first loop is execute then condition is checked.

/* 
public class LoopsIn {

    public static void main(String[] args) {
         
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=5);
    }
    
}

*/


// ------------------> For each loop <-------------------

// For each loop :- we are using for collection.

// EXAMPLE :- 

/* 
import java.util.ArrayList;

public class LoopsIn {

    public static void main(String[] args) {
        
        ArrayList<String> mylist=new ArrayList<>();

        mylist.add("Indore");
        mylist.add("Delhi");
        mylist.add("Mumbai");
        mylist.add("Nepla");


        for(String S:mylist){
            System.out.println(S);
        }
        
    }
    
}

*/

// -------------------------------------------------------------------------------------------

import java.util.Scanner;

/**
 * Here i am writing table program
 */

/* 
public class LoopsIn {

    public static void main(String[] args) {
        
        int n;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one number :- ");
        n=sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n+ "x" +i+ "=" +n*i);
        }
    }
    
}

*/


// ----------------------------------------------------------------------------------------------------------

/*

public class LoopsIn {

    public static void main(String[] args) {
        int i,j;

        for(i=1; i<=5; i++){
            for(j=1; j<=3; j++){
                System.out.print(" i="+i+" j="+j+" ");
            }
            System.out.println();
        }
    }
}

*/

/* 
--------------> Output :-

i=1 j=1  i=1 j=2  i=1 j=3 
i=2 j=1  i=2 j=2  i=2 j=3 
i=3 j=1  i=3 j=2  i=3 j=3 
i=4 j=1  i=4 j=2  i=4 j=3 
i=5 j=1  i=5 j=2  i=5 j=3 

*/

// ----------------------------------------------------------------------------------------------

/*
 * Lets code for Star Pattern
 * 
 */


 public class LoopsIn {
 
    public static void main(String[] args) {
        int i,j,n;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number to print STAR ");

        n=sc.nextInt();

        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
 }

 /*  This is output :- 

    Enter number to print STAR 
    5

    *
    **
    ***
    ****
    *****
  
  */