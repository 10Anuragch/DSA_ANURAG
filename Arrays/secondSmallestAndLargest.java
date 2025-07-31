//find second smallest and largest element of an array
import java.util.Arrays;

public class secondSmallestAndLargest {
    public static int[] smallAndlarge(int arr[]){
        Arrays.sort(arr);
        return new int[]{arr[1],arr[arr.length-2]};
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(smallAndlarge(arr)));
    }
}
