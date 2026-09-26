package Linked_List;

public class removeCycle {
    public static Node head;
    public static void remove(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                Node entry=head;
                while(slow!=entry){

                    slow=slow.next;
                    entry=entry.next;
                }
                Node temp=entry;
                while(temp.next!=entry){
                    temp=temp.next;
                }
                temp.next=null;


            }
        }
        printList();
    }
    public static void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node((20));
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next = head.next;
        remove();
    }
}
