/*Goldman sachs
 * Problem--In a party anyone remain single or make pairs with their friends
 *          each friend can be paired only once find the total no of ways of pairs
 */
public class PairingFriends {
    public static int PairedFriends(int n){
        //base case--if a is single or with his one friend then ans is a or b and (a,b)
        if(n==1 || n==2){
            return n;
        }
        //choice -- single or pair
        int single=PairedFriends(n-1);
        int pair=(n-1)*PairedFriends(n-2);
        return single+pair;
    }
    public static void main(String[] args) {
    System.out.println(PairedFriends(3));
    }
}
