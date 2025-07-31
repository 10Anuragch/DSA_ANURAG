public class reverse_half_pyramid_Num {
    public static void revHalfNum(int n){
       for(int i=0;i<n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(j);
        }
        System.out.println();
       }
    }
    public static void main(String[] args) {
        revHalfNum(5);
    }
}
//Output-->>
/*
    12345
    1234 
    123  
    12   
    1
 */