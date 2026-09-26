package Linked_List;


public class isCycle {
    public static Node head;
    public static void cycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                System.out.println("list has cycle in it");
                return;
            }

        }
        System.out.println("there is no cycle in the list");
    }
    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node((20));
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next = head.next.next;

        cycle();
    }
}
