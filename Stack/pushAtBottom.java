import java.util.*;
public class pushAtBottom {
    //in this we using recursive method in the complexity of O(n)
    public static void PushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        PushAtBottom(s, data);//this is recursive line
        s.push(top);
    }
    public static void main(String[] args) {
       Stack<Integer> s=new Stack<>();
       s.push(1);
       s.push(2);
       s.push(3);

       PushAtBottom(s,4);
       PushAtBottom(s, 70);

       while (!s.isEmpty()) {
        System.out.println(s.pop());
       }
    }
}
