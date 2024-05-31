import java.util.Scanner;

public class Sum_OF_N_Natural_Numbers {
    public static void main(String[] args) {
        
        int n,sum=0;

        System.out.println("Enter no of term ");

        Scanner ref = new Scanner(System.in);

        n=ref.nextInt();

        for(int i=1; i<=n; i++){
            sum=sum+i;
        }
        System.out.println("ADDITION : "+sum);
    }
}
