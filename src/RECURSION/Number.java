package RECURSION;

public class Number {
    static void naturalNum(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        naturalNum(n-1);




    }
    public static void main(String[] args) {
        int num=5;
        naturalNum(num);
    }
}
