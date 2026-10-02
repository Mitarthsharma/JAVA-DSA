package Linked_List;

public class Doubly_addFirst {
    public static DoubleNode head;
    public static void addFirst(int data){
        DoubleNode newNode=new DoubleNode(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;


        DoubleNode temp=head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        head=new DoubleNode(10);
        head.next=new DoubleNode(20);
        head.next.prev=head;
        head.next.next=new DoubleNode(30);
        head.next.next.prev=head.next;
        addFirst(5);
    }
}
