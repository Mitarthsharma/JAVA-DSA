package ARRAY;

public class bubble_sort {
    public static void bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
       for(int i=0;i< arr.length;i++){
           System.out.print(arr[i]);
       }
    }
    public static void main(String[] args){
        int[] arr={5,6,1,7,8,2};
        bubble(arr);

    }
}
