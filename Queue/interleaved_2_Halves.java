//interleaved 2 halves of queue(even length)

import java.util.*;
import java.util.LinkedList;

public class interleaved_2_Halves {
    public static void interLeave(Queue<Integer> q){
        Queue<Integer> firstHalf=new LinkedList<>();
        int size=q.size();

        //add elements of first half into original queue
        for(int i=0;i<size/2;i++){
            firstHalf.add(q.remove());
        }

        //interleaved
        while (!firstHalf.isEmpty()) {
            // step1:add elements of first half into original queue
            q.add(firstHalf.remove());
            // step2:add elements of original queue(from front) into original queue(into rear)
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
       Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);
        //print
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
}
