package ARRAY;


public class second_largest {
    public static int func(int[] arr){
        int highest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>highest){
                secondHighest=highest;
                highest=arr[i];
            }
            else if(arr[i]>secondHighest && arr[i]!=highest){
                secondHighest=arr[i];
            }
        }
        return secondHighest;
    }
    public static void main(String[] args) {
        int[] arr={10,5,8,20,3,15};
        System.out.println(func(arr));

    }
}
