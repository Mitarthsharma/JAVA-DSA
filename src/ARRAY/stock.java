package ARRAY;

public class stock {
    public static int stock(int[] arr){
        int min=100;
        int max=0;
        int currsum=0;
        for(int i=0;i< arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            currsum=arr[i]-min;
            if(currsum>max){
                max=currsum;
            }

        }
return max;
    }
    public static void main(String[] args){
        int[] arr={7, 1, 5, 3, 6, 4};
        System.out.println(stock(arr));

    }
}
