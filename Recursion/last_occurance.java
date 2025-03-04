public class last_occurance {
    //Iterative Approach
    
    // find last occurance of a particular element
    public static int LastOccurance(int arr[],int key){
      int lastIndex=-1;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
            lastIndex=i;
        }
      }
      return lastIndex;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,2,2,6,7,5,2};
        System.out.println("Last Occurance = "+LastOccurance(arr, 2));
    }
}


