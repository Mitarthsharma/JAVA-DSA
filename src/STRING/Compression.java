package STRING;

public class Compression {
    public static void func(String str){
        StringBuilder result = new StringBuilder();
        int count=1;
        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);


            if(i!=str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;

            }else{
            result.append(ch);
            result.append(count);
            count=1;}



        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String str="aaabbc";
        func(str);

    }
}
