package STRING;

public class duplicate {
    public static void duplicate(String str){
        int[] freq=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch-'a']++;
        }
        for (int i=0;i<freq.length;i++){
            if(freq[i]>1){
                System.out.println((char)('a'+i));
            }
        }
    }
    public static void main(String[] args) {
        String str="programming";
        duplicate(str);

    }
}
