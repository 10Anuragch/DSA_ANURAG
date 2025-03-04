
// package Arraylist;
import java.util.*;

public class multiDimArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            l1.add(i * 1);
            l2.add(i * 2);
            l3.add(i * 3);
        }
        main.add(l1);
        main.add(l2);
        main.add(l3);

        System.out.println(main);
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}
