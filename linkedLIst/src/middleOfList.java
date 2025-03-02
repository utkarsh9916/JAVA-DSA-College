public class middleOfList {
// find middle of list
public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    // for odd number of elements, return the middle element
    public static Node middle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    // for even number of elements getting roght midle , return the middle element
    public static Node middle_2(Node head){
              Node slow=head;
              Node fast=head;
              while(fast!=null){
                slow=slow.next;
                fast=fast.next.next;
              }
              return slow;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    // for even number for getting left middle
    public static Node middle_3(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    public static void main(String[] args) {
        Node a= new  Node(1);
        Node b=new Node(2);
        Node c= new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        // Node h=new Node(8);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        // g.next=h; 
        display(a);

        // for odd
        Node ans=middle(a);
        System.out.println();
        System.out.println(ans.data);
        // System.out.println();
       
        // for even right middle
        // Node ans2=middle_2(a);
        // System.out.println(ans2.data);

        // for odd right middle
        // Node ans3=middle_3(a);
        // System.out.println(ans3.data);


    }
}
}
