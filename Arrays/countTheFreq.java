import java.util.HashMap;
import java.util.Map;
//count the frequency of each element in an array
public class countTheFreq {
    public static Map<Integer, Integer> countFrequency(int[] arr) { 
    Map<Integer, Integer> freqMap = new HashMap<>(); 
    for (int num : arr) { 
        freqMap.put(num, freqMap.getOrDefault(num, 0) + 1); 
    } 
    return freqMap; 
}
    public static void main(String[] args) {
        int arr[]={1,2,3,1,4,2,5,3,1,6,2,7,1,8};
        System.out.println(countFrequency(arr));
    }
}
