// package Searching;

public class linearSearch {
    public static int linear_search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1; 
    }
   public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9};
    int key=6;
    int index=linear_search(arr, key);
    if(index==-1){
        System.out.println("Not Found");
    }
    else{
        System.out.println("key is found at index: "+index);
    }
   } 
}
