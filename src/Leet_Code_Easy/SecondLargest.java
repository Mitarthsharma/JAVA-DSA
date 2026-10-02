package Leet_Code_Easy;

public class SecondLargest {
    public static void func(int[] arr){
        int l=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
            else if(arr[i]>sl){
                sl=arr[i];
            }

        }
        System.out.println("the second largest element is "+sl);

    }
    public static void main(String[] args) {
        int[] arr={12,35,34,10,1};
        func(arr);

    }
}
