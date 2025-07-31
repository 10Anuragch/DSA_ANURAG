public class fun {
    // public static void display(int n){
    // System.out.println(n);
    // // this is an recursive function and print 1 infinite times since it has not
    // any base/termination condition
    // display(n);
    // }

    // public static int dis(int count){

    // if(count ==100){
    // return 0;
    // }
    // else{
    // System.out.print(count+" ");
    // count++;
    // dis(count);
    // }
    // return count;
    // }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }
    // print numbers in reverse order

    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);

    }

    public static void main(String[] args) {
        // display(1);
        // dis(0);
        int n = 10;
        printInc(n);
        System.out.println();
        printDec(n);
    }
}