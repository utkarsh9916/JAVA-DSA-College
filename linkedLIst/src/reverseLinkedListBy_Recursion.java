package linkedLIst.src;

public class reverseLinkedListBy_Recursion {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            

        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
    }

    public static Node reverse(Node head){
        if(head.next==null){
            return head;
        }
        Node newNode =reverse(head.next);
        head.next.next=head;
        head.next=null;

        return newNode;
    }

    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d= new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
       Node ans= reverse(a);
       System.out.println();
        display(ans);


    }
    
}
