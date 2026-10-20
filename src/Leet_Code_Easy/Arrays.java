package Leet_Code_Easy;

public class Arrays {
    public static int max(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
          if(arr[i]<min){
              min=arr[i];
          }
        }
        return min;
    }
    public static void moveZeros(int[] arr){

        int e=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[e];
                arr[e]=temp;
                e++;


            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }

    public static void removeDuplicate(int[] arr){
        int j=1;


        for(int i=1;i<arr.length;i++){
           if(arr[i]!=arr[i-1]){
               arr[j]=arr[i];
               j++;

           }
        }
        for(int i=0;i<j;i++){
            System.out.print(arr[i]);
        }

    }

    public static void removeVal(int[] arr,int val){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int k=0;k<j;k++){
            System.out.println(arr[k]);
        }
    }

    public static void rotateArray(int[] arr,int k){

        int[] newArr=new int[arr.length];
        int j=0;

//        for(int i=arr.length-k;i< arr.length;i++){
//            newArr[j]=arr[i];
//            j++;
//
//        }
//        for(int m=0;m<arr.length-k;m++){
//            newArr[j]=arr[m];
//            j++;
//        }
//        for (int i : newArr) {
//            System.out.println(i);
//        }
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
       reverse(arr,k, arr.length-1);
        for (int i : arr) {
            System.out.print(i);
        }


    }
    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static int selLStock(int[] arr){
        int curr=Integer.MAX_VALUE;
        int profit=0;
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            if(curr>arr[i]){
                curr=arr[i];
            }
            profit=arr[i]-curr;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
//        System.out.println(profit);
        return maxProfit;
    }


    public static void maxSub(int[] arr){

        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>maxSum){
                    maxSum=sum;
                }

            }

        }
        System.out.println(maxSum);
    }

    public static void kadane(int[] arr){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<arr[i]){
                sum=arr[i];
            }
            if(maxSum<sum){
                maxSum=sum;
            }
;        }
        System.out.println(maxSum);
    }

    public static int sliding(int[] arr){
        int k=3;
        int currSum=0;
        int maxSum=0;
        for(int i=0;i<arr.length-k;i++){
            currSum=0;
            for(int j=i;j<=i+k-1;j++){
                currSum+=arr[j];
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] arr={2,1,5,2,4,3};
//        System.out.println(max(arr));
//        moveZeros(arr);
//        removeDuplicate(arr);
//        removeVal(arr,3);
//        rotateArray(arr,3);
//        System.out.println(  selLStock(arr));
//        maxSub(arr);
//        kadane(arr);
        System.out.println(sliding(arr));



    }
}
