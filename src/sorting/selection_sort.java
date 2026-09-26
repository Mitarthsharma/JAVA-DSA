package sorting;

public class selection_sort {
    public static void selection(int[] arr){
        for(int i=0;i< arr.length;i++){
            int min=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[min]>arr[j]){
                    int temp=arr[min];
                    arr[min]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args){
        int[] arr={5,3,1,6,7,2};
        selection(arr);

    }
}
