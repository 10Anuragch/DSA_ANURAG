/*  place tiles of 1*m into maze(matrix) of n*m    */
public class PlaceTiles {
    public static int placeTiles(int n,int m){

        //base cases
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //vertically
        int vertPlacement=placeTiles(n-m, m);
        //horizontally
        int horzPlacement=placeTiles(n-1, m);
        //total tiles
        return vertPlacement+horzPlacement;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        int totalPlacement=placeTiles(n, m);
        System.out.println("Total ways of place tiles are: "+totalPlacement);
    }
}
