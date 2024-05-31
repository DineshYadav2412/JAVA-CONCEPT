package Java;

import java.util.Scanner;

public class Even_Number_0_To_N_Number {
    
    public static void main(String[] args) {
        
        int n;

        System.out.println("Entre a number ");

        Scanner ref = new Scanner(System.in);

        n=ref.nextInt();

        for(int i=2; i<=n; i=i+2){
            System.out.println("Even Number "+i+" ");
        }
    }
}
