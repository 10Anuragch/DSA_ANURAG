public class printPower {
    /* 
    //time complexity -->> O(n)

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
            
        return x * power(x,n-1);
    }
        */

        //Optimized Approach : time complexity -->> O(log n)

        public static int Optimized(int x,int n){
            if(n == 0){
                return 1;
            }

            if(x == 0){
                return 0;
            }
            
            int halfPower = Optimized(x, n/2);
            int halfPowerSq = halfPower*halfPower;
            //if n is odd
            if(n % 2 != 0){
                halfPowerSq = x * halfPowerSq;
            }
            return halfPowerSq;
        }
    public static void main(String[] args) {
        // System.out.println(power(5, 4));        
        System.out.println(Optimized(2, 10));
    }
}
