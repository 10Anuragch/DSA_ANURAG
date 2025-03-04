
// package Hashing.Hashmap;
import java.util.HashMap;
import java.util.Set;

public class Introduction {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        // HashMap are unordered in java we get data in random order
        hm.put("India", 150);
        hm.put("China", 160);
        hm.put("Usa", 37);
        hm.put("Russia", 29);
        // print hashmap
        System.out.println(hm);
        // get value of key
        System.out.println(hm.get("Usa"));
        // if key not present then it gives null value
        System.out.println(hm.get("USA"));
        System.out.println(hm.get("Pakistan"));
        // it returns true or false for the existence of key
        System.out.println(hm.containsKey("India"));
        // remove
        hm.remove("Russia");

        System.out.println(hm);
        // size
        System.out.println("Size of HashMap: " + hm.size());
        // isEmpty()
        System.out.println(hm.isEmpty());

        // Iteration on HashMap

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        System.out.println(hm.entrySet());

        //---->>> or

        // for(String k:keys){
        // System.out.println("keys="+k+","+"value="+hm.get(k));
        // }
    }
}
