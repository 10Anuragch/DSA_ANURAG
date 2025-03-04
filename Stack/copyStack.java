// package Stack;

import java.util.Stack;
import java.util.Scanner;
public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        //reverse order
        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }


        //copy stack
        Stack<Integer> ct=new Stack<>();
        while(rt.size()>0){
            ct.push(rt.pop());
        }
        System.out.println(ct);


        //this is a code for push the element in the same stack in the reverse order : O(n)
        while(ct.size()>0){
            st.push(ct.pop());
        }
        System.out.println(st);
    }
}
