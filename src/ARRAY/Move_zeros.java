package ARRAY;
import java.util.Arrays;
public class Move_zeros {
    public static void Swap(int[] arr){
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }


        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={6,0,1,0,3,12};
        Swap(arr);
    }
}
