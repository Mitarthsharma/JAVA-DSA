package ARRAY;

public class Binary_search {
    public static void search(int[] arr,int key){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        while(mid>0){
            if(arr[mid]==key){
                System.out.println("element found at index"+mid);

            }
            if(key>arr[mid]){
                start=mid;
            }
            if(key<arr[mid]){
                end=mid;
            }
            System.out.println("element not found");
        }
    }
    public static void main(String[] args) {
        int[] arr={2,6,7,10,18,20};
        int key=10;
        search(arr,key);

    }
}
