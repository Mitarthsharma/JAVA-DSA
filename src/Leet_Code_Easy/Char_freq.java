package Leet_Code_Easy;

public class Char_freq {

    public static void func(String str){
        int[] freq=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch-'a']++;
        }
        for(int j=0;j< freq.length;j++){
            System.out.println((char)(j+'a')+"->"+freq[j]);
        }
    }

    public static void main(String[] args) {
        String str="abzanxazb";
        func(str);

    }

}
