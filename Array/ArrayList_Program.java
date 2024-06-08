package Array;
import java.util.ArrayList;
public class ArrayList_Program {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        // get elements
        System.out.println(list.get(1)); 



        System.out.println();

        System.out.println("Here String ArrayList ");

        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("Dinesh Yadav");
        list1.add("Rahul");
        list1.add("Sachin");
        list1.add("Ramesh");

        System.out.println(list1);

        System.out.println(list1.get(2));

        list1.add(1,"Ramsundar");

        System.out.println(list1);

        list1.remove(1);
        System.out.println(list1);

        System.out.println(list1.size());

        // Loops
        System.out.println();
        System.out.println();

        for(int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }
        System.out.println();
        System.out.println();

        list1.add(1,"Dinesh Ramsundar Yadav");

        for(int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }
    }
}
