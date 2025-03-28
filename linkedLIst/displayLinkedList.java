package linkedLIst;

public class displayLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        
        }
    }
    public static void display(Node head){
        if(head==null){
            return;
        }
        System.out.println(head.data);
        display(head.next);


    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b= new Node(5);
        Node c= new Node(1);
        Node d=new  Node(2);
        Node e= new Node(2);
        Node f=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;    
        f.next=null;
        display(a);
    }
}
