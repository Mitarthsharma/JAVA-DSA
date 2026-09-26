package Linked_List;

public class insert_end {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        Node temp=head;
        Node newNode=new Node(30);
        while(temp.next==null){

                temp.next=newNode;


        }
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
