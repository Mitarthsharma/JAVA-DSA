package ARRAY;

import static java.lang.Math.max;

public class Kadane_algo {
    public static int Max_sub(int[] arr){
        int currsum=0;
        int maxsum=arr[0];
        for(int i=0;i< arr.length;i++){
            currsum+=arr[i];
            maxsum=max(maxsum,currsum);
            if(currsum<0){
                currsum=0;
            }

        }
     return maxsum;
    }
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int result=Max_sub(arr);
        System.out.println("The max sum of sub array is : "+result);

    }
}
