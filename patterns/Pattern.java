public class Pattern {
    public static void main(String[] args) {
        // for(int i=4;i>=1;i--){
        //     for(int j=1;j<=4-1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<5;i++){
        //     for(int j=1;j<5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        for(char i='A';i<='D';i++){
            for(char j='A';j<=i;j++){
                System.out.print(" ");
            }
            for(char j='A';j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// output-->>
/* 
   ****
   ***
   **
   *
*/