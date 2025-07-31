// package Divide_And_Conquer;

/*Time complexity -->> O(nlogn) 
 *Space complexity -->> O(n) 
*/
public class MergeSort {
    // display function
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int startidx, int endidx) {
        // base case
        if (startidx >= endidx) {
            return;
        }
        // main logic
        int mid = startidx + (endidx - startidx) / 2;
        mergeSort(arr, startidx, mid);// left part
        mergeSort(arr, mid + 1, endidx);// right part
        merge(arr, startidx, mid, endidx);
    }

    // funtion for merging of arrays
    public static void merge(int arr[], int startidx, int mid, int endidx) {
        int temp[] = new int[endidx - startidx + 1];

        int i = startidx;// iterator for left part
        int j = mid + 1;// iterator for right part
        int k = 0;// iterator for temp array

        while (i <= mid && j <= endidx) {
            if (arr[i] < arr[j]) {//if we have to put the element from left part
                temp[k] = arr[i];
                i++;
                k++;
            } else {//if we have to put the element from right part
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right part
        while (j <= endidx) {
            temp[k++] = arr[j++];
        }
        // copy temp to original array
        for (k = 0, i = startidx; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
