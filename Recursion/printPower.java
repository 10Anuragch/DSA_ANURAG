public class printPower {
    /* 
    //time complexity -->> O(n)

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
        */

        //Optimized Approach : time complexity -->> O(log n)

        public static int Optimized(int a,int n){
            if(n==0){
                return 1;
            }
            int halfPower=Optimized(a, n/2);
            int halfPowersq=halfPower*halfPower;
            //if n is odd
            if(n%2!=0){
                halfPowersq=a*halfPowersq;
            }
            return halfPowersq;
        }
    public static void main(String[] args) {
        // System.out.println(power(5, 4));        
        System.out.println(Optimized(2, 10));
    }
}
