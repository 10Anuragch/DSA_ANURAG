// package Arraylist;
import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(9);
        list.add(0);
        list.add(6);
        System.out.println("Original list");
        System.out.println(list);

        //sorts the list in ascending order
        System.out.println("sorting in asc order");
        Collections.sort(list);
        System.out.println(list);

        //sorts the list in desscending order
        System.out.println("sorting in reverse order");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
         //Comparator are the functions in java that defines the logic that in which way sorting should be
    }
}
