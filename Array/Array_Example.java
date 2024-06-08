package Array;
import java.util.Scanner;

/**
 *  Take an array as input from the user. Search for a given number X and print the index at which it occures. 
 * 
 *  This is Called Linear Search.
 * 
 */

 
public class Array_Example {

    public static void main(String[] args) {
        System.out.println("==> Enter A array Size <==");

        Scanner ref = new Scanner(System.in);
        int size = ref.nextInt();

        int numbers[] = new int[size];
        for(int i=0; i<size; i++){
            numbers[i]=ref.nextInt();
        }

        System.out.println("Which number you want to find ");

        int x =ref.nextInt();
        for(int i=0; i<numbers.length; i++){
            if (numbers[i]==x) {
                System.out.println("The index is "+i);
            }
        }
    }
}