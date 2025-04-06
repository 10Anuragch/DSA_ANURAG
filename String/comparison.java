public class comparison {

    public static void main(String[] args) {
        String s1 = "ANURAG";
        String s2 = "ANURAG";
        String s3 = new String("ANURAG");
        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        // Output-->>
        // Strings are equal

        
        if (s1 == s3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        // Output-->>
        // Strings are not equal


        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        //Output-->>
        // Strings are equal
    }
}
