package BackTracking;

public class backtracking_array {
    public static void func(int[] arr,int i,int val){
        if(i== arr.length){
            printFunc(arr);
            return;
        }
        arr[i]=val;
        func(arr,i+1,val+1);
        arr[i]=arr[i]-2;


    }
    public static void printFunc(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr=new int[5];
        func(arr,0,0);
        printFunc(arr);
    }
}
