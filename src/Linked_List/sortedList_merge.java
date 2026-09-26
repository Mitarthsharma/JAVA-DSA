package Linked_List;

public class sortedList_merge {
    public static Node head1;
    public static Node head2;
    public static Node dummy;
    public static void mergeList(){
        dummy=new Node(0);
        Node p1=head1;
        Node p2=head2;
        Node temp=dummy;
        while(p1!=null && p2!=null){
            if(p1.data< p2.data){
                temp.next=p1;
                p1=p1.next;
            }
            else{
            temp.next=p2;
                p2=p2.next;
            }


            temp=temp.next;
        }
        if(p1==null){
            temp.next=p2;
        }
        else if(p2==null){
            temp.next=p1;
        }
        printList();
    }
    public static void printList(){
        Node temp=dummy.next;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        head1=new Node(10);
        head1.next=new Node(30);
        head2=new Node(20);
        head2.next=new Node(40);
        head2.next.next=new Node(50);
        head2.next.next.next=new Node(60);
        mergeList();


    }
}
