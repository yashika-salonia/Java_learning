import java.util.*;
public class intToList {
    public static void main(String[] args) {
        int[] num={1,2,0,0};
        int k=34;
        System.out.println(addToArrayForm(num,k));
    }
        public static List<Integer> addToArrayForm(int[] num, int k) {
            int no=0;
            for(int i=0;i<num.length;i++){
                no=no+num[i]*10^(num.length-i-1);
                System.out.println(no);
            }
//            System.out.println(no);
            no=no+k;
            System.out.println(no);
            List<Integer> ans=new ArrayList<>();
            while(no>0){
                // int tens=10^(num.length-1);
                int dgt=no%10;
                ans.add(dgt);
                dgt=dgt/10;;
                // tens--;
            }
            return ans;
        }
}
