public class ConvertUpper {
    public static String toUppercase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString()
        ;
    }
    public static void main(String[] args) {
        String str="Hello everyone my name is Anurag chauhan";
        System.out.println(toUppercase(str));
        
        // System.out.println(str.toUpperCase());
        // HELLO EVERYONE MY NAME IS ANURAG CHAUHAN
    }
}
