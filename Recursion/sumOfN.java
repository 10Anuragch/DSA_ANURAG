//sum of n natural numbers: 
public class sumOfN {
  public static int printSum(int n){
    if(n==1){
      return 1;
    }
    return n+printSum(n-1);
  }
  public static void main(String[] args) {
    int n=10;
    System.out.println("Sum of "+n+" natural numbers is: "+printSum(n));
  }
}
