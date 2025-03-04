public class Spiral_Matrix{
    public static void pritnSpiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            //top -- in this we go from starting col to ending col where starting row is fixed
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right -- in this we go from starting row + 1  to ending row where ending column is fixed
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom -- in this we go from ending col - 1 to starting col where ending row is fixed 
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break; 
                } 
                System.out.print(matrix[endRow][j]+" ");
            }
            //left -- in this we go from ending row - 1 to starting row + 1 where starting col is fixed
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                   break; 
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {  
        int matrix[][]={{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                          {13,14,15,16}};
        pritnSpiral(matrix);
    }
}