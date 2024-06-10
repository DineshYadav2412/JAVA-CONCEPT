
class Aadition{
    public  int sum(int a, int b){
        return a+b;
    }

    public  int sum(int a, int b, int c){
        return a+b+c;
    }

    public  String sum(String x, String y){
        return x+y;
    }

}



public class MethodOverloading {
    public static void main(String[] args) {
        Aadition obj = new Aadition();

        System.out.println(obj.sum(5, 5));

        System.out.println(obj.sum(5, 7));

        System.out.println(obj.sum(5, 5, 5));
        
        System.out.println(obj.sum("Dinesh ", "Yadav"));
    }
}
