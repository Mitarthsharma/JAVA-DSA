package STRING;

public class longest_common_prefix {
    public static void func(String[] str){
        String ref=str[0];
        StringBuilder result=new StringBuilder();
        for (int i=0;i<ref.length();i++){
            for(int j=1;j< str.length;j++){
                if(ref.charAt(i)==str[j].charAt(i) && i<str[j].length()){


                }
            }
        }
    }
    public static void main(String[] args) {
        String[] str={"flower","flight","flex"};
    }
}
