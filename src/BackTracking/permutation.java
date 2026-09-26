package BackTracking;

public class permutation {
    public static void prm(String str,String ans,boolean[] used){
        if(ans.length()==str.length()){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            if(used[i]==false) {
                ans += str.charAt(i);
                used[i] = true;
                prm(str,ans,used);
                ans = ans.substring(0, ans.length() - 1);
                used[i] = false;


            }


        }
    }
    public static void main(String[] args) {
String str="abc";
String ans="";
boolean[] used={false,false,false};
prm(str,ans,used);

    }
}
