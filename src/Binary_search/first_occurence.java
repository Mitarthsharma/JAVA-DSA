package Binary_search;

public class first_occurence {
    public static void func(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;

            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }

        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] arr={2,4,4,4,5,7};
        func(arr,4);


    }
}
