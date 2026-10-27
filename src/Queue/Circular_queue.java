package Queue;

public class Circular_queue {

    static class CircularQueue{
        static int[] arr;
        static int size;
        static int rear;
        static int count;
        static int front;

        CircularQueue(int n){
            arr=new int[n];
            size=n;
            count=0;
            rear=-1;
            front=0;
        }

        public static void add(int data){
            if(count==size){
                System.out.println("Queue is full");
                return;
            }
            rear=(rear+1)%size;
            arr[rear]=data;

            count++;


        }
        public static void remove(){
            if(count==0){
                System.out.println("Queue is empty");
                return;
            }

            int removed=arr[front];
            front=(front+1)%size;
            count--;
            System.out.println("remove element is "+removed);
        }

        public static int peek(){
            if(count==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

    }



    public static void main(String[] args) {
        CircularQueue cq=new CircularQueue(5);
        cq.add(10);
        cq.add(20);
        cq.add(30);

        cq.remove();
        System.out.println(cq.peek());

    }

}
