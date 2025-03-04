/*time complexity:
 * best case=already sorted=O(n)
 * worst case=O(n^2)
 */
public class optimizedBubble {
    public static void modifiedBubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int arr[]={1,3,2,6,5,4};
        int arr[]={1,2,3,4,5};
        modifiedBubble(arr);
        print(arr);
    }
}
