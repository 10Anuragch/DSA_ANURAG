import java.util.*;
public class reverseString {
    
    /*  time complexity = O(n) */

   public static void PrintReverse(String str,int idx){
    if(idx==0){
        System.out.print(str.charAt(idx));
    }
    else{
        System.out.print(str.charAt(idx));
        PrintReverse(str,idx-1);
    }
   }
   
   
    public static void main(String[] args) {
        System.out.println("Enter the String:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        PrintReverse(str, str.length()-1);
    }
}
