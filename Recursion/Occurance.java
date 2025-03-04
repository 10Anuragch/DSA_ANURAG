/*find the first and last occurance of an element in String  */
import java.util.*;
public class Occurance {
    public static int first=-1;
    public static int last=-1;
    public static void PrintOccurance(String str,int idx, char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
       char currChar=str.charAt(idx);
       if(currChar==element){
        if(first==-1){
            first=idx;
        }else{
            last=idx;
        }
       }
       PrintOccurance(str, idx+1, element);

}
    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        PrintOccurance(str,0 ,'a');
    }
}
