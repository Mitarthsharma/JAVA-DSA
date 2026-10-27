package Stack;

import java.util.Stack;

public class PostFix_Eval {
    public static void eval(String str){
        Stack <Integer> stack=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                stack.push(Character.getNumericValue(ch));
            }
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                int second=stack.pop();

                int first=stack.pop();
                if(ch=='+'){
                    stack.push(first+second);
                }
                if(ch=='-'){
                    stack.push(first-second);
                }
                if(ch=='*'){
                    stack.push(first*second);
                }
                if(ch=='/'){
                    stack.push(first/second);
                }

            }

        }
        System.out.println(stack.peek());
    }

    public static void main(String[] args) {
        String str="562-*";
eval(str);
    }
}
