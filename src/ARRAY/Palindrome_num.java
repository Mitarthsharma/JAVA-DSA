package ARRAY;

public class Palindrome_num {
    public static boolean palindrom(int num){
        int reverse=0;
        int original=num;
        while(num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        if(original==reverse){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num=121;
        boolean ans=palindrom(num);
        System.out.println(ans);

    }
}
