package RECURSION;

public class natural {
    public static void func(int n){
        String str="hello";
        if(n<0){
            return ;
        }
        char ch=str.charAt(n);
        System.out.println(ch);
        func(n-1);


    }
    public static void main(String[] args) {
        func(4);


    }
}
