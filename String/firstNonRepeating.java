public class firstNonRepeating {
  public static char FirstNonRepeating(String s){
    int freqArr[]=new int[26];
    for(char c:s.toCharArray()){
      freqArr[c-'a']++;//increase the frequency
    }

    for(char c:s.toCharArray()){
      if(freqArr[c-'a']==1){//if the frequency is 1
        return c;
      }
    }
    return '$';//if no non repeating character
  }
  public static void main(String[] args) {
    String s="abcdbcehalk";
    System.out.println("First Non Repeating Character is: "+FirstNonRepeating(s));
  }
}
