import java.util.Scanner;

public class BinaryToDecimal {
    public static void BinToDec(int binNum){
        int myNum=binNum;
        int pow=0;
        int DecNum=0;
        while(binNum>0){
            int lastDigit = binNum % 10;
            DecNum=DecNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal Number of "+ myNum + " = "+DecNum);
    }
    public static void main(String args[]){
        // BinToDec(1001);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Binary Nummbber: ");
        int binNum=sc.nextInt();
        BinToDec(binNum);

    }
}
