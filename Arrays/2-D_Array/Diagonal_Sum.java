public class Diagonal_Sum {
    public static int DiagonalSum(int arr[][]) {
        int sum = 0;

        //// Diagonal sum means sum of both diagonal's elements

        //Brute force approach

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         // condition
        //         if (i == j) {// left diagonal
        //             sum += arr[i][j];
        //         } else if (i + j == arr.length - 1) {// right diagonal
        //             sum += arr[i][j];
        //         }
        //     }
        // }
        // return sum;

        // OR
        //Optimized approach

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            if (i != arr.length - 1 - i)//where i != j
                sum += arr[i][arr.length - i - 1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] ={ 
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        // int arr[][] = { { 1, 1, 3 }, { 1, 1, 1 }, { 1, 1, 1 } };
        System.out.println("Diagonal Sum = " + DiagonalSum(arr));
    }
}
