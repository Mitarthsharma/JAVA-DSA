package Linked_List;

public class Double_insertAt {
    public static DoubleNode head;

    public static void insertAt(int idx,int data){
        DoubleNode newNode=new DoubleNode(data);
        DoubleNode temp=head;
        int i=0;
        while(i+1!=idx){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next.prev=newNode;
        newNode.prev=temp;
        temp.next=newNode;
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
        head.next.next.next=new DoubleNode(40);
        head.next.next.next.prev=head.next.next;
        insertAt(2,25);
    }
}
