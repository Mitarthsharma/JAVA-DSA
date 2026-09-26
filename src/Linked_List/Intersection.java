package Linked_List;

public class Intersection {
    public static Node head;
    public static Node head1;
    public static void intersectionList(){
        Node p1=head;
        Node p2=head1;
        Node temp=head;
        int l1=0;
        while(temp!=null){
            l1++;
            temp=temp.next;
        }
        Node temp1=head1;
        int l2=0;
        while(temp1!=null){
            l2++;
            temp1=temp1.next;
        }
        int c=l1-l2;
        int diff=Math.abs(c);
        if(l1>l2){
            for(int i=0;i<diff;i++){
                p1=p1.next;
            }

        }else{
            for(int i=0;i<diff;i++){
                p2=p2.next;
            }
        }

        while(p1!=null && p2!=null){
            if(p1==p2){
                System.out.println("there is an intersection at :"+p1.data);
                return;
            }
            p1=p1.next;
            p2=p2.next;
        }
        System.out.println("there is no intersection");

    }

    public static void main(String[] args) {
        head=new Node(5);
        head.next=new Node(30);
        head.next.next=new Node(40);

        head1=new Node(10);
        head1.next=new Node(20);
        head1.next.next=new Node(25);
        head1.next.next.next=head.next;

        intersectionList();

    }
}
