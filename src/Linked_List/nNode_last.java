package Linked_List;

public class nNode_last {
    public static Node head;
    public static void n_lastNode(int n){
        if (head == null) {
            return;
        }
        Node slow=head;
        Node fast=head;
        int i=0;

        while(i!=n){
            if(fast==null){
                return;
            }
            fast=fast.next;
            i++;
        }

        while(fast!=null){

            fast=fast.next;


            slow=slow.next;
        }
        System.out.println("the "+n+" last element is :"+slow.data);
    }
    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node((20));
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        n_lastNode(3);
    }
}
