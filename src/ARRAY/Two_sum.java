package ARRAY;

public class Two_sum {
    public static void Two_sum(int[] num, int target){
        for(int i=0;i< num.length-1;i++){
            for (int j=i+1;j< num.length;j++){
                if(num[i]+num[j]==target){
                    System.out.println("the indices are "+i+" "+j);
                }
            }
        }
    }
    public static void main(String[] args){
        int[] num={2,7,11,15};
        int target=26;
        Two_sum(num,target);

    }
}
