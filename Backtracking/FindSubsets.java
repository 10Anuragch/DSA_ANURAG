// package Backtracking;

public class FindSubsets {
    public static void findSubsets(String str,String newStr,int idx){
        //base case
        if(idx==str.length()){//jab sare index cover ho gye ho
            System.out.println(newStr);//print kr do final answer ko
            return;
        }
        //recursive--on this we have choices
        char currChar=str.charAt(idx);//particular index ke character ko find out kro
        
        //index to hmesha bdega ab ye hme dekhna pdega ki sath jana h ya nhi
        findSubsets(str, newStr+currChar, idx+1);//yes
        findSubsets(str, newStr, idx+1);//no
    }
    public static void main(String[] args) {
        String str="abc";
        findSubsets(str, "", 0);
    }
}
