import java.util.*;
public class linkedHashMap{
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1, "Anurag");
        hm.put(2,"Sachin");
        hm.put(6,"Rishabh");
        hm.put(4,"Vishal");
        hm.put(8, "Uday");
        System.out.println(hm);


        //linkedHashMap maintains order in which data is inserted
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(1, "Anurag");
        lhm.put(9,"Sachin");
        lhm.put(3,"Rishabh");
        lhm.put(4,"Vishal");

        System.out.println(lhm);

        //TreeMap dive sorted data
       TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put( "Anurag",1);
        tm.put("Sachin",2);
        tm.put("Rishabh",3);
        tm.put("Vishal",4);

        System.out.println(tm);
    }
}