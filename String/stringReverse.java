public class stringReverse {
  public static String reverseString(String str){
    StringBuilder reversed=new StringBuilder(str);
    return reversed.reverse().toString();
  }
  public static void main(String[] args) {
    System.out.println(reverseString("anurag"));
  }
}
