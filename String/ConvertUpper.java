public class ConvertUpper {
    public static void toUppercase(String str){
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++){
            char c=arr[i].charAt(0);
            String c1=String.valueOf(c).toUpperCase();
            String sub=arr[i].substring(1);
            System.out.print((c1+sub).trim()+" ");
        }
    }
    public static void main(String[] args) {
        String str="Hello everyone my name is Anurag chauhan";
        toUppercase(str);
        
        // System.out.println(str.toUpperCase());
        // HELLO EVERYONE MY NAME IS ANURAG CHAUHAN
    }
}
