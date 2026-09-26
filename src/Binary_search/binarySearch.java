package Binary_search;

public class binarySearch {
    public static void binary(int[] arr,int target){

        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                System.out.println("element found at index"+mid);
                return;

            }
            else if(arr[mid]>target){
                right=mid-1;

            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                System.out.println("target not found");
            }
        }
    }
    public static void main(String[] args){
        int[] arr={3, 7, 11, 15, 19, 24, 31, 40, 52};
        binary(arr,31);

    }
}
