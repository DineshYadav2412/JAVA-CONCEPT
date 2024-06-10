
class Aman {
    public void runA(){
        System.out.println("A is running");
    }
}

class Brijesh extends Aman{
    public void runB(){
        System.out.println("B is running");
    }
}

class Chinmay extends Aman{
    public void runC(){
        System.out.println("C is running");
    }
}


public class HierarchicalInheritance {
    public static void main(String[] args) {
       Brijesh b =  new Brijesh();

       b.runA();

       Chinmay c = new Chinmay();

       c.runA();
       
    }
}
