package Stack;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}


public class stack_linkedList {
    public static Node top;

    public static void push(int data){
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
//        printList();
    }
    public static void printList(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public static void pop(){
        if(top==null){
            return;
        }
        System.out.println(top.data);
        top=top.next;

//        printList();
    }
    public static void peek(){
        if(isEmpty()){
            return;
        }
        System.out.println(top.data);



    }
    public static boolean isEmpty(){
        return top==null;
    }

    public static void main(String[] args) {
        push(10);
        push(5);
        push(2);
        push(1);
//        pop();
        peek();
    }
}
