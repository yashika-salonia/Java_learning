import java.util.*;
public class TaskScheduling {
    public static void main(String[] args) {
        int[] p={120,110,100,90,80,70,60,50,40,30,20,10,9,8,6,4}; //profits
        int[] d={2,1,3,4,1,2,5,4,3,2,0,7,2,3,4,5}; //deadlines
        ArrayList<Integer> j=new ArrayList<Integer>();
        TaskSchedule(d,j,d.length);
    }
    static int count=0;
    static void TaskSchedule(int[] d, ArrayList<Integer> j, int n){
        j.add(0);
        int k=0;
        for(int i=1;i<n;i++){
            count++;
            int r=k;
            count++;
            while (r >= 0 && d[j.get(r)] > d[i] && d[j.get(r)] != r) {
                count++;
                r--;
                count++;
            }
            count++;
            if(r < 0 || (d[j.get(r)] <= d[i] && d[i] > r)) {
                count++;
                j.add(r + 1, i);
                count++;
                k++;
                count++;
            }
            count++;
        }
        count++;
        System.out.print("Scheduled Jobs (indices): ");
        for(int i=0;i<j.size();i++) {
            System.out.print("J" + j.get(i)+" ");
        }
        System.out.println();
        System.out.print("Count: "+count);
    }
}
