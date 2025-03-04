// maximum of all subarrays of size k

import java.util.PriorityQueue;

public class SlidingWindow{
    static class Pair implements Comparable<Pair>{//Comparable : for sorting or arrange pairs as high value is at top(front)
        int val;
        int idx;
        public Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }

        @Override
        public int compareTo(Pair p2){
        // ascending: return this.val-p2.val 
        // descending: return p2.val-this.val
        return p2.val-this.val;//jiski value bdi h wo phle aa jaye aur jiski value choti h wo baad me aa jaye
        }
    }
    public static void main(String[] args) { //O(nlogk)
      int arr[]={1,3,-1,-3,5,3,6,7};
      int k=3;
      int res[]=new int[arr.length-k+1];//n-k+1

      PriorityQueue<Pair> pq=new PriorityQueue<>();
      //add 1st window
      for(int i=0;i<k;i++){
        pq.add(new Pair(arr[i],i));
      }
      res[0]=pq.peek().val;

      for(int i=k;i<arr.length;i++){
        while (pq.size()>0 && pq.peek().idx<=(i-k)) {
            pq.remove();
        }
        pq.add(new Pair(arr[i],i));
        res[i-k+1]=pq.peek().val;
      }

      //print result
      for(int i=0;i<res.length;i++){
        System.out.print(res[i]+" ");
      }
      System.out.println();
    }
}