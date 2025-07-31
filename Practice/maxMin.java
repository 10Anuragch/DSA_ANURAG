package Practice;

public class maxMin {
    public static void maximumMinimum(int arr[]){
        int  max=arr[0],min=arr[0];
        for(int  i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max: "+max+" ,Min: "+min);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,-1};

        maximumMinimum(arr);
        }
}
