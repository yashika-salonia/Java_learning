public class char_count {
    public static void main(String[] args) {
        int[] str={'a','a','a','b','b','c'};
        int i=0;
        while(i<str.length){
            char curChar=(char) str[i];
            // System.out.println("char: " + curChar);
            int j=i,cnt=0;
            // System.out.println("start i: " + i);
            // System.out.println("start j: " + j);

            while(j<str.length && str[j]==curChar){
                cnt++;
                // System.out.println("count: " + cnt);
                j++;
                // System.out.println("new j: " + j);
            }
            System.out.println(curChar + " " + cnt);
            i=j;
            // System.out.println("updated i: " + i);
            }

    }
}

