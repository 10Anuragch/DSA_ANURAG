public class firstNonRepeating {
  public static char FirstNonRepeating(String s){
    int freqArr[]=new int[26];
    for(char c:s.toCharArray()){
      freqArr[c-'a']++;
    }

    for(char c:s.toCharArray()){
      if(freqArr[c-'a']==1){
        return c;
      }
    }
    return '$';
  }
  public static void main(String[] args) {
    String s="abcdbcehalk";
    System.out.println("First Non Repeating Character is: "+FirstNonRepeating(s));
  }
}
