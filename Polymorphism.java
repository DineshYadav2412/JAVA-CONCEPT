/*

class OverloadingDemo{
    void sum(int a , int b){
        System.out.println("Sum of two Addition is : "+(a+b));
    }

    void sum(int a , int b , int c){
        System.out.println("Sum of three Addition is : "+(a+b+c));
    }

    void sum(String a , String b){
        System.out.println(a+b);
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();
        obj.sum(500, 150);
        obj.sum(150, 150, 120);
        obj.sum("Dinesh ", "Yadav");
    }
}

*/



class Bank{
    void rateOfInterest(){
        System.out.println("Rate of Interest of Bank is 5%");
    }
}

class SBI extends Bank{
    @Override
    void rateOfInterest(){
        System.out.println("Rate of Interest of SBI is 6%");
    }
}

class PNB extends Bank{
    @Override
    void rateOfInterest(){
        System.out.println("Rate of Interest of PNB is 4.5%");
    }
}

 
public class Polymorphism {

    public static void main(String[] args) {
        Bank obj1 = new Bank();
        SBI obj2 = new SBI();
        PNB obj3 = new PNB();

        obj1.rateOfInterest();
        obj2.rateOfInterest();
        obj3.rateOfInterest();

        Bank ob = new SBI();

        ob.rateOfInterest();
    }
}