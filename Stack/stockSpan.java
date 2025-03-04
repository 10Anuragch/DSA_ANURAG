
//Stock span problem --> price<=today's price
//formula -- ( span = i - prevHigh )
import java.util.*;

public class stockSpan {
    public static void StockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();//we solved this question by using stack so we created stack
        span[0] = 1;//1st span (0th day or 0th index)
        s.push(0);

        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];//price of each stock
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();//mujhse bda tb milega jb mujhse chote sare pop ho jayege
            }
            if (s.isEmpty()) {//chote nikalte nikalte mera stack empty to nhi ho gya 
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;//main formula
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };//stocks array from given graph
        int span[] = new int[stocks.length];//array to store span
        StockSpan(stocks, span);

        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i] + " ");
        }
    }
}
