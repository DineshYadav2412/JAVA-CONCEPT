package ATM_Machine_Project;

import java.util.Scanner;

/**
 * ATM
 */
public class ATM {

    float Balance;
    int PIN=8169;


    public void checkpin(){
        System.out.println("Enter Your Pin ");
        Scanner sc = new Scanner(System.in);

        int enterpin = sc.nextInt();

        if(PIN==enterpin){

            menu();
        }
        else{
            System.out.println("Enter a valid pin");
            menu();
        }
    }

    public void menu(){

System.out.println("=========================================");
System.out.println("-----------> Wlecome To ATM <------------ ");
System.out.println("=========================================");
System.out.println();

        System.out.println("Enter Your Choice ");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Balance");
        System.out.println("3. Deposite Money");
        System.out.println("4. Exit");

        System.out.println();
        System.out.println("=========================================");
        Scanner sc= new Scanner(System.in);
        int opt = sc.nextInt();
        
        if (opt==1) {
            CheckBalance();
        }
        else if (opt==2) {
            WithdrawMoney();
            
        }
        else if (opt==3) {
            DepositMoney();
        }
        else if (opt==4) {
            return;
        }
        else{
            System.out.println("Enter Aa Valid Choice ");
        }

    }

    public void CheckBalance(){
        System.out.println("Balance: "+Balance);
        menu();
    }

    public void WithdrawMoney(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc= new Scanner(System.in);
        float amount = sc.nextInt();
        if (amount>Balance) {
            System.out.println("Insufficient Balance you have");
        }
        else{
            Balance= Balance-amount;

            System.out.println("Money Withdrawl Successful");
        }
        menu();
    }

    public void DepositMoney(){
        System.out.println("Enter money you want to Deposite ");
        Scanner sc = new Scanner(System.in);
        float AddMoney =sc.nextInt();

        Balance = Balance + AddMoney;

        System.out.println("Money Deposited Successfully..");

        menu();
    }
}
