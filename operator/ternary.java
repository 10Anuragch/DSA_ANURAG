import java.util.Scanner;
public class ternary{
    public static void main(String[] args) {
        System.out.println("Enter marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String status=(marks>=33)?"Pass":"Fail";
        System.out.println(status);
    }
}