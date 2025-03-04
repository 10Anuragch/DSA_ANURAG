/*print keypad combinatons */
/* 
    0 -> .
    1 -> abc
    2 -> def
    3 -> ghi
    4 -> jkl
    5 -> mno
    6 -> pqrs
    7 -> tu
    8 -> vwx
    9 -> yz
*/

public class keyPadCombination {
    public static String []keyPad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};


    public static void printCombinatons(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=keyPad[currChar-'0'];
        
        for(int i=0;i<mapping.length();i++){
            printCombinatons(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="23";
        printCombinatons(str, 0, "");
    }
}
