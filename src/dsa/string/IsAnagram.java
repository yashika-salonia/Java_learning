import java.util.Arrays;
import java.util.HashMap;

public class IsAnagram{
    public static void main(String[] args) {
        String str1="var";
        String str2="arv";
        // System.out.println(anagramCheckBySorting(str1, str2));
        // System.out.println(hashMapAnagram(str1, str2));
        System.out.println(optimalAnagram(str1, str2));
    }
    static boolean anagramCheckBySorting(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] s=str1.toCharArray();
        char[] t=str2.toCharArray();
        Arrays.sort(s);
        Arrays.sort(t);
        return Arrays.equals(s, t);
    }

    static boolean hashMapAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> counts= new HashMap<>();
        HashMap<Character, Integer> countt= new HashMap<>();
        for(int i=0;i<s.length();i++){
            counts.put(s.charAt(i), counts.getOrDefault(s.charAt(i), 0)+1);
            countt.put(t.charAt(i), countt.getOrDefault(t.charAt(i), 0)+1);
        }
        return counts.equals(countt);
    }

    static boolean optimalAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int val:count){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}