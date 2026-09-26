package ARRAY;

public class index_Of {
    public static int index(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==21){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int[] arr={12,5,8,21,7,15};
        System.out.println(index(arr));

    }
}
