//find element which occur more than three(k) times

import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        Set<Integer> keySet=map.keySet();
        for(Integer keys:keySet){
            if(map.get(keys)>arr.length/3){
                System.out.println(keys);
            }
        }
    }
}
