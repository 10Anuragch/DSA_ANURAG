/* check if an array is sorted(strictly increasing) */

/*Time complexity = O(n) */
public class isSortedArray {
    public static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return isSorted(arr, idx+1);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,99,555,777};
        System.out.println(isSorted(arr, 0));
        
    }
}
