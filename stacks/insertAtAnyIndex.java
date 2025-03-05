package stacks;

import java.util.*;
public class insertAtAnyIndex {
    public static void main(String[] args) {
        Stack <Integer> orignal= new Stack<>();
        Stack <Integer> temp=new Stack<>();  
        orignal.push(10);
        orignal.push(20);
        orignal.push(40);
        orignal.push(50);

         System.out.println(orignal);
        // insert 30 at index 2
        int index=2;
        int element=30;
        while(orignal.size()>index){
            temp.push(orignal.pop());
        }
        System.out.println(orignal);
        // add 30 to orignal array
        orignal.push(element);
        while(temp.size()>0){
            orignal.push(temp.pop());
        }
        System.out.println(orignal);

    }

}
