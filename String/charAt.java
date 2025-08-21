public class charAt{
    public static void main(String []args){
        String str="Hello";
        // System.out.println(str.charAt(0));
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
        System.out.println("Length of String is = "+str.length());
    }
}