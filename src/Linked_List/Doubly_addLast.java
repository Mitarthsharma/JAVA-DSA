package Linked_List;

public class Doubly_addLast {
    public static DoubleNode head;
    public static void addLast(int data){
        DoubleNode newNode=new DoubleNode(data);
        if(head==null){
            head=newNode;
            return;
        }
        DoubleNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        printList();

    }
    public static void addSecondLast(int data){

        DoubleNode newNode=new DoubleNode(data);
        if(head==null){
            head=newNode;
            return;
        }
        DoubleNode temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next.prev=newNode;
        temp.next=newNode;
        newNode.prev=temp;
        printList();
    }
    public static void printList(){
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
//        addSecondLast(25);
        addLast(40);

    }
}
