public class Pattern {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // output-->>
        /* 
        ****
         ***
          **
           *
        */

        System.out.println();

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // output-->>
        /* 
            *
           **
          ***
         ****
        */
        System.out.println();

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // output-->>
        /*
           *
           **
           ***
           ****
         */
        System.out.println();

        for (int i = 4; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        // output-->
        /*
         ****
         ***
         **
         *
        */
        
        // for(char i='A';i<='D';i++){
        // for(char j='A';j<=i;j++){
        // System.out.print(" ");
        // }
        // for(char j='A';j<=i;j++){
        // System.out.print(j);
        // }
        // System.out.println();
        // }
    }
}

// output-->>
/* 
   ****
   ***
   **
   *
*/