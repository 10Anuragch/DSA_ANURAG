public class Floyds_Triangle{
   public static void floyds_Triangle(int n){
    int counter=1;
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
    }
   }
    public static void main(String[] args) {
        floyds_Triangle(5);
    }
}

// Output-->>
/*
    1 
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
 */