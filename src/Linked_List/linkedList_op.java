package Linked_List;


public class linkedList_op {
    static Node head;

    public static void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int value) {
        Node lastNode = new Node(value);
        if (head == null) {
            head = lastNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = lastNode;

    }

    public static void addAtIndex(int idx, int value) {
        Node newNode = new Node(value);
        if (head == null || idx == 0) {
            addFirst(value);
            return;
        }
        int i = 0;
        Node temp = head;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        System.out.println("first element deleted successfully");
    }

    public static void deleteLast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public static void deleteAtPlace(int value){
        if(head==null){
            return;
        }
        if(head.data==value){
            deleteFirst();
            return;
        }
        Node temp=head;

        while(temp.next!=null && temp.next.data!=value){

            temp=temp.next;
        }
        if(temp.next==null){
            return;
        }
        temp.next=temp.next.next;
    }

    public static void nodeSearch(int value){
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==value){
                System.out.println("element found at index:"+i);
                return;
            }


            temp=temp.next;
            i++;


        }
        System.out.println("element not found");
    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {
//        head.next=new Node(20);
        addFirst(20);
        addFirst(10);
        addLast(30);
        addAtIndex(2, 25);
        nodeSearch(90);
        printList();
    }

}
