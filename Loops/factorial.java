import java.util.Scanner;
public class factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}
