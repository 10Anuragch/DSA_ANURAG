import java.util.*;
public class pq{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        // PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());//when we want to reverse order or our logic
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());//1 3 4 7(Elements are extracted into ascending order or based on priority)
            pq.remove();
        }
    }
}