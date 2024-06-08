import java.util.Scanner;

public class Find_Greater_Number {
    
    public static void main(String[] args) {
        int b,a;
        System.out.println("Enter a number ");

        Scanner ref= new Scanner(System.in);

        b=ref.nextInt();
        a=ref.nextInt();

        if (a>b) {
            System.out.println("The number is greater then B "+a);
        }
        else{
            System.out.println("The number is greater then A "+b);

        }

    }
}
