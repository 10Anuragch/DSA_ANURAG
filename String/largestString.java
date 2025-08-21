<<<<<<< HEAD
/*
 str1.compareTo(str2)
    0:equal
   <0:-ve   str1<str2
   >0:+ve   str1>str2
 */
public class largestString {
    public static void main(String[] args) {
        String fruits[]={"apple","mango","banana","no"};
        //check the largest lexographically
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){//it means str1<str2==>>largest<fruits[i] 
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}
=======
/*
 str1.compareTo(str2)
    0:equal
   <0:-ve   str1<str2
   >0:+ve   str1>str2
 */
public class largestString {
    public static void main(String[] args) {
        String fruits[]={"apple","mango","banana","no"};
        //check the largest lexographically
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){//it means str1<str2==>>largest<fruits[i] 
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}
>>>>>>> babed8a1a8d759d4e2f0df59746336dee78ec939
