package Java;

import java.util.Scanner;

public class Vowel_Or_Consonant {

    public static void main(String[] args) {
        
        char ch;

        System.out.println("Enter one Character ");

        Scanner ref = new Scanner(System.in);

        ch=ref.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){

            System.out.println("The Given character is Vowel "+ch);

        }
        else{
            System.out.println("The Given character is Consonant "+ch);
        }
    }
}
