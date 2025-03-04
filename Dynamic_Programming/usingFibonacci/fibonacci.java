// package usingFibonacci;
public class fibonacci {

    // using recursion-->> Exponential time complexity -- O(2^n)
    
    /*
     * public static int fib(int n) {
     * if (n == 0 || n == 1) {
     * return n;
     * }
     * return fib(n - 1) + fib(n - 2);
     * }
     * 
     * public static void main(String[] args) {
     * int n = 10;
     * for (int i = 0; i < n; i++) {
     * System.out.print(fib(i)+" ");
     * }
     * }
     */


     //using DP-->> Linear time complexity -- O(n+1)

     //using memoization -- in memoization we use recursion
     public static int fib(int n,int f[]){
        if(n==0 || n==1){
            return n;
        }
        if(f[n]!=0){ //fib(n) is already calculated
            return f[n];
        }
        f[n]=fib(n-1,f)+fib(n-2,f);
        return f[n];
     }

     //using tabulation--in tabulation we use iteration

     public static int fibtabulation(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
     }
     public static void main(String[] args) {
        int n=10;

        //using memoization
        int f[]=new int[n+1];
        for(int i=0;i<n;i++){
            System.out.print(fib(i, f)+" ");
        }
        System.out.println();

        System.out.println("using tabulation: ");
        //using tabulation
        for(int i=1;i<n;i++){
            System.out.print(fibtabulation(i)+" ");
        }
     }
}
