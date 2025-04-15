/*Problem:-->> Capitalize the first letter of each word of string */
/*Approah:-->>
 * 1.Create an array of String as split arr by space
 * 2.Iterate array
 * 3.take a character variable c which is the first letter of each word
 * 4.take a string variable c1 which capitalize the value of c by using touppercase()
 * 5.take a String variable sub which is the substring of each index of array
 * 6.concatenate the string c1 and sub
 */
public class capitalize_First{

    public static void capitalizeFirst(String str){
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++){
            char c=arr[i].charAt(0);
            String s1=String.valueOf(c).toUpperCase();
            String sub=arr[i].substring(1).toLowerCase();//** .toLowerCase() can be used if we have uppercase letters in our string and want to convert them in lower case.
            System.out.print((s1+sub).trim()+" ");
        }
    }
    public static void main(String[] args) {
        String str="my name is Anurag chaUhan";
        capitalizeFirst(str);
    }
}