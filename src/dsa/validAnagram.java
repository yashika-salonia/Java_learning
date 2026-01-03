class validAnagram {
    public static void main(String[] args) {
        validAnagram va = new validAnagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(va.isAnagramArr(s, t));
        // System.out.println(va.isAnagramHash(s, t));
    }

    public boolean isAnagramArr(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        // edge case if both strings have same length
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (int val : map.values()) {
            if (val != 0)
                return false;
        }
        return true;
    }


    public boolean isAnagramHash(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}