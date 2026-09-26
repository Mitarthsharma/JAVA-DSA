package ARRAY;

public class Minimum {
    public static int Min_array(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr={7, 3, 9, 2, 8, 4};
        System.out.println(Min_array(arr));

    }
}
