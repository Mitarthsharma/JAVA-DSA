package Linked_List;

public class cycle_firstElement {
    public static Node head;
    public static void firstElem(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                Node entry=head;

               while(slow!=entry){
                   slow=slow.next;
                   entry=entry.next;
               }
                System.out.println("the cycle entry point is :"+slow.data);
               return;

            }
        }
        System.out.println("there is no cycle");
    }
    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node((20));
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next = head.next;
        firstElem();
    }
}
