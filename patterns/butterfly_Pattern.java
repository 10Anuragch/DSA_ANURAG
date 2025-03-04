public class butterfly_Pattern{
    public static void bPattern(int n){
        //upper half

        //1st part
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces 
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half(just reverse of first half)
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        bPattern(n);
    }
}

/* 
OUTPUT-->>

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *


*/