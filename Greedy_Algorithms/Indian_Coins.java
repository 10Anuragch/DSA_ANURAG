import java.util.*;

public class Indian_Coins{
    public static void main(String[] args) {
        //changes of currency
        Integer coin[]={1,2,5,10,20,50,100,500,1000,2000};
        //sort array in the reverse order
        Arrays.sort(coin,Comparator.reverseOrder());
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the amount: ");
        int amount=sc.nextInt();
        //initialize no of counts of notes
        int countOfCoins=0;

        //create a arraylist to store the notes or coins
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<coin.length;i++){
            if(coin[i]<amount){
                while(coin[i]<=amount){
                    countOfCoins++;
                    ans.add(coin[i]);
                    amount=amount-coin[i];
                }
            }
        }
        System.out.println("Total min coins(changes) of amount = "+countOfCoins);
         for(int i=0;i<ans.size();i++) {
            System.out.print(ans.get(i)+" ");
         }
         System.out.println();
    }
}