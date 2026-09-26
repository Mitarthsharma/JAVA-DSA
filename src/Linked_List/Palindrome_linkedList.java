package Linked_List;

public class Palindrome_linkedList {
    public static Node head;
    public static void isPalindrom(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
        Node prev=null;
        Node curr=slow.next;
        Node next;
        while(curr!=null){
             next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node temp=head;
        while(prev!=null){
            if(temp.data!= prev.data){
                System.out.println("List is not palindrom");
                return;
            }
            prev=prev.next;
            temp=temp.next;
        }
        System.out.println("List is palindrome");

    }

    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(20);
        head.next.next.next.next=new Node(10);
        isPalindrom();
    }
}
