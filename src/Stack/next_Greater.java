package Stack;

import java.util.Stack;

public class next_Greater {
    public static void nextGL(int[] arr){
        int[] result=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                result[i]=-1;
            }else{
                result[i]=s.peek();}
            s.push(arr[i]);

        }
        for (int j : result) {
            System.out.print(j+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={6,8,0,1,3};
        nextGL(arr);

    }
}
