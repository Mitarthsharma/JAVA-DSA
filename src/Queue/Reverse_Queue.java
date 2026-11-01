package Queue;
import java.util.*;


public class Reverse_Queue {

    public static void rev(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        for(int i:q){
            System.out.println(i);
        }


    }

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        rev(q);
    }

}
