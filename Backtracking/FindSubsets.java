// package Backtracking;

public class FindSubsets {
    public static void findSubsets(String str,int idx,String newStr){
        //base case
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        findSubsets(str, idx+1, newStr+currChar);//yes
        findSubsets(str, idx+1, newStr);//no
    }
    public static void main(String[] args) {
        String str="abc";
        findSubsets(str, 0, "");
    }
}
