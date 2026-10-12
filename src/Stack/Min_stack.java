package Stack;
import java.util.Stack;
public class Min_stack {

    static Stack<Integer> currStack=new Stack<>();
    static Stack<Integer> minStack=new Stack<>();

    public static void getMin(){
        if(minStack.isEmpty()){
            return;
        }
        System.out.println(minStack.peek());
    }

    public static void push(int x){



            if(minStack.isEmpty() ){
                minStack.push(x);
                currStack.push(x);
            }
            else if(x<minStack.peek()){
                minStack.push(x);
                currStack.push(x);
            }
            else{
                currStack.push(x);
                minStack.push(minStack.peek());
            }


    }

    public static void pop(){
        if(minStack.isEmpty()){
            return;
        }
        currStack.pop();
        minStack.pop();

    }
    public static void peek(){
        if(currStack.isEmpty()){
            return;
        }
        System.out.println(currStack.peek());
    }

    public static void main(String[] args) {
        push(5);


    }
}
