// package Hashing.HashSet;
import java.util.*;
public class Implemnetation {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);

        System.out.println(set);

        System.out.println(set.contains(2));

        set.remove(2);

        System.out.println(set.contains(2));


        System.out.println(set.size());

        set.clear();

        System.out.println(set.size());
        

        //***--->>> Iteration on set or any collection framework using Iterator interface

        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"    ");
        }
    }
}
