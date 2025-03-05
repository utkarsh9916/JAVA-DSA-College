package stacks;
import java.util.*;
public class displayStack {
    public static void main(String[] args) {
        Stack <Integer> st= new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);

        Stack <Integer> temp= new Stack<>();
        // while(st.size()>0){
        //     temp.push(st.pop());
        // }
        // System.out.println(temp);

        // while(temp.size()>0){
        //     System.out.print(temp.peek()+" ");
            
        //     st.push(temp.pop());

        // }
        // System.out.println(st);

        // now implementing using array
        // int n= st.size();
        // int nums[]=new int[n];
        // for(int i=n-1;i>=0;i--){
        //        nums[i]=st.pop();
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(nums[i]+" ");
        //     st.push(nums[i]);
        // }

        //   System.out.println(st);


    //  display using recursion
    displayReverseRecursively(st);
    System.out.println(st);
        
    }     


    // display reverse stack recursvely
      public static void displayReverseRecursively(Stack<Integer> st){
               if(st.size()==0){
                return;}
                int top=st.pop();
                System.out.println(top);
                displayReverseRecursively(st);
                
                st.push(top);
            }

    
}
