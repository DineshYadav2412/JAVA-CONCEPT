/*
 * 1) What is typeCasting?
 * 
 * Ans:- Converting one datatype to another datatype is called typecating.
 * 
 * There is Two type of [TypeCasting]
 * 
 * 1) Implicit typeCasting :- it is automatically performed by the compiler.
 * 
 * 
 * 2) Explicit TypeCasting :- By default the compiler does not allow the explicit typerCasting.
 * 
 * Syntax :- 
 * 
 * double x=10.5 (8 bytes)
 * 
 * int y= (int)x;
 * 
 * 
 */

 /* 
//---------------> Implicit TypeCasting Program for example <------------------

public class TypeCasting {
    
    public static void main(String[] args) {
        
        int a=10;  // int size is [4 bytes]

        System.out.println("Befor miplicit the value of A is : "+a);

        double b=a;  // double size is [8 bytes]

        System.out.println("After implicit value of B is  "+b);
    }
}

*/


// ---------------------------------------------------------------------------------------------------------------------

//---------------> Explicit TypeCasting Program for example <------------------


public class TypeCasting {

    public static void main(String[] args) {
        
        double a=10.5; // 8 bytes

System.out.println("Before explicit the value of A is : "+a);

        int b=(int)a; // 4 bytes

        System.out.println("After Explicit the value of B is : "+ b);
    }
}
