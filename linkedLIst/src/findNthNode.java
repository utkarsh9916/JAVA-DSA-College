public class findNthNode {
    // find the position of nth node from end of the list
    public static class  Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static Node findNthNode(Node head, int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int pos=size-n;
        temp=head;
        for(int i=0;i<pos;i++){
            temp=temp.next;
        }
        return temp;
    }

    // using d=slow and fast pointer technique
    public static Node findNthNode2(Node head, int n){
        Node slow=head;
        Node fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static Node removeNthNode(Node head, int n){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        int pos=size-n;
        if(n>size){
            System.out.println("Canot remove the node");
            return head;
        }
        if(pos==0){
            return head.next;
        }
        temp=head;
        for(int i=0;i<pos-1;i++){
               temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
    public static Node removeNthNode2(Node head,int n){
        // uing slow and fasy pointer technique
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        int pos=size-n;
        if(n>size){
            System.out.println("Cant able to dlete");
            return head;
        }
        if(pos==0){
            return head.next;
        }
       Node slow=head;
       Node fast=head;
       for(int i=0;i<n;i++){
        fast=fast.next;
       }
       while(fast.next!=null){
               slow=slow.next;
               fast=fast.next;
       }
       slow.next=slow.next.next;
       return head;
       
    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b= new Node(13);
        Node c= new Node(14);
        Node d= new Node(4);
        Node e= new Node(5);
        Node f= new Node(12);
        Node g=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        display(a);
        System.out.println();
        Node ans=findNthNode(a,9);
        System.out.println(ans.data);
        Node ans2=findNthNode(a,2);
        System.out.println(ans2.data);
        Node ans3=removeNthNode(a,9);
        System.out.println(ans3.data);
        display(ans3);  
        System.out.println();
        Node ans4=removeNthNode2(a,6);
        display(ans4);
    }
}
