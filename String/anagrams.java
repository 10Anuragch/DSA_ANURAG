/*Approach
 * 1.check the length of both strings if both are equal then check other  conditions otherwise not anagrams
 * 2.if length of both are equal then convert both in character array
 * 3.sort both arrays
 * 4.then check equality of both arrays by Arrays.equals(param1,param2)
 * 5.if this is true then anagram otherwise not.
 */
import java.util.Arrays;

public class anagrams{
    public static void main(String []args){

        /* Anagrams Strings: two strings are said to be anagrams if both have have same letters but not on the same order */
        
       String str1= "earth";
       String str2= "Heart";

       //convert both into lowercase so that we don't check condition separetly for lowercase and uppercase

       str1=str1.toLowerCase();
       str2=str2.toLowerCase();

       //check the length is equal or not

       if(str1.length()==str2.length()){

        //convert string into array

        char[] str1Arr=str1.toCharArray();
        char[] str2Arr=str2.toCharArray();

        //sort the strArray

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        //if the sorted strArrays are same or identical then the strinngs are anagrams

        boolean result=Arrays.equals(str1Arr,str2Arr);

        if(result){
            System.out.println(str1+" and "+str2+" are anagrams");
        }
        else{
            System.out.println(str1+" and "+str2+" are not anagrams");
        }
       }
       else{
        System.out.println(str1+" and "+str2+" are not anagrams");
       }
    }
}