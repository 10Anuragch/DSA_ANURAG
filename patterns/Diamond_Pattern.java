public class Diamond_Pattern {
    public static void diamond_Pattern(int n){
        //outer--1st half
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<((2*i)-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //outer--2nd half(reverse of first half)
        for(int i=n;i>0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<((2*i)-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond_Pattern(4);
    }
}


//Output-->>
/*
       *   
      ***  
     ***** 
    *******
    *******
     ***** 
      ***  
       *
 */