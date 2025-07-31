//remove all vowels from string 
public class removeVowel {
    public static String removeAllVowel(String str){
        return str.replaceAll("[AEIOUaeiou]", "");

        //  return str.replaceAll("[^a-zA-Z]", "");  //for removel of all characters except alphabet
    }
    public static void main(String[] args) {
        String str="Anurag Chauhan";
        System.out.println(removeAllVowel(str));
    }
}
