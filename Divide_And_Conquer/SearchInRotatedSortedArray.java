/*Search any element in rotated sorted array */
public class SearchInRotatedSortedArray {
    public static int search(int arr[],int key,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        //case found
        if(arr[mid]==key){
            return mid;
        }
        //mid on L1
        if(arr[start]<=arr[mid]){
            //case a:Left
            if(arr[start]<=key&&key<=arr[mid]){
                return search(arr,key,start,mid-1);
            }else{
                //case b:
                return search(arr, key, mid+1, end);
            }
        }
        //mid on L2
        else{
            //case c:right
            if(arr[mid]<=key&&key<=arr[end]){
                return search(arr,key,mid+1,end);
            }else{
                //case d:left
                return search(arr,key,start,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int taridx=search(arr, target, 0, arr.length-1);
        System.out.println(taridx);
    }
}
