package Queue;

public class LinkedList_Queue {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    static class Queue{


        public Node front;
        public Node rear;



        public void add(int data){
            Node newnode=new Node(data);
            if(front==null){

                front=newnode;
                rear=newnode;

            }else{
                rear.next = newnode;
                rear = newnode;}

        }

        public void remove(){
            if(front==null){
                System.out.println("queue is empty");
                return;
            }
            front=front.next;
            if(front==null){
                rear=null;
            }

        }

        public void peek(){
            if(front==null){
                System.out.println("queue is empty");
                return;
            }
            System.out.println(front.data);
        }

        public void printList(){
            Node temp=front;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.remove();
        q.peek();

        q.printList();


    }

}
