// package Arrays;

public class smallestInArray {
    public static int Smallest(int arr[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[]={11,29,31,44,57,65,7,89,9};
        System.out.println("Smallest value is: "+Smallest(arr));
    }    
}
