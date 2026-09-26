package STRING;

public class frequency {
    public static void freq(String str){
        int[] freq=new int[26];
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch-'a']++;

        }
        for (int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                System.out.println((char)('a' + i) + ":" + freq[i]);
            }
        }
    }
    public static void main(String[] args) {
        String str="banana";
        freq(str);
    }
}
