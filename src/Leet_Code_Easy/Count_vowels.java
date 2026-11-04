package Leet_Code_Easy;

public class Count_vowels {

    public static void func(String str){

        int vcount=0;
        int ccount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            ch=Character.toLowerCase(ch);

            if(Character.isLetter(ch)){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vcount++;
                }
                else{
                    ccount++;
                }

            }
        }
        System.out.println("Number of vowels is:"+vcount+" and consonents are:"+ccount);
    }

    public static void main(String[] args) {
        String str="hello world";
        func(str);
    }
}
