// package Arrays;

public class reverseArray {

    //----With time and space complexity -> O(n)  ---//


    // public static void main(String[] args) {
    //     int arr[]={1,2,3,4,5};
    //     System.out.println("Original Array:     ");
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println("\nReversed Array:   ");
    //     for(int i=arr.length-1;i>=0;i--){
    //         System.out.print(""+arr[i]+" ");
    //     }
    // }



    
    //--- With time complexity - O(n) and space complexity - O(1) or constant

    public static void reverse(int arr[]){
        int first=0;
        int last=arr.length-1;
        while (first<last) {
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        reverse(arr);
        System.out.println("Reversed Array is:  ");
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");

        }
    }
}
