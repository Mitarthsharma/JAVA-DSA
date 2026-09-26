package Linked_List;

public class list_middle {
    public static Node head;
    public static void middle(){
        if(head==null || head.next==null){

            return;
        }
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("middle is :"+slow.data);
    }
    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node((20));
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
//        head.next.next.next.next=new Node(50);
        middle();

    }
}
