/*Move all x to the end of the string */

/*Time complexity = O(n) */

public class moveString {
    public static void moveAllX(String Str,int idx,int count,String newStr){
        if(idx==Str.length()){
            for(int i=0;i<count;i++){
                newStr+='x';
            }
            System.out.println(newStr);
            return;
        }

        char currChar=Str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveAllX(Str, idx+1, count, newStr);
        }
        else{
            newStr+=currChar; // new String=new String+currChar
            moveAllX(Str, idx+1, count, newStr);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        moveAllX(str, 0, 0, "");
    }
}
