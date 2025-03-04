// package Deque;
import java.util.*;
public class implementation {
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        dq.addFirst(1);// 1
        dq.addLast(2);//  1 2
        dq.addFirst(0);// 0 1 2
        dq.addLast(3);//  0 1 2 3
        System.out.println(dq);

        dq.removeFirst();// 1 2 3
        System.out.println(dq);
        
        dq.removeLast();//  1 2
        System.out.println(dq);

        //remove all
        dq.removeAll(dq);//[]
        System.out.println(dq);
    }
}
