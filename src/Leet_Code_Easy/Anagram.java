package Leet_Code_Easy;

public class Anagram {

    public static boolean isAnagram(String str1,String str2){
        int[] freq=new int[26];
        if(str1.length()!=str2.length()){
           return false;
        }
        for(int i=0;i<str1.length();i++){
            char ch1=str1.charAt(i);
            freq[ch1-'a']++;
            char ch2=str2.charAt(i);
            freq[ch2-'a']--;

        }

        for(int i=0;i< freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1="silent";
        String str2="listen";
        System.out.println(isAnagram(str1,str2));
    }
}
