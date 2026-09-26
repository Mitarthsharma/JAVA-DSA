package STRING;

public class first_non_repeating {
    public static void func(String str){
        int[] freq=new int[26];
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(freq[ch-'a']==1){
                System.out.println(ch);
                return;
            }

        }
    }
    public static void main(String[] args) {
        String str="zabc";
        func(str);
    }
}
