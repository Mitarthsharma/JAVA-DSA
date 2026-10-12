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

        for(int i=arr.length-k;i< arr.length;i++){
            newArr[j]=arr[i];
            j++;

        }
        for(int m=0;m<arr.length-k;m++){
            newArr[j]=arr[m];
            j++;
        }
        for (int i : newArr) {
            System.out.println(i);
        }

    }

    public static void main(String[] args){
        int[] arr={1, 2, 3, 4, 5, 6, 7};
//        System.out.println(max(arr));
//        moveZeros(arr);
//        removeDuplicate(arr);
//        removeVal(arr,3);
        rotateArray(arr,3);


    }
}
