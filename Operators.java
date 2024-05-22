/*
 * Operators :-  Operators are the special Symobls which perform any
 *               operation on one or more operands.
 * 
 * Now Explanation  C = A + B;
 * 
 * Here A :- is Operands
 *      
 *      + :- iS Operators 
 * 
 * 
 * IN JAVA THERE ARE 50 KEYWORDS
 * 
 * 1) In which 48 Keywords we are using 
 * 
 * 2) Out of 50 Two keywords we are not using that is :- (goto, const)
 * 
 * 3) 3 literals words like (false , true , null )
 * 
 */

/*
 * ---------------------> OPERATORS <--------------
 * 
 * 1) Unary
 * 
 *  ++a
 *  --a
 * 
 * 2) Binary
 * 
 * 3) Ternary
 * 
 *  ?:
 * 
 * 
 *  + * - / % Arithmatical
 * 
 *  > <>= == != Relational
 * 
 *  && || ! Logical
 * 
 * & | Boolean Logical
 * 
 *  & |  ^ ~ << >> >>> Bitwise Operator
 * 
 *  ?: Conditonal Operator
 * 
 * 
 */

//  --------------------------- EXAMPLE ---------------------------------------

/**
 * Operators
 */
public class Operators {

    public static void main(String[] args) {
        System.out.println(20 > 10);
        System.out.println(20 < 10);
        System.out.println(20 == 10);
        System.out.println(20 != 10);

        System.out.println((50 == 20) == (60 > 110));

        /*
         * -----> OutPut <-----
         * 
         * 1) True
         * 2) False
         * 3) Fales
         * 4) True
         * 
         */


         byte a=10;
//      This is typecasting
         a=(byte)(a+1); //Max(int, type of operand, type of second operand)
         System.out.println(a);



         int b=11,c;

         c=++b;  // c=b+1 c=b it will give 11
         c=b++; // c=b c=b+1 it will give 13

         System.out.println(b);
         System.out.println(c);

        //  Logical Operator

        System.out.println(50>10 && 30 >10); // TRUE 
        System.out.println(50>10 && 30 !=10); // TRUE
        System.out.println(50>10 || 30 <10); // TRUE

        byte s=10, k=5;
        System.out.println(++s>20 && ++k>20);   // shot circuit becouse first condition will get true then second condition will not check
        System.out.println(++s>20 & ++k>20);   // output :- 11 AND 6

        System.out.println(s);
        System.out.println(k);

        System.out.println(++s>20 || ++k>20); // This is again short circuit first condition will get true then second condition will not check
        System.out.println(++s>20 | ++k>20);

        System.out.println(s);
        System.out.println(k);


        int x=20, y=30;

        String S;

        S= x>y?"Hello":"Bye";
        System.out.println(S);

        S=x%2==0?"Even":"Odd";

        System.out.println(S);

    }
}


