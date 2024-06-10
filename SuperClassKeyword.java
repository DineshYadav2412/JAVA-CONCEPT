/*
 * ======> Super Keyword <=====
 * 
 * 1) To invoke parent class variable
 * 2) To invoke parent class Method
 * 3) To invoke parent class constructor
 * 
 * 
 */


class Animal{
    String color="White";

}

class Dog extends Animal{
    String color="Black";

    void printColor(){
        System.out.println(color); // Print color of Dog class
        System.out.println(super.color); // Print color of Animal class
    }
}

public class SuperClassKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.printColor();
    }
}
