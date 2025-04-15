// package Arrays;

//count the number of elements strictly greater than the value x.

public class basic {
    public static int greater(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3, 5, 8, 9, 7 };
        int x = 6;
        System.out.println(greater(arr, x));
    }
}
