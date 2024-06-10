

import java.util.Scanner;

public class Odd_Number_1_to_N_Number {

    public static void main(String[] args) {
        
        int n;

        System.out.println("Enter a number ");
        Scanner ref= new Scanner(System.in);

        n=ref.nextInt();

        for (int i = 1; i<=n; i=i+2) {
            System.out.println("Odd Number "+ i+ " ");
        }
    }
}