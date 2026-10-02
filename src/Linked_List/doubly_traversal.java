package Linked_List;

public class doubly_traversal {
    public static DoubleNode head;
    public static void forwardTraversal(){
        DoubleNode temp=head;
        System.out.print("Forward Traversal :");
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }
    public static void backwardTraversal(){
        System.out.print("Backward Traversal:");
        DoubleNode temp=head;
        while(temp.next!=null){

            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {

        head=new DoubleNode(10);
        head.next=new DoubleNode(20);
        head.next.prev=head;
        head.next.next=new DoubleNode(30);
        head.next.next.prev=head.next;

        forwardTraversal();
        backwardTraversal();
    }
}
