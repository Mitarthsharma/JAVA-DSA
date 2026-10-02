package Linked_List;

public class Circular_addFirst {
    public static Node head;
    public static void addFirst(int data){
        Node newNode=new Node(data);
       newNode.next=head;

       Node temp=head;
       while(temp.next!=null){
           temp=temp.next;
       }
        head=newNode;
       temp.next=head;
       printlist();

    }
    public static void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
addFirst(5);
    }
}
