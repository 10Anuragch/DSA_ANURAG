/*print all unique subsequence of a string 
 * 
 * Approach-->> 
 *              1.for this first we find all subsequences by using to conditions to be or not to be
 *              2.second we apply base case condition 
*/

import java.util.*;

public class UniqueSubsequence {
    public static void subsequence(String str,int idx,String newStr,HashSet<String> set){
        //base case 
        if(idx==str.length()){
            if(set.contains(newStr)){
                return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar=str.charAt(idx);
        //each character has to choice to be a part of subsequence and not to be a part of this

        //to be
        subsequence(str, idx+1, newStr+currChar, set);

        //not to be
        subsequence(str, idx+1, newStr, set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        subsequence(str, 0, "", set);
    }
}
