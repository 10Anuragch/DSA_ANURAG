/*Remove duplicates in a string 
 * 
 * where the condition is that the characters in string are small alphabetical
*/

/*Time complexity = O(n) */
public class removeDuplicate {
    public static boolean map[]=new boolean[26];
    public static void RemoveDuplicate(String str,int idx,String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            RemoveDuplicate(str, idx+1, newStr);
        }
        else{
            newStr+=currChar;
            map[currChar-'a']=true;
            RemoveDuplicate(str, idx+1, newStr);
        }
    }
    public static void main(String[] args) {
        String str="abbccda";
        RemoveDuplicate(str, 0, "");
        
    }
}
