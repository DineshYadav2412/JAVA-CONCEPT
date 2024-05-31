import java.util.Scanner;

public class NnaturalNumber {
    
    public static void main(String[] args) {
        int n;

        Scanner ref= new Scanner(System.in);

        System.out.println("Enter a number of term ");
        n=ref.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("The natural number is  "+i);
        }
    }
}
