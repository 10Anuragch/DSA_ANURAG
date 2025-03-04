// Approach : subtract the nearest values
//for this first sort both arrays

//jis case me absolute differences ka sum minimum hua wahi nikalna h

//Q. find the minimum absolute difference
import java.util.Arrays;

public class minAbsDiff {
    public static void main(String[] args) {
        int A[]={4,1,8,7};
        int B[]={2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff=0;
        for(int i=0;i<A.length;i++){
            minDiff+=Math.abs(A[i]-B[i]);
        }
        System.out.println("Minimum absolute difference of pairs = "+minDiff);
    }
}
