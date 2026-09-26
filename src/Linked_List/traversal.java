package Linked_List;

public class traversal {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        Node newNode=new Node(40);
//        newNode.next=head;
//        head=newNode;
        Node temp=head;


        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        temp=head;
        while(temp!=null){

            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.print("null");
    }
}
