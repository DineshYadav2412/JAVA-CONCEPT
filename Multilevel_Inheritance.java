
class A{

    void showA(){
        System.out.println("This is from Class A ");
    }
}

class B extends A{

    void showB(){
        System.out.println("This is from Class B ");
    }
}


class C extends B{

    void showC(){
        System.out.println("This is from Class C ");
    }
}



public class Multilevel_Inheritance {
    
    public static void main(String[] args) {
        
        C obj = new C();

        obj.showA();
        obj.showB();
        obj.showC();

        B obj1 = new B();

        obj1.showA();
        obj1.showB();
        
    }
}
