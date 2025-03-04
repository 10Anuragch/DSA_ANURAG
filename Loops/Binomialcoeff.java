public class Binomialcoeff {

    //factorial of n
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    //Binomial Coefficient -->> nCr = n/(r*(n-r));

    public static void Binomialcoefficient(int n,int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nmr=fact(n-r);
        int bincoeff=fact_n/(fact_r*fact_nmr);
        System.out.println(bincoeff);
    }
    public static void main(String[] args) {
        Binomialcoefficient(5, 2);
    }
}
