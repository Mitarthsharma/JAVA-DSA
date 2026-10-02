package Linked_List;

public class Circular_ll {
    public static Node head;
    public static void printList(){
        Node temp=head;
        do{
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        while(temp!=head);





    }
    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=head;
        printList();
    }
}
