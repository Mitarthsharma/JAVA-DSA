package Leet_Code_Easy;

public class String_rev {

    public static void rev(String str){

        if (str.isEmpty()) {
            System.out.println("String is empty");
            return;
        }
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str="hello";
        rev(str);
    }

}
