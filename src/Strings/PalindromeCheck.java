package Strings;
public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "annabella";
        boolean ans=isPalindrome(str);

        if(ans){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }

    static boolean isPalindrome(String str){
        boolean b=false;
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
//            System.out.println("1st char: " + str.charAt(i));
//            System.out.println("last char: "+str.charAt(n-i-1));
            if (str.charAt(i) == str.charAt(n-i-1)){
                b=true;
            }
        }
        return b;
    }
}
