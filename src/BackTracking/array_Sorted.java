package BackTracking;

public class array_Sorted {
    public static boolean arraySort(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){

            return false;

        }
        return arraySort(arr,i+1);



    }
    public static void main(String[] args) {
int[] arr={1,2,4,16,8};
        System.out.println(arraySort(arr,0));

    }
}
