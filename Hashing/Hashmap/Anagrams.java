import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1="Race";
        String str2="Care";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length()){
           char[] Arr1=str1.toCharArray();
           char[] Arr2=str2.toCharArray();

           Arrays.sort(Arr1);
           Arrays.sort(Arr2);

           boolean result=Arrays.equals(Arr1, Arr2);

           if(result==true){
            System.out.println("Anagrams");
           }
           else{
            System.out.println("Not Anagrams");
           }
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}
