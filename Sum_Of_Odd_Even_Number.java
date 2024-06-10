// package Java;

import java.util.Scanner;

public class Sum_Of_Odd_Even_Number {

    public static void main(String[] args) {

        int n, i, sum = 0;

        System.out.println("Enter a number ");

        Scanner ref = new Scanner(System.in);

        n = ref.nextInt();

        if (n % 2 == 0) {
            for (i = 0; i <= n; i = i + 2) {
                sum = sum + i;
            }
            System.out.println("Sum of Even Number " + sum);
        } else {
            for (i = 1; i <= n; i = i + 2) {
                sum = sum + i;
            }
            System.out.println("Sum of Odd Number " + sum);
        }
    }
}
