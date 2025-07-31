public class PalindromicPattern{

   public static void palindromicPattern(int n){
      for(int i=1;i<=n;i++){
         for(int j=1;j<=n-i;j++){
            System.out.print(" ");
         }
         for(int k=i;k>=1;k--){
            System.out.print(k);
         }
         for(int l=2;l<=i;l++){
            System.out.print(l);
         }
         System.out.println();
      }
   }
    public static void main(String[] args) {
       int n=5;
       palindromicPattern(n);
    }
}


// Output-->>
/*
    1
   212
  32123
 4321234
543212345

 */