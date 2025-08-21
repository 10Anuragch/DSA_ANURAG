import java.util.Arrays;

//..........Merge Two Sorted Array..........//

public class mergeSorted {
    public static int[] mergeTwoSorted(int arr1[], int arr2[]) {
        int res[] = new int[arr1.length + arr2.length];//create a new array
        int i = 0, j = 0, k = 0;//assign each pointer as 0
        while (i < arr1.length && j < arr2.length) {
        if (arr1[i] < arr2[j]) {
        res[k++] = arr1[i++];
        } else {
        res[k++] = arr2[j++];
        }
        }
        while (i < arr1.length) {
        res[k++] = arr1[i++];
        }
        while (j < arr2.length) {
        res[k++] = arr2[j++];
        }
        return res;


        
        // int res[] = new int[arr1.length + arr2.length];
        // int i = 0, j = 0, k = 0;
        // while (i < arr1.length && j < arr2.length) {
        //     if (arr1[i] < arr2[j]) {
        //         res[k] = arr1[i];
        //         k++;
        //         i++;
        //     } else {
        //         res[k] = arr2[j];
        //         k++;
        //         j++;
        //     }
        // }
        // while (i < arr1.length) {
        //     res[k] = arr1[i];
        //     k++;
        //     i++;
        // }
        // while (j < arr2.length) {
        //     res[k] = arr2[j];
        //     k++;
        //     j++;
        // }
        // return res;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 5, 6 };
        int arr2[] = { 4, 7, 8, 11 };
        System.out.println(Arrays.toString(mergeTwoSorted(arr1, arr2)));
    }
}
