package Linked_List;

public class Remove_duplicate {
    public static Node head;
    public static void remDuplicate(){
        Node temp=head;
        while(temp.next!=null){

            if(temp.data==temp.next.data){
                temp.next=temp.next.next;

            }

            else{

                temp=temp.next;
            }

        }
        Node temp1 = head;

        while(temp1 != null){
            System.out.print(temp1.data + "->");
            temp1 = temp1.next;
        }

        System.out.println("null");
    }
    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(20);
        head.next.next.next=new Node(20);
        head.next.next.next.next=new Node(30);
        remDuplicate();

    }
}
