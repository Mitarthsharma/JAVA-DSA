package sorting;

public class quick_sort {

    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pivotIndex=partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }

    }
    public static int partition(int[] arr,int low,int high){
        int i=low-1;
        int pivot=arr[high];
        for(int j=low;j<arr.length-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;

        return i;
    }
    public static void main(String[] args) {
        int[] arr={5,2,8,1,3};
            quickSort(arr,0, arr.length-1);
            for(int x:arr){
                System.out.print(x+"");
            }
    }
}
