// package Java;

import java.util.Scanner;

public class Print_Character {
    
    public static void main(String[] args) {
        char ch;

        System.out.println("Enter a character ");

        Scanner ref= new Scanner(System.in);

        ch=ref.next().charAt(5);

        System.out.println(ch);
    }
}
