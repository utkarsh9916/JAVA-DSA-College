package stacks;
import java.util.*;
public class removeFromAnyIndex {
    public static void main(String[] args) {
        Stack <Integer> orignal=new Stack <>();
        Stack <Integer> temp=new Stack<>();
        int index=1;
        int element=20;
        orignal.push(10);
        orignal.push(20);
        orignal.push(30);
        orignal.push(40);
        System.out.println(orignal);

        while(orignal.size()-1>index){
               temp.push(orignal.pop());
        }
        orignal.pop();
        while(temp.size()>0){
            orignal.push(temp.pop());
        }
        System.out.println(orignal);

    }
}
