// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
public class ActivitySelectionProblem {
    public static void main(String[] args) {
//         int[] s={1,2,4,5,3};
//         int[] f={3,4,5,6,7};
        int[] s={2,1,7,11,4,3,1,8,4,2,3,4,9,12,23};
        int[] f={4,5,9,12,14,15,17,18,19,20,21,22,23,24,25};
        ActivitySelection(s,f);
    }
    static void ActivitySelection(int[] s, int[] f){
        int count=0;
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(0);
        int i=0;
        for(int j=1;j<s.length;j++){
            count++;
            if(s[j]>=f[i]){
                count++;
                A.add(j);
                count++;
                i=j;
                count++;
            }
            count++;
        }
        count++;
        System.out.println(A);
        System.out.print("Count: "+count);
    }
}