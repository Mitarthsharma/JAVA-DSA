package Binary_search;

public class celing {
    public static void binary(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(target==arr[mid]){
                System.out.println(mid);
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
        }
        System.out.println(left);
    }
    public static void main(String[] args) {
        int[] arr={2,4,8,10,15,16,18};
        binary(arr,9);
    }
}
