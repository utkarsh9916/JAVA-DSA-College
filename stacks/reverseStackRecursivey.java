package stacks;
import java.util.*;
public class reverseStackRecursivey {
    public static void pushAtBottom(Stack <Integer> st, int num){
        if(st.size()==0){
            st.push(num);
            return;
        }
        int top=st.pop();
        pushAtBottom(st,num);
        st.push(top);
    }
    public static void reversestack(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top=st.pop();
        reversestack(st);
        pushAtBottom(st,top);

    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("Before reverse");
        System.out.println(st);
        System.out.println("After reverse");
        reversestack(st);
        System.out.println(st);
    }
}
