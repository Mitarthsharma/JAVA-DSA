package Leet_Code_Easy;

public class Remove_Duplicate {

    public static void removeDuplicate(String str){
        int[] freq=new int[26];
        StringBuilder result=new StringBuilder();
        if(str.isEmpty()){
            System.out.println("String is empty");
            return;
        }
        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);
            if(freq[ch-'a']==0){
                result.append(ch);
                freq[ch-'a']++;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String str="programming";
        removeDuplicate(str);
    }

}
