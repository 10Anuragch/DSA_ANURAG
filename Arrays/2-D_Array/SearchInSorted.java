/* it is used to find an element in sorted 2D matrix */

//2D array is sorted row wise and column wise

//Time complexity -- O(nlog n)

//this approach is similar as binary search
public class SearchInSorted {
    public static boolean staircaseSearch(int arr[][],int key){
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==key){
                System.out.println("key found at ("+ row +","+col+")");
                return true;
            }
            else if(key<arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}};
        int key = 33;
        // int key=100;
        
        staircaseSearch(arr, key);
    }

}
