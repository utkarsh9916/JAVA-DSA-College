package stacks; // Ensure this matches your folder structure

import java.util.Scanner; // Corrected import
import java.util.Stack;

public class stackByCollectionFramework {
    public static void main(String[] args) {
        // Stack<Integer> s = new Stack<>(); // Fixed Stack declaration

        // s.push(10);
        // s.push(20);
        // s.push(30);
        // s.push(40);
        // s.push(50);

        // System.out.println(s);
        // System.out.println(s.pop());
        // System.out.println(s);
        // System.out.println(s.peek());
        // System.out.println(s.search(20));
        // System.out.println(s.search(100));
        Stack <Integer> st= new Stack<>();
        
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.size());

        // print first element 
        // while(st.size()>1){
        //     st.pop();
        // }
        // System.out.println(st.peek());
        // System.out.println(st);

        // how to find stack is empty or not
        System.out.println(st.isEmpty());
        System.out.println(st.size());

        // Q1.copy contents of one stack into another in same order
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number of element to add into stack");
        int n=sc.nextInt();

        Stack <Integer> st1= new Stack <>(); // orignal stack
        Stack <Integer> rv= new Stack<>(); // stack using for copying element
        Stack <Integer> cst= new Stack<>();  // copied stack 
        for(int i=0;i<n;i++){
            System.out.println("Enter the item: "+i);
            int item=sc.nextInt();
            st1.push(item);
        }
        System.out.println(st1);
        while(st1.size()>0){
            rv.push(st1.pop());

        }
        while(rv.size()>0){
            cst.push(rv.pop());
        }
        System.out.println(cst);

    }
}
