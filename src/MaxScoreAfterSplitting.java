public class MaxScoreAfterSplitting {
    public int maxScore(String s) {
        String str1, str2;
        int count = 0;

        for (int i = 0; i < s.length()-1; i++) {
            int zero = 0;
            int once = 0;
            str1 = s.substring(0, i + 1);
            str2 = s.substring(i + 1);
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == '0') {
                    zero++;
                }
            }
            for (int j = 0; j < str2.length(); j++) {
                if (str2.charAt(j) == '1') {
                    once++;
                }
            }

            if (count < zero + once) {
                count = zero + once;
            }
        }
        return count;
    }
}
