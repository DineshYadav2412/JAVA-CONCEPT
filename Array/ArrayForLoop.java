package Array;

import java.util.ArrayList;

public class ArrayForLoop {
    public static void main(String[] args) {
        
        // This Creating Arraylist 
        ArrayList<String> list  = new ArrayList<String>();

        // Now adding elements in the arraylist
        list.add("Dinesh Yadav");
        list.add("Rajesh Singh");
        list.add("Rahul Kumar");
        list.add("Aman Sharma");
        list.add("Brijesh Yadav");

        System.out.println(list);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
