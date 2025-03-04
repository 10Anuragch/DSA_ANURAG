/* count total paths in a maze to move from (0,0) to (n,m) */

public class pathsOfMaze {
    public static int countPaths(int i,int j,int n,int m){
        //at boundry(base case 2)
        if(i==n || j==m){
            return 0;
        }
        //base case 1
        if(i==n-1 && j==m-1){
            return 1;
        }
        //move downwords
        int downPaths=countPaths(i+1, j, n, m);

        //move right
        int rightPaths=countPaths(i, j+1, n, m);

        return downPaths+rightPaths;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        int totalPaths=countPaths(0, 0, n, m);
        System.out.println("Total Paths: "+totalPaths);
    }
}
