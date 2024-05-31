import java.util.Scanner;

public class oddEvenNumber {
    public static void main(String[] args) {
        int n;
        Scanner ref= new Scanner(System.in);

        System.out.println("Enter any Number : ");

        n=ref.nextInt();

        if (n%2==0) {
            System.out.println("Given number is Even "+n);
        }
        else{
            System.out.println("Given number is Odd "+n);
        }
    }
}
