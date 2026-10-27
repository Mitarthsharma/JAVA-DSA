package Queue;

public class Array_Queue {

    static class Queue{
        static int[] arr;
        static int size;
        static int rear;

        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        public static void remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];

            }
            rear--;
            System.out.println(front);

        }
        public static void peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            System.out.println(arr[0]);
        }

    }

    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);

        q.peek();

        while (!q.isEmpty()) {
            System.out.println("rear = " + q.rear);
            q.peek();
            q.remove();
        }
    }

}
