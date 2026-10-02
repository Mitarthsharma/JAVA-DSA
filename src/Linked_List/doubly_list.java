package Linked_List;
class DoubleNode{
    DoubleNode prev;
    DoubleNode next;
    int data;

    DoubleNode(int data){
        this.data=data;
    }
}
public class doubly_list {
    public static void main(String[] args) {
        DoubleNode head=new DoubleNode(10);
        head.next=new DoubleNode(20);
        head.next.prev=head;
        head.next.next=new DoubleNode(30);
        head.next.next.prev=head.next;



    }
}
