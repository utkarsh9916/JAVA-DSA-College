package stacks;

import java.util.ArrayList;

public class StackImplementationByArray {
    public static class Stack{
        public int arr[]=new int [5];
        public int  idx=0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int peak(){
            if(idx==0){
               System.out.println("stack is empty");
               return -1; 
            }
            return arr[idx-1];

        }
        int pop(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");

            }
            
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else{
                return false;
            }

        }
        boolean isFull(){
            if(arr.length==idx) return true;
            else{
                return false;
            }
        }
       
    }
    public static void main(String[] args) {
            Stack st= new Stack();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            st.push(5);
            st.push(6);
            
            int ans=st.size();
            System.out.println(ans);
            st.display();
           int ans1= st.pop();
           System.out.println();
           System.out.println(ans1);
            st.display();
            System.out.println();
           int ans3= st.peak();
           System.out.println(ans3);

           boolean b1= st.isEmpty();
           System.out.println(b1);

           boolean b2=st.isFull();
           System.out.println(b2);.
           List<Integer> l1=new ArrayList<>();
    }
}
