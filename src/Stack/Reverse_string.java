package Stack;

import java.util.Stack;

public class Reverse_string {

    public static void revStr(Stack <Character> s,String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            s.push(ch);

        }
    }

    public static void main(String[] args) {
        Stack <Character> s=new Stack<Character>();
        revStr(s,"HELLO");
        StringBuilder result = new StringBuilder();

        while(!s.isEmpty()){

            char top=s.pop();
            result.append(top);
        }
        System.out.println(result);

    }
}
