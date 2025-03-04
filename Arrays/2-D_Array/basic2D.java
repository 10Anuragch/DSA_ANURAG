// package 2-D_Array;
import java.util.*;
public class basic2D {
    public static void main(String[] args) {
      int arr[][]=new int[3][3];
      int n=arr.length;
      int m=arr[0].length;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array elements: ");
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
      }
      //output
      System.out.println("Array is : ");
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
    }
}
