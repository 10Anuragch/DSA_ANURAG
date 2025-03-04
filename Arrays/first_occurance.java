public class first_occurance {
    //recursive function
    public static int First_Occurance(int arr[],int key,int idx){
        if(idx==arr.length-1){
            return -1;
        }
        if(arr[idx]==key){
            return idx;
        }
        return First_Occurance(arr, key, idx+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,2,2,6,7,5,2};
        System.out.println(First_Occurance(arr, 2, 0));
    }
}
