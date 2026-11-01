package Queue;

import java.util.Stack;

public class Two_Stack {

    public static void add(Stack<Integer> s1,int data){
        s1.push(data);
    }

    public static int remove(Stack<Integer> s1, Stack<Integer> s2) {
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("Queue");
            return -1;
        }

if(s2.isEmpty()){
        while(!s1.isEmpty()){
            int data=s1.pop();
            s2.push(data);

        }}
int result=s2.pop();
return result;
    }
    public static void main(String[] args) {
        Stack <Integer> s1=new Stack<>();
        Stack <Integer> s2=new Stack<>();
        add(s1,10);
        add(s1,20);
        add(s1,30);

        System.out.println(remove(s1,s2));
        System.out.println(remove(s1,s2));
         add(s1,40);
        System.out.println(remove(s1,s2));
        System.out.println(remove(s1,s2));
    }
}
