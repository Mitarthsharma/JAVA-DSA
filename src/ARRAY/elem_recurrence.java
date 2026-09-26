package ARRAY;


public class elem_recurrence {
    public static int Func(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==7){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr={4, 7, 2, 7, 9, 7, 3};
        System.out.println(Func(arr));

    }
}
