public class findPerm {
     public static void Findperm(String str,String ans){
        //base
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        // recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //"abcde"=> "ab" + "de" = "abde" when we have picked c then we have to remove c from next choices
           String newStr=str.substring(0, i)+str.substring(i+1, str.length());
           Findperm(newStr, ans+curr);
        }
    }
  
    public static void main(String[] args) {
       String str="abc";
       Findperm(str, "");
    }
}
