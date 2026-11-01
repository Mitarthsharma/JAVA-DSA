package Queue;
import java.util.*;
public class Two_Halves {

    public static void func(Queue<Integer> q){
        Queue<Integer> firstQ=new LinkedList<>();
        int size=q.size()/2;
        for(int i=0;i<size;i++){
            firstQ.add(q.remove());
        }
        while(!firstQ.isEmpty()){
            q.add(firstQ.remove());
            q.add(q.remove());
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
        q.add(5);
        q.add(6);
        func(q);

    }

}
