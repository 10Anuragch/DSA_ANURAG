import java.util.Scanner;

/*   Time complexity is = O(2^n) */

public class TowerOfHanoi {
    public static void TOH(int n,char A,char B,char C){
        if(n==1){
            System.out.println("Transfer Disk "+n+" from "+A+" to "+C);
            return;
        }
        else{
            TOH(n-1, A, C, B);
            System.out.println("Transfer Disk "+n+" from "+A+" to "+C);
            TOH(n-1, B, A, C);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the no of Disks: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TOH(n,'A','B','C');
    }
}
