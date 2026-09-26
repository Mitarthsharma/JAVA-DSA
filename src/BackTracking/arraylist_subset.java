package BackTracking;
import java.util.ArrayList;
public class arraylist_subset {
    public static void arraySubset(int[] arr,int i, ArrayList<Integer> curr){
        if(i== arr.length){
            System.out.println(curr);
            return;
        }
        curr.add(arr[i]);
        arraySubset(arr,i+1,curr);
        curr.remove(curr.size() - 1);
        arraySubset(arr,i+1,curr);


    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        ArrayList<Integer> curr = new ArrayList<>();
        arraySubset(arr,0,curr);
    }
}
