package Binary_search;

public class floor {
    public static void binary(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                System.out.println(arr[mid]);
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }

        }
        System.out.println(end);
    }
    public static void main(String[] args) {
        int[] arr={2,4,8,10,15,20};
        binary(arr,16);

    }
}
