/*time complexity:
 * worst case=O(n)
 * best case=O(logn)
 * 
 * //Binary search works on sorted array
 */
public class binarySearch {
    public static int Binary_Search(int arr[],int key){
        int start=0,end=arr.length-1;

        while(start<=end){
           int mid=(start+end)/2;
           //comparison
           if(arr[mid]==key){ //found
               return mid;
           }
           if(arr[mid]<key){ //right
               start=mid+1;
           }
           else{ //left
               end=mid-1;
           }
        }
        return -1;         
   }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key=6;

        System.out.println("index for key is: "+Binary_Search(arr, key));
    }
}
