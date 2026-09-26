package STRING;

public class anagram {
    public static void anagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            System.out.println("no anagram");
            return;
        }
        int[] freq=new int[26];
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            freq[ch-'a']++;
        }for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            freq[ch-'a']--;
        }
        for (int i=0;i< freq.length;i++){
            if(freq[i]!=0){
                System.out.println("no anagram");
                return;
            }
        }
        System.out.println("anagram");
    }
    public static void main(String[] args) {
        String str1="abcz";
        String str2="cba";
        anagram(str1,str2);

    }
}
