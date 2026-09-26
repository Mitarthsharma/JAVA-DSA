package STRING;

public class reverse {
    public static void reverseString(String a){
        int start=0;
        int end=a.length()-1;
        char[] arr=a.toCharArray();


        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        String str=new String(arr);
        System.out.println(str);
    }
    public static void main(String[] args) {
        String a="hello";
        reverseString(a);

    }
}
