// Find Occurance of a particular element

public class occurance {
    public static int Occurance(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 4, 2, 6 };
        System.out.println("Occurance = " + Occurance(arr, 2));
    }
}
