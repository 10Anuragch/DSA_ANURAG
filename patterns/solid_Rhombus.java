public class solid_Rhombus {
    public static void Solid_rhombus(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Solid_rhombus(5);
    }
}

// OUTPUT
/*

    *****
   *****
  *****
 *****
***** 

 */
