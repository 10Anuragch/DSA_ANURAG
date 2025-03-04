// package Queue;
import java.util.*;
import java.util.LinkedList;
public class QJCF {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        //Queue is an interface in JCF so we can not create an object for interfaces so we create Queue using LL in JCF
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
