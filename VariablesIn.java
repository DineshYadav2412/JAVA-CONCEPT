/*   -------------> JAVA VARIABLE <------------
 *
 *  How many types of variable in Java ?
 * 
 * Three types of variable in java :-
 * 
 * 1) Local
 * 
 * 2) Static
 * 
 * 3) Instance 
 * 
 */

 /*
  * Local Variable :- A variable which is declared inside the body of the method or method parameter called local variable.
  *
  * Syntax :-
  
  void fun(){

    int x; // local variable declare inside the method.
  }
  */


/*
 * Instance Variable :-  A variable which is declare inside the class but outside of all the methods called instance variable.
 * 
 *  Syntax :- 
 
  Class A {

    int a; // Instance Variable

    public static void main (String args[]){

    }
  }
  
 
 */



 /*
  *  Static Variable :- A variable which is declared with the help of static keyword called static variable.

  * Syntax :-  Static int D=5;

  */
/*

  public class VariablesIn {
  
    static int b=20; // Static Variable

    int c=30;  // Instance Variable

    public static void main(String[] args) {
        
        int a=10; // Local Variable

        System.out.println(a);

        // --------------------- Static Variable --------------------------------


        System.out.println(b); // The Static variable will execute because [ We  are calling static to static ]

        // --------------------- Instance Variable --------------------------------

        VariablesIn obj = new VariablesIn();

        System.out.println(obj.c);  //  To access the c value [ We have can access with the help of reference of create Object. Without object reference we cannot access the c value becaues it is Instance Variable. ]

    }
  }

*/

  // ---------------------------------------------------------------------------------------------



  