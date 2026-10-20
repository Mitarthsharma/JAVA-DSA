package Stack;
import java.util.Stack;
public class Reverse_Stack {
    public static void pushBottom(Stack<Integer> s,int num){
        if(s.isEmpty()){
            s.push(num);
            return;
        }

        int top=s.pop();
        pushBottom(s,num);
        s.push(top);
    }
    public static void revstack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        revstack(s);
        pushBottom(s,top);

    }

    public static void main(String[] args) {
        Stack<Integer>s=new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        revstack(s);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
