package Stack;
import java.util.Stack;
public class Infix_Postfix {
public static int precedence(char ch){
    if(ch=='+'||ch=='-'){
return 1;
    }
    if(ch=='*'||ch=='/'){
        return 2;
    }
    return 0;
}
public static void postFix(String str){
    StringBuilder result=new StringBuilder();
    Stack <Character> stack=new Stack<>();
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(Character.isLetterOrDigit(ch)){
            result.append(ch);

        }

        if(ch=='('){
            stack.push(ch);
        }
        if(ch==')'){
            while (!stack.isEmpty()&&stack.peek()!='('){
                result.append(stack.pop());
            }
        }
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            while(!stack.isEmpty()&&stack.peek()!=')'&&precedence(ch)<precedence(stack.peek())){
                result.append(stack.pop());
            }
            stack.push(ch);
        }

    }
    while (!stack.isEmpty()) {
        result.append(stack.pop());
    }
    System.out.println(result.toString());
}

    public static void main(String[] args) {
        String str="a+b*c";
        postFix(str);
    }

}
