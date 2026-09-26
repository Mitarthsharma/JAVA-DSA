package ARRAY;

public class BuySell_stock {
    public static void func(int[] price){
        int min=10;
        int curr;
        int currprofit;
        int profit = 0;
        for(int i=0;i<price.length;i++){
            curr=price[i];
            if(min>curr){
                min=curr;
            }
            currprofit=curr-min;
            if(profit<currprofit){
                profit=currprofit;
            }


        }
        System.out.println(profit);
    }
    public static void main(String[] args) {
        int[] price={7,1,5,3,6,4};
        func(price);

    }
}
