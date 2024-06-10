class Bank{
    public void RateOfIntrest(){
        System.out.println("Generally Rate of interest is 5%");
    }
}

class SBI extends Bank{
    @Override
    public void RateOfIntrest(){
        System.out.println("Rate of Interest for SBI is 6.5%");
    }
}

class PNB extends Bank{
    @Override
    public void RateOfIntrest(){
        System.out.println("Rate of Interest for PNB is 6%");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        
        Bank b = new Bank();
        SBI s = new SBI();
        PNB p = new PNB();

        b.RateOfIntrest();
        s.RateOfIntrest();
        p.RateOfIntrest();
    }
}
