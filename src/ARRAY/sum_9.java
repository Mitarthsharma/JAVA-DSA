package ARRAY;
import java.util.Arrays;

public class sum_9 {
    public static void Sum(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int sum=arr[start]+arr[end];
            if(sum==9){
                System.out.println("the element are:"+start+" "+end);
                start++;
                end--;
            }
            else if(sum<9){
                start++;
            }
            else {
                end--;
            }

        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        Sum(arr);

    }
}
