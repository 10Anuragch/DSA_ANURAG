// package usingFibonacci;
// problem statement -- we have n numbers of stairs and we can climb
//  only one stairs at a time or two stairs at a time then count the ways


// using memoization -->>  O(n) || while using recursion-->>O(2^n)
//Memoization
import java.util.Arrays;
public class climbingUpstairs {
    public static int countWays(int n,int ways[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n]!=-1){
            return ways[n];
        }
        ways[n]=countWays(n-1,ways)+countWays(n-2,ways);
        return ways[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);//fill the ways array with -1 at each index
        System.out.println(countWays(n,ways));
    }
}
