import java.util.Scanner;

public class StarPartten {
    
    public static void main(String[] args) {
         
        int n;

        System.out.println("Enter Number : ");
        Scanner ref = new Scanner(System.in);

        n=ref.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
