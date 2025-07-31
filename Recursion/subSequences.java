//////>>>>>>>> Most Important <<<<<<<////////


/*print all the subsequences of a string */

//time complexity = O(2^n)

public class subSequences {
    public static void subsequences(String str,int idx,String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        //each character has to choices to be a part of subsequence and not to be a part of this
        char currChar=str.charAt(idx);
        
        //to be
        subsequences(str, idx+1, newStr+currChar);

        //not to be
        subsequences(str, idx+1, newStr);
    }

    public static void main(String[] args) {
        String str="abc";
        subsequences(str, 0, "");
    }
}
