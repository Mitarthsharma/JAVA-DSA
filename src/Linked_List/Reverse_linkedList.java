package Linked_List;

public class Reverse_linkedList {
    public static Node head;
    public static void reverseList(){
        Node prev=null;
        Node curr=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;


        }
        head=prev;
        printlist();

    }public static void printlist(){
        Node temp=head;
        while(temp!=null){

            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {

        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        reverseList();

    }
}
