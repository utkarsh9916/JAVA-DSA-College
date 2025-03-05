package stacks;
import java.util.*;
public class pushAtBottomUsingRecursion {
    public static void pushAtBottom(Stack <Integer> st,int num){
        if(st.size()==0){
            st.push(num);
               return;
        }
        int top=st.pop();
        pushAtBottom(st,num);
       
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        pushAtBottom(st,200);
        System.out.println(st);
    }
}
