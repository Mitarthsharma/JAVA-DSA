package Binary_search;

public class practise {
    public static int first(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        int firstans=-1;
        while(start<=end){

            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                firstans=mid;
                end=mid-1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return firstans;
    }
    public static int last(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        int lastans=-1;
        while(start<=end){

            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                lastans=mid;
                start=mid+1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return lastans;
    }
    public static int count(int[] arr,int target){
        int firstans=first(arr,target);
        int lastans=last(arr,target);
        if(firstans==-1){
            return 0;
        }
        return lastans-firstans+1;
    }
    public static void main(String[] args) {
        int[] arr={2,4,4,4,4,5,6,8};
        int target=4;
        System.out.println(count(arr,target));
    }
}
