package BackTracking;

public class recursion_array {

    public static void array(int[] arr,int i){
        if(i== arr.length){
            return;
        }
        System.out.println(arr[i]);
        array(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        array(arr,0);
    }
}
