
/*Problem -- >> 
 * >> The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
 * 
 * eg:  arr=[6,8,0,1,3]
 *      o/p=[8,-1,1,3,-1]
 */
import java.util.*;

public class nextGreater {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        // int arr[]={2,3,0,1,9,5};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        // O(n)

        // backword loop
        for (int i = arr.length - 1; i >= 0; i--) {
            // step-1. while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {// jb tk is value se bda na mile tb tk pop krta jau
                s.pop();
            }
            // step-2. if else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;// right side me mujhse bda koi element h hi nhi
            } else {
                nxtGreater[i] = arr[s.peek()];
            }
            // step-3. push in s
            s.push(i);
        }

        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}

// different forms of this question

// --> >1.next greater Right:already we have discussed

// -->> 2.next greater left reverse the first loop as
// for(int i=0;i<=arr.length;i++)

// -->> 3. next smaller right
// remove the greater elements
// while(!s.isEmpty() && arr[s.peek()]>=arr[i])

// -->> 4. next smaller left
// apply both changes as 2 and 3 problem:means reverse the for loop and check
// the condtion for removing greater elements
