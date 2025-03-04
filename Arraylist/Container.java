/* problem-->>
 * for given n lines on x-axis,use 2 lines to form a container such that
 * it holds maximum water
 */
import java.util.*;
public class Container{

    //optimized 2 pointer approach -- O(n)
    public static int storeWater(ArrayList<Integer> list){
        int maxWater=0;
        int lp=0;
        int rp=list.size()-1;
        while (lp<rp) {
            //calculate area of water
            int height=Math.min(list.get(lp),list.get(rp));
            int width=rp-lp;
            int currWater=height*width;
            maxWater=Math.max(maxWater,currWater);

            //update ptr
            if(list.get(lp)<list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(storeWater(list));
    }
}