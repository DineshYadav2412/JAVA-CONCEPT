/*
 * Data Types :- In java there are two types of datatypes
 * 
 * 1) Primitive :- Primitive is also have two types Boolean and Numeric
 * 
 * 2) Non Primitive :- Non Primitive data types are String, Array, Class, Structure etc.
 * 
 */

//  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*-----------------------------------> There are Three Types of Variables -------------------------------------------------------------

1) Local

2) Instance

3) Static


*/

// Example :- 

/* 
public class DataTypes {

    int a=10; // when we creating variable in class it is called INSTANSE VARIABLE.
    static int b=20;  // B is a STATIC VARIAVLE. 

    // Creating Method Addition

    void add(){
        int c=30, d; // This is LOCAL VARIABLE.
        d=a+b+c;  // here we can use the sataic variable it will not give any error.
        System.out.println("Sum of three number is :- "+d);

    }


    void mult(){

        int e=40, f;

        f=a*b*c*e; // Here we can not use C from add() method it will give error.
        f=a*b*e; // Here it will run.

        System.out.println("The multiplication of three number is :- "+f);
    }

    
}*/


/* EXPLANATION OF LOCAL VARIABLE :-

 * 1) LOCAL VARIABLE :- Declaration inside method , constructor or blocks.
 * 
 * 2) SCOPE :- inside method , constructor or block not outside
 * 
 * 3) WHEN VARIABLES GETS ALLOCATED:- When method , constructor or block gets executed variables allocates MEMORY. When gets exits variables distroyed.
 * 
 * 4) STORED MEMORY :- Stack memory 
 * 
 * 5) DEFAULT VALUES :- Doesn't have any default value. Value should be provided before use.
 * 
 * 6) ACCESS SPECIFERS :- Cannot be used with local variables.
 * 
 */



 /* EXPLANATION OF INSTANCE VARIABLE :-

 * 1) DECLARATION :- Inside the class but outside method constructor or blocks.
 * 
 * 2) SCOPE :- Inside all methods , blocks & constructors within a class (not inside the static method )
 * 
 * 3) WHEN VARIABLES GETS ALLOCATED  :- When object is created. Variable is allocated.
 * 
 * 4) STORE MEMORY :- Heap Memory
 * 
 * 5) DEFAULT VALUES :- They have default values like int , 0, boolan-false , object -> null
 * 
 * 6) ACCESS SPECIFERS :- Can be used
 * 
 * 7) HOW TO ACCESS :- It can be called directly.
 * 
*/




/* EXPLANATION OF STATIC VARIABLE :-
 * 
 * 1) DECLARATION :- With STATIC KEYWORD in a class but outside a method , constructor , or block
 * 
 * 2) SCOPE :- Scope is similar to instance variable i.e inside methods, constructor , or block indirectly static.
 * 
 * 3) WHEN VARIABLES GETS ALLOCATED :- When we run program and .CLASS file is loaded variable allocated. When class file gets unloaded variable gets destroyed.
 * 
 * 4) STORE MEMORY :- NON-HEAP MEMORY OR STATIC MEMORY
 * 
 * 5) DEFAULT VALUES :- Similar to instance variables.
 * 
 * 6) ACCESS SPECIFERS :- Can be used
 * 
 *  7) HOW TO ACCESS :- To acces the static variable there is three ways :-
 * 
 * 1) Directly
 * 2) By using class name (A.b)
 * 3) By using object reference name.
 * 
 */


//  PROGRAM EXAMPLE :- 


public class DataTypes{

    int a = 10;
    static int b=25;

    public static void main(String[] args) {
        
        DataTypes obj= new DataTypes();

        System.out.println(obj.a); // Output will be :- 10

        System.out.println(obj.b); // Output will be :- 25

        obj.a=100;
        obj.b=150;

        System.out.println("Now it will change value a= 10 to a=100 "+obj.a);

        System.out.println("Now it will change value b= 25 to b=150 "+obj.b);
        
    }
    
}
