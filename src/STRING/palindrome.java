package STRING;

public class palindrome {
    public static void palindrome(String a){
        int start=0;
        int end=a.length()-1;
        boolean isTrue=true;
        char[] arr=a.toCharArray();
        for(int i=0;i<a.length()/2;i++){



            if(arr[start]!=arr[end]){
                isTrue=false;
            }

            start++;
            end--;
        }
        if(isTrue==true){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
    public static void main(String[] args) {
        String str="aabaa";
        palindrome(str);

    }
}
