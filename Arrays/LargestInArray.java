// package Arrays;
// import java.util.*;
public class LargestInArray {
    public static int Largest(int arr[]){
        // int largest=Integer.MIN_VALUE;

        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
     int arr[]={1,2,3,4,5,65,7,89,9};
    // int arr[]={-1,-2,-56,-34,-9};
     System.out.println("Largest value is: "+Largest(arr));
    }
    
}
