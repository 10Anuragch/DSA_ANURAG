public class stringReverse {
  public static String reverseString(String str){
    StringBuilder sb=new StringBuilder(str);
    return sb.reverse().toString();
  }
  public static void main(String[] args) {
    System.out.println(reverseString("anurag"));
  }
}
