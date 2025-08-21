<<<<<<< HEAD
// package Arrays;

public class Max_subArraya_Sum {
    // public static void Max_subArray_Sum(int arr[]){

    // ------1st way with time complexity O(n^3)------- (Brute Force Appeoach)

    /*
     * int currSum=0;
     * int maxSum=Integer.MIN_VALUE;
     * for(int i=0;i<arr.length;i++){
     * int start=i;
     * for(int j=i;j<arr.length;j++){
     * int end=j;
     * currSum=0;
     * for(int k=start;k<=end;k++){
     * //SubArray sum
     * currSum+=arr[k];
     * }
     * System.out.println(currSum);
     * if(maxSum<currSum){
     * maxSum=currSum;
     * }
     * }
     * }
     * System.out.println("max sum = "+maxSum);
     * 
     */

    // -----2nd Way (Better Way)------ with time complexity O(n^2) -----(Prefix Sum Approach)
    
    /*
     * int currSum=0;
     * int maxSum=Integer.MIN_VALUE;
     * int prefix[]=new int [arr.length];
     * 
     * prefix[0]=arr[0];
     * 
     * for(int i=1;i<prefix.length;i++){
     * prefix[i]=prefix[i-1]+arr[i];
     * }
     * for(int i=0;i<arr.length;i++){
     * int start=i;
     * for(int j=i;j<arr.length;j++){
     * int end=j;
     * currSum = start==0 ? prefix[end]:prefix[end]-prefix[start-1];
     * 
     * System.out.println(currSum);
     * if(maxSum<currSum){
     * maxSum=currSum;
     * }
     * }
     * }
     * System.out.println("max sum = "+maxSum);
     * }
     */

    // }

    // ------3rd way (Kadane's Algorithm)------
    public static int Max_subArray_Sum(int arr[]) {

        int sum = 0;
        int max_sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max_sum) {
                max_sum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        // int arr[]={9,1,-3,5,-6,17,-9,8};
        System.out.println(Max_subArray_Sum(arr));

    }
}
=======
// package Arrays;

public class Max_subArraya_Sum {
    // public static void Max_subArray_Sum(int arr[]){

    // ------1st way with time complexity O(n^3)------- (Brute Force Appeoach)

    /*
     * int currSum=0;
     * int maxSum=Integer.MIN_VALUE;
     * for(int i=0;i<arr.length;i++){
     * int start=i;
     * for(int j=i;j<arr.length;j++){
     * int end=j;
     * currSum=0;
     * for(int k=start;k<=end;k++){
     * //SubArray sum
     * currSum+=arr[k];
     * }
     * System.out.println(currSum);
     * if(maxSum<currSum){
     * maxSum=currSum;
     * }
     * }
     * }
     * System.out.println("max sum = "+maxSum);
     * 
     */

    // -----2nd Way (Best Way)------ with time complexity O(n^2) -----(Prefix Sum
    // Appeoach)
    /*
     * int currSum=0;
     * int maxSum=Integer.MIN_VALUE;
     * int prefix[]=new int [arr.length];
     * 
     * prefix[0]=arr[0];
     * 
     * for(int i=1;i<prefix.length;i++){
     * prefix[i]=prefix[i-1]+arr[i];
     * }
     * for(int i=0;i<arr.length;i++){
     * int start=i;
     * for(int j=i;j<arr.length;j++){
     * int end=j;
     * currSum = start==0 ? prefix[end]:prefix[end]-prefix[start-1];
     * 
     * System.out.println(currSum);
     * if(maxSum<currSum){
     * maxSum=currSum;
     * }
     * }
     * }
     * System.out.println("max sum = "+maxSum);
     * }
     */

    // }

    // ------3rd way (Kadane's Algorithm)------
    public static int Max_subArray_Sum(int arr[]) {

        int sum = 0;
        int max_sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max_sum) {
                max_sum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        // int arr[]={9,1,-3,5,-6,17,-9,8};
        System.out.println(Max_subArray_Sum(arr));

    }
}
>>>>>>> babed8a1a8d759d4e2f0df59746336dee78ec939
