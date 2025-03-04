// package Divide_And_Conquer;
/*Time complexity -->> Average case:O(nlogn) & Worst case -->> O(n^2)
 * Space complexity -->> O(1)
 * this have no need to take more memory pr extra space
*/

/*Approache:-->>
1.Pivot(last element)
2.Partition(parts)
3.Quick Sort(Left part)
4.Quick Sort(Right part)
 */

//M.IMP -->> The worst case occurs when array is already sorted and pivot is starting and ending element 
public class QuickSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //recursive function
    public static void quickSort(int arr[],int p,int r){
        if(p>=r){
            return;
        }
        //last element
        int q=partition(arr,p,r);
        quickSort(arr, p, q-1);//left part
        quickSort(arr, q+1, r);//right part
    }
    public static int partition(int arr[],int p,int r){
        int pivot=arr[r];
        int i=p-1;//to make place for els smaller than pivot

        for(int j=p;j<r;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[r]=arr[i];//pivot=arr[i]
        arr[i]=temp;
        return i;
    }

    // //or

    // public static void printArr(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }

    // //recursive function
    // public static void quickSort(int arr[],int start,int end){
    //     if(start>=end){
    //         return;
    //     }
    //     //last element
    //     int pidx=partition(arr,start,end);
    //     quickSort(arr, start, pidx-1);//left part
    //     quickSort(arr, pidx+1, end);//right part
    // }
    // public static int partition(int arr[],int start,int end){
    //     int pivot=arr[end];
    //     int i=start-1;//to make place for els smaller than pivot

    //     for(int j=start;j<end;j++){
    //         if(arr[j]<=pivot){
    //             i++;
    //             //swap
    //             int temp=arr[j];
    //             arr[j]=arr[i];
    //             arr[i]=temp;
    //         }
    //     }
    //     i++;
    //     int temp=pivot;
    //     arr[end]=arr[i];//pivot=arr[i]
    //     arr[i]=temp;
    //     return i;
    // }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
